package circleSingleLinkedList;

public class CircleSingleLinkedList {
	
	private Boy first = null;
	
	public void addBoy(int nums) {
		if (nums < 1) {
			System.out.println("Not a correct number to add.");
			return;
		}
		
		Boy curBoy = null;
		for (int i = 1; i <= nums; i++) {
			Boy boy = new Boy(i);
			if (i == 1) {
				first = boy;
				first.setNext(first); //it forms a circle
				curBoy = first; //current points at first node
			} else {
				curBoy.setNext(boy);
				boy.setNext(first);
				curBoy = boy;
			}
		}
	}
	
	
	public void showBoy() {
		if (first == null) {
			System.out.println("Circle Linked List is empty.");
			return;
		}
		Boy curBoy = first;
		while (true) {
			System.out.printf("number is %d \n", curBoy.getNo());
			
			if (curBoy.getNext() == first) {
				break;
			}
			curBoy = curBoy.getNext(); //current后移完成遍历
		}
	}
	
	/**
	 * @param startNo 从几开始数
	 * @param countNum 每次数几个
	 * @param nums 有多少个小孩
	 */
	
	public void countBoy(int startNo, int countNum, int nums) {
		
		if(first == null || startNo < 1 || startNo > nums) {
			System.out.println("wrong info");
			return;
		}
		Boy helper = first;
		while (true) {
			if (helper.getNext() == first) {
				break;
			}
			helper = helper.getNext();
		}
		
		for (int j = 0; j < startNo - 1; j++) {
			first = first.getNext();
			helper = helper.getNext();
		}
		
		while (true) {
			if (helper == first) {
				break;
			}
			
			for (int j = 0; j <countNum - 1; j++) {
				first = first.getNext();
				helper = helper.getNext();
			}	
				System.out.printf("No. %d is getting out\n", first.getNo());
				first = first.getNext();
				helper.setNext(first);
			
		}
		
		System.out.println("remaining no. is" + first.getNo());
		
		
	}
	
	
	
	
	
	
}
