package singleLinkedList;

public class HeroNode {
	public int no;
	public String name;
	public String nickName;
	public HeroNode next;
	
	public HeroNode(int no, String name, String nickName) {
		super();
		this.no = no;
		this.name = name;
		this.nickName = nickName;
	}



	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "HeroNode [no=" + no + ", name=" + name + ", nickName=" + nickName + "]";
	}
}


