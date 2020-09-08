package tree;

public class BinaryTree {

	private HeroNode rootHeroNode;

	public void setRootHeroNode(HeroNode rootHeroNode) {
		this.rootHeroNode = rootHeroNode;
	}

	// 调用前序
	public void preOrder() {
		if (this.rootHeroNode != null) {
			this.rootHeroNode.preOrder();
		} else {
			System.out.println("二叉树为空，无法遍历");
		}
	}

	// 调用中序
	public void infixOrder() {
		if (this.rootHeroNode != null) {
			this.rootHeroNode.infixOrder();
		} else {
			System.out.println("二叉树为空，无法遍历");
		}
	}

	// 调用后序
	public void postOrder() {
		if (this.rootHeroNode != null) {
			this.rootHeroNode.postOrder();
		} else {
			System.out.println("二叉树为空，无法遍历");
		}
	}
}
