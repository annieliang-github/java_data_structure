package singleLinkedList;

public class Exer1 {

	//giving head returning length
	public static int getLength(HeroNode head) {
		if (head.next == null) {
			return 0;
		}
		
		int length = 0;
		HeroNode current = head.next;
		while (current != null) {
			length++;
			current = current.next;
		}
		return length;
	}
	
	//查找单链表中倒数第K个节点
	public static HeroNode findLast(HeroNode head, int index) {
		if (head.next == null) {
			return null;
		}
		int size = getLength(head);
		if (index <= 0 || index > size) {
			return null;
		}
		HeroNode current = head.next;
		
		for (int i = 0; i < size - index; i++) {
			current = current.next;
		}
		return current;
	}
	
	
	
	
	//Test
	public static void main(String[] args) {
		HeroNode h1 = new HeroNode(1, "Tom", "superTom");
		HeroNode h2 = new HeroNode(2, "Jerry", "JJ");
		HeroNode h3 = new HeroNode(3, "Lee", "LeeHome");
		HeroNode h4 = new HeroNode(4, "Home", "what");
		HeroNode h5 = new HeroNode(5, "Casa", "MICA");
		
		OrderLinkedList singleLinkedList = new OrderLinkedList();
		singleLinkedList.addOrder(h1);
		singleLinkedList.addOrder(h2);
		singleLinkedList.addOrder(h5);
		singleLinkedList.addOrder(h4);
		singleLinkedList.addOrder(h3);
		
		singleLinkedList.list();
		System.out.println("~~~~~~~~~~~~~~");
		
		System.out.println(getLength(singleLinkedList.getHead()));
		System.out.println(findLast(singleLinkedList.getHead(), 2));
		
	}
	
	
	
}
