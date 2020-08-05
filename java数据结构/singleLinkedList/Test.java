package singleLinkedList;

public class Test {
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
		
		HeroNode hn = new HeroNode(2, "JJeerryy", "JJ");
		singleLinkedList.update(hn);
		
		singleLinkedList.list();
		System.out.println("~~~~~~~~~~~~~~");
		
		singleLinkedList.del(2);
		singleLinkedList.list();
		System.out.println("~~~~~~~~~~~~~~");
		
	}

	
	


}
