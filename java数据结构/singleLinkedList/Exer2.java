package singleLinkedList;

public class Exer2 {

	// 单链表的反转
	public static void reverseList(HeroNode head) {
		if (head.next == null || head.next.next == null) {
			return;
		}
		HeroNode current = head.next;
		HeroNode temp = null;
		HeroNode reverseHead = new HeroNode(0, "", "");

		while (current != null) {
			temp = current.next;
			current.next = reverseHead.next;
			reverseHead.next = current;
			current = temp;
		}
		head.next = reverseHead.next;
	}

	// Test
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

		reverseList(singleLinkedList.getHead());
		
		singleLinkedList.list();
	}

}
