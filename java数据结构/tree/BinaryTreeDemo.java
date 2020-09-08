package tree;

public class BinaryTreeDemo {
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		HeroNode rootHeroNode = new HeroNode(1, "Tom");
		HeroNode node2 = new HeroNode(2, "Jerry");
		HeroNode node3 = new HeroNode(3, "Bob");
		HeroNode node4 = new HeroNode(4, "Lee");
		HeroNode node5 = new HeroNode(5, "Dan");
				
		tree.setRootHeroNode(rootHeroNode);
		
		rootHeroNode.setLeftHeroNode(node2);
		rootHeroNode.setRightHeroNode(node3);
		
		node3.setLeftHeroNode(node5);
		node3.setRightHeroNode(node4);
		
		System.out.println("前序");
		tree.preOrder();
		System.out.println("中序");
		tree.infixOrder();
		System.out.println("后序");
		tree.postOrder();
		
	}

}
