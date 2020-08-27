package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SelectSort {

	public static void selectSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;
			int min = array[minIndex];

			// 遍历，找到最小的数字
			for (int j = i + 1; j < array.length; j++) {
				if (min > array[j]) {
					min = array[j];
					minIndex = j;
				}
			}

			// 遍历结束，已找到，如果和minIndex不一样，交换
			if (minIndex != i) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
	}

	public static void main(String[] args) {

		// 测试排序是否成功
		int[] arr = { 3, 9, -1, 19, 2, 0 };
		selectSort(arr);
		System.out.println(Arrays.toString(arr));

		// 测试速度

		int[] array = new int[80000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 80000000);
		}

		Date date1 = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String str1 = simpleDateFormat.format(date1);
		System.out.println("排序前时间为： " + str1);

		selectSort(array);

		Date date2 = new Date();
		String str2 = simpleDateFormat.format(date2);
		System.out.println("排序后时间为： " + str2);

	}

}
