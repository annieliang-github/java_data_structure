package tree;

public class HeroNode {

	private int no;
	private String nameString;
	private HeroNode leftHeroNode;
	private HeroNode rightHeroNode;
	
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

	public HeroNode getRightHeroNode() {
		return rightHeroNode;
	}

	public void setRightHeroNode(HeroNode rightHeroNode) {
		this.rightHeroNode = rightHeroNode;
	}
	
	
	
	@Override
	public String toString() {
		return "HeroNode [no=" + no + ", nameString=" + nameString + "]";
	}

	//前序
	public void preOrder() {
		
		System.out.println(this);
		
		if (this.leftHeroNode != null) {
			this.leftHeroNode.preOrder();
		}
		
		if (this.rightHeroNode != null) {
			this.rightHeroNode.preOrder();
		}
	}
	
	//中序
	public void infixOrder() {
		
		if (this.leftHeroNode != null) {
			this.leftHeroNode.preOrder();
		}
		
		System.out.println(this);
		
		if (this.rightHeroNode != null) {
			this.rightHeroNode.infixOrder();
		}
	}
	
	//后序
	public void postOrder() {
		
		if (this.leftHeroNode != null) {
			this.leftHeroNode.postOrder();
		}
	
		if (this.rightHeroNode != null) {
			this.rightHeroNode.postOrder();
		}
		
		System.out.println(this);
	}
	
}
















