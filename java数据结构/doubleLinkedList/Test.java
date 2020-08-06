package doubleLinkedList;

public class Test {
	public static void main(String[] args) {
		
		HeroNode2 h1 = new HeroNode2(1, "Tom", "superTom");
		HeroNode2 h2 = new HeroNode2(2, "Jerry", "JJ");
		HeroNode2 h3 = new HeroNode2(3, "Lee", "LeeHome");
		HeroNode2 h4 = new HeroNode2(4, "Home", "what");
		HeroNode2 h5 = new HeroNode2(5, "Casa", "MICA");
		
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		
		doubleLinkedList.add(h1);
		doubleLinkedList.add(h3);
		doubleLinkedList.add(h5);
		doubleLinkedList.add(h2);
		doubleLinkedList.add(h4);
		
		doubleLinkedList.list();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		HeroNode2 newHeroNode = new HeroNode2(4, "HOME", "who?");
		doubleLinkedList.update(newHeroNode);
		doubleLinkedList.list();

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

		doubleLinkedList.del(2);
		doubleLinkedList.list();
		
	}

}
