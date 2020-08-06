package doubleLinkedList;

import singleLinkedList.HeroNode;

public class DoubleLinkedList {
	private HeroNode2 head = new HeroNode2(0, "", "");

	public HeroNode2 getHead() {
		return head;
	}
	
	public void list() {
		if (head.next == null) {
			System.out.println("Empty double linked list");
			return;
		}
		HeroNode2 temp = head.next;
		
		while (true) {
			if (temp == null) {
				break;
			}
			System.out.println(temp);
			temp = temp.next;
		}
		
	}
	
	
	public void add(HeroNode2 heroNode) {
		HeroNode2 temp = head;
		while (true) {
			if (temp.next == null) {
				break;
			}
			temp = temp.next;
		}
		
		temp.next = heroNode;
		heroNode.pre = temp;
	}
	
	
	public void update(HeroNode2 newHeroNode) {
		if (head.next == null) {
			System.out.println("Empty Double Linked List");
			return;
		}
		
		HeroNode2 temp = head.next;
		boolean flag = false;
		
		while (true) {
			if (temp == null) {
				break;
			}
			if (temp.no == newHeroNode.no) {
				flag = true;
				break;
			}
			temp = temp.next;
		}
		
		if (flag) {
			temp.name = newHeroNode.name;
			temp.nickName = newHeroNode.nickName;
		} else {
			System.out.println("Didn't find no." + newHeroNode.no);
		}
		
	}
	
	public void del(int no) {
		if (head.next == null) {
			System.out.println("Empty double linked list");
			return;
		}
		HeroNode2 temp = head.next;
		boolean flag = false;
		
		while (true) {
			if (temp == null) {
				break;
			}
			if (temp.no == no) {
				flag = true;
				break;
			}
			temp = temp.next;
		}
		
		if (flag) {
			temp.pre.next = temp.next;
			if (temp.next != null) {
				temp.next.pre = temp.pre;
			}
		}
	}

}
