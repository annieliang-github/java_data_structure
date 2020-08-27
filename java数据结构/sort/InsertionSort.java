package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class InsertionSort {

	public static void insertionSort(int[] array) {
		
		for (int i = 1; i < array.length; i++) {
			int j = i - 1;
			int elem = array[i];
			
			while (j >= 0 && elem < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			
			array[j + 1] = elem; //if bigger, shift to sorted right
			
			/*
			int insertValue = array[i];
			int insertIndex = i - 1;
			
			while (insertIndex >= 0 && insertValue < array[insertIndex]) {
				array[insertIndex + 1] = array[insertIndex];
				insertIndex--;
			}
			
			if (insertIndex + 1 != i) {
				array[insertIndex + 1] = insertValue;
			}
			*/
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 3, 9, -1, 19, 2, 0 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

		int[] array = new int[80000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 80000000);
		}

		Date date1 = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String str1 = simpleDateFormat.format(date1);
		System.out.println("排序前时间为： " + str1);

		insertionSort(array);

		Date date2 = new Date();
		String str2 = simpleDateFormat.format(date2);
		System.out.println("排序后时间为： " + str2);
	}
}
