package search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	//必须要是已经有序的数组才可用二分法查找
	public static void main(String[] args) {
		int[] arr = { 1, 8, 10, 1000, 1000, 1000, 1234 };
		int index = binarySearch(arr, 0, arr.length - 1, 8);

		if (index == -1) {
			System.out.println("没有找到该数字");
		} else {
			System.out.println("找到了, index为: " + index);
		}
		
		List<Integer> indexIntegers = binarySearch2(arr, 0, arr.length - 1, 1000);
		System.out.println(indexIntegers);
	}

	
	public static int binarySearch(int[] arr, int left, int right, int findVal) {
		if (left > right) {
			return -1;
		}

		int mid = (left + right) / 2;
		int midVal = arr[mid];

		if (findVal > midVal) { // 向右递归
			return binarySearch(arr, mid + 1, right, findVal);
		} else if (findVal < midVal) { // 向左递归
			return binarySearch(arr, left, mid - 1, findVal);
		} else {
			return mid;
		}
	}
	
	//以上方法只能返回第一个数的index，现在用一个数组接收所有的位置index
	public static List<Integer> binarySearch2(int[] arr, int left, int right, int findVal) {
		if (left > right) {
			return new ArrayList<Integer>();
		}
		int mid = (left + right) / 2;
		int midVal = arr[mid];
		
		if (findVal > midVal) { //向右递归
			return binarySearch2(arr, mid + 1, right, findVal);
		} else if (findVal < midVal) { //向左递归
			return binarySearch2(arr, left, mid - 1, findVal);
		} else {
			List<Integer> resIndexList = new ArrayList<Integer>();
			
			int temp = mid - 1;
			while (true) { //向左找
				if (temp < 0 || arr[temp] != findVal) {
					break;
				}
				resIndexList.add(temp);
				temp -= 1;
			}
			resIndexList.add(mid);
			
			temp = mid + 1;
			while (true) { // 向右找
				if (temp > arr.length || arr[temp] != findVal) {
					break;
				}
				resIndexList.add(temp);
				temp += 1;
			}
			return resIndexList;
		}
	}
}









