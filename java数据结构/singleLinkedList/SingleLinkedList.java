package singleLinkedList;

public class SingleLinkedList {
	//initiate a head (empty)
	private HeroNode head = new HeroNode(0, "", "");
	
	public void add(HeroNode heroNode) {
		HeroNode temp = head;
		while (true) {
			if (temp.next == null) {
				break;
			}
			//moving to the next one if not reaching end
			temp = temp.next; 	
		}
		//now pointer is at the end
		temp.next = heroNode;
	}
	
	//show whole linkedList
	public void list() {
		if (head.next == null) {
			System.out.println("Single Linked List is empty");
			return;
		}
		
		//at least one more node
		HeroNode temp = head.next;
		
		while (true) {
			if (temp == null) {
				break;
			}
			System.out.println(temp);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		HeroNode h1 = new HeroNode(1, "Tom", "superTom");
		HeroNode h2 = new HeroNode(2, "Jerry", "superTom");
		HeroNode h3 = new HeroNode(3, "Lee", "superTom");
		HeroNode h4 = new HeroNode(4, "Home", "superTom");
		HeroNode h5 = new HeroNode(5, "Casa", "superTom");
		
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.add(h1);
		singleLinkedList.add(h2);
		singleLinkedList.add(h5);
		singleLinkedList.add(h4);
		singleLinkedList.add(h3);
		
		singleLinkedList.list();
		
	}
	
	
}
