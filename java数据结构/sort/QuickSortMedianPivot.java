package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class QuickSortMedianPivot {

	public static void main(String[] args) {

		int[] arr = { 3, 9, -1, 19, 2, 0 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

		int[] array = new int[80000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 800000);
		}

		Date date1 = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s1 = simpleDateFormat.format(date1);
		System.out.println("before: " + s1);

		quickSort(array, 0, array.length - 1);
		Date date2 = new Date();
		String s2 = simpleDateFormat.format(date2);

		System.out.println("after: " + s2);
	}
	
	public static void quickSort(int[] array, int left, int right) {
		int l = left;
		int r = right;
		int pivot = array[(left + right) / 2]; //中轴值作为pivot
		
		while (l < r) {
			
			while (array[l] < pivot) { //如果左边的数小于pivot，继续向右
				l++;
			}
			while (array[r] > pivot) { //如果右边的数字大于pivot；继续向左
				r--;
			}
			
			if (l >= r) { //说明已经从左到右和右边碰到，此时左右顺序都已经弄好，可以停止
				break;
			}
			
			//如果左边的数字大于pivot，或者右边的数字小于pivot；交换
			int temp = array[l];
			array[l] = array[r];
			array[r] = temp;
			
			if (array[l] == pivot) {
				r--;
			}
			if (array[r] == pivot) {
				l++;
			}
 		}
		
		//如果此时l==r，必须l++；r--；防止stack overflow
		if (l == r) {
			l++;
			r--;
		}
		//left递归
		if (left < r) {
			quickSort(array,left, r);
		}
		
		if (right > l) {
			quickSort(array, l, right);
		}	

}

}
