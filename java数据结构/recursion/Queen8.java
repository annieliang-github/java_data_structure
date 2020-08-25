package recursion;

public class Queen8 {

	int max = 8; 
	int[] array = new int[max];
	
	static int count = 0;
	
	public static void main (String[] args) {
		
		Queen8 queen8 = new Queen8();
		queen8.put(0);
		System.out.printf("一共有%d种解法", count);
	}
	
	//输出位置
	public void print() {
		count++;

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public boolean isOK(int n) {
		for (int i = 0; i < n; i++) {
			if(array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
				//检查是否同一列或者同一斜线
				return false;
			}
		}
		return true;
	}
	
	public void put(int n) {
		if (n == max) { //已经放满8个
			print(); //直接调用print()方法，在check的同时也打印
			return;
		}
		
		for (int i = 0; i < max; i++) {
			array[n] = i; //先放到第n行第一列，再往后循环
			
			if (isOK(n)) { //不冲突的话，就可以放第n+1个
				put(n + 1);
			}
		}
	}
}
















