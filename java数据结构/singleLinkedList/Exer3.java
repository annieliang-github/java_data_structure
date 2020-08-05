package singleLinkedList;

import java.util.Stack;

public class Exer3 {

	// 实现逆序打印单链表
	public static void reversePrint(HeroNode head) {
		if (head.next == null) {
			return;
		}
		Stack<HeroNode> stack = new Stack<HeroNode>();
		HeroNode current = head.next;

		// add nodes to stack
		while (current != null) {
			stack.push(current);
			current = current.next;
		}

		// pop nodes out of stack
		while (stack.size() > 0) {
			System.out.println(stack.pop());
		}

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
		
		reversePrint(singleLinkedList.getHead());
		
	}

}
