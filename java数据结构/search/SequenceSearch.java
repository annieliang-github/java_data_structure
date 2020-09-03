package search;

public class SequenceSearch {
	
	public static void main(String[] args) {
		int[] arr = { 53, 3, 542, 748, 14, 214};
		int index = seqSearch(arr, 14);
		
		if (index == -1) {
			System.out.println("没有找到该数字");
		} else {
			System.out.println("找到了, index为: " + index);
		}
	}

	public static int seqSearch(int[] arr, int findVal) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == findVal) {
				return i;
			}
		}
		return -1;
	}
}
