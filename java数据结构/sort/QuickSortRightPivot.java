package sort;

import java.util.Arrays;

public class QuickSortRightPivot {

	public static void main(String[] args) {

		int[] array = { 0, -3, 3, 21, 9,13, 2, 10, -8, 33, 82, 1, -4, 7, 6 };
		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}
	
	public static void quickSort(int[] array, int left, int right) {
	
		if (left < right) {
			int partitionIndex = partition(array, left, right);
			quickSort(array, left, partitionIndex - 1);
			quickSort(array, partitionIndex + 1, right);
		}
	}

	public static int partition(int[] array, int left, int right) {

		int pivot = array[right];
		int partitionIndex = -1;

		for (int j = 0; j < right; j++) {
			if (array[j] < pivot) {
				partitionIndex += 1;
				swap(array, j, partitionIndex);
			}
		}
		swap(array, ++partitionIndex, right);		
		return partitionIndex;
	}


	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
