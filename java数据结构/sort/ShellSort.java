package sort;

import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {

		int[] arr = { 3, 9, -1, 19, 2, 0 };
		shellSort2(arr);
		System.out.println(Arrays.toString(arr));

		int[] array = new int[80000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 800000);
		}

		Date date1 = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s1 = simpleDateFormat.format(date1);
		System.out.println("before: " + s1);

		shellSort2(array);
		Date date2 = new Date();
		String s2 = simpleDateFormat.format(date2);

		System.out.println("after: " + s2);

	}

	// 交换法
	public static void shellSort1(int[] array) {
		int temp = 0;
		int count = 0;

		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < array.length; i++) {
				for (int j = i - gap; j >= 0; j -= gap) {
					if(array[j] > array[j + gap]) {
						temp = array[j];
						array[j] = array[j + gap];
						array[j + gap] = temp;
					}
				}
			}
			System.out.println("第" + ++count + "轮交换后： " + Arrays.toString(array));
		}
		
	}

	// 移动法
	public static void shellSort2(int[] array) {
		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < array.length; i++) {
				int j = i;
				int elem = array[j];
				
				if (array[j] < array[j - gap]) {
					while (j - gap >= 0 && elem < array[j - gap]) {
						array[j] = array[j - gap];
						j -= gap;
					}
					array[j] = elem;
				}
			}
		}
	}
	
	
	
	
	
	
	

}
