package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 3, 9, -1, 19, 2, 0 };
		int[] temp = new int[arr.length];
		mergeSort(arr, 0, arr.length - 1, temp);
		System.out.println(Arrays.toString(arr));

		int[] array = new int[80000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 800000);
		}

		Date date1 = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s1 = simpleDateFormat.format(date1);
		System.out.println("before: " + s1);

		Date date2 = new Date();
		String s2 = simpleDateFormat.format(date2);

		mergeSort(array, 0, arr.length - 1, temp);

		System.out.println("after: " + s2);
	}
	
	
	
	public static void merge(int[] array, int left, int mid, int right, int[] temp) {
		int i = left;
		int j = mid + 1;
		int t = 0;
		
		//都没有循环结束时
		while (i <= mid && j <= right) {
			if (array[i] <= array[j]) {
				temp[t] = array[i];
				i++;
				t++;
			} else {
				temp[t] = array[j];
				j++;
				t++;
			}
		}
		
		//如果右边循环结束，左全部加入temp
		while (i <= mid) { //左边有剩余
			temp[t] = array[i];
			i++;
			t++;
		}
		
		//如果左边循环结束，右边全部加入temp
		while (j <= right) { //右边有剩余
			temp[t] = array[j];
			j++;
			t++;
		}
		
		//copy temp to array
		t = 0; //reset t为0
		int tempLeft = left;
		while (tempLeft <= right) {
			array[tempLeft] = temp[t];
			t++;
			tempLeft++;
		}
	}
	
	public static void mergeSort(int[] array, int left, int right, int[] temp) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(array, left, mid, temp);
			mergeSort(array, mid + 1, right, temp);
			
			merge(array, left, mid, right, temp);
		}
	}
}
