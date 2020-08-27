package sort;

import java.text.SimpleDateFormat;
import java.util.*;

public class BubbleSort {

	public static void bubbleSort(int[] array) {

		int temp = 0;
		boolean flag = false; // 是否进行交换

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {

				if (array[j] > array[j + 1]) {
					flag = true;
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
			if (!flag) { // 没有交换过
				break; // 可提前结束loop
			} else {
				flag = false; // 重置flag，继续下一轮交换
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 3, 9, -1, 19, 2, 0 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

		int[] array = new int[80000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 80000000);
		}

		Date date1 = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String str1 = simpleDateFormat.format(date1);
		System.out.println("排序前时间为： " + str1);

		bubbleSort(array);

		Date date2 = new Date();
		String str2 = simpleDateFormat.format(date2);
		System.out.println("排序后时间为： " + str2);
	}
}
