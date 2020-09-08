package tree;

public class HeroNode {

	private int no;
	private String nameString;
	private HeroNode leftHeroNode;
	private HeroNode riHeroNode;
	
	public HeroNode(int no, String nameString) {
		super();
		this.no = no;
		this.nameString = nameString;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public HeroNode getLeftHeroNode() {
		return leftHeroNode;
	}

	public void setLeftHeroNode(HeroNode leftHeroNode) {
		this.leftHeroNode = leftHeroNode;
	}

	public HeroNode getRiHeroNode() {
		return riHeroNode;
	}

	public void setRiHeroNode(HeroNode riHeroNode) {
		this.riHeroNode = riHeroNode;
	}
	
	//前序
	public void preOrder() {
		
		System.out.println(this);
		
		if (this.leftHeroNode != null) {
			this.leftHeroNode.preOrder();
		}
		
		if (this.riHeroNode != null) {
			this.riHeroNode.preOrder();
		}
	}
	
	//中序
	public void infixOrder() {
		
		if (this.leftHeroNode != null) {
			this.leftHeroNode.preOrder();
		}
		
		System.out.println(this);
		
		if (this.riHeroNode != null) {
			this.riHeroNode.preOrder();
		}
	}
	
	//后序
	public void postOrder() {
		
		if (this.leftHeroNode != null) {
			this.leftHeroNode.preOrder();
		}
	
		if (this.riHeroNode != null) {
			this.riHeroNode.preOrder();
		}
		
		System.out.println(this);
	}
	
}
















