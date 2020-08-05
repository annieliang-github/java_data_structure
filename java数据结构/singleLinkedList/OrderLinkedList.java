package singleLinkedList;

public class OrderLinkedList {
	// initiate a head (empty)
	private HeroNode head = new HeroNode(0, "", "");
	
	public HeroNode getHead() {
		return head;
	}

	public void setHead(HeroNode head) {
		this.head = head;
	}

	public void addOrder(HeroNode heroNode) {
		HeroNode temp = head;

		// if the no already exist
		boolean flag = false;

		while (true) {

			if (temp.next == null) {
				break;
			}
			if (temp.next.no > heroNode.no) {
				break;
			} else if (temp.next.no == heroNode.no) {
				flag = true;
				break;
			}
			temp = temp.next;
		}

		if (flag) {
			System.out.println("This no. already exits.");
		} else {
			heroNode.next = temp.next;
			temp.next = heroNode;
		}

	}

	// show whole linkedList
	public void list() {
		if (head.next == null) {
			System.out.println("Single Linked List is empty");
			return;
		}

		// at least one more node
		HeroNode temp = head.next;

		while (true) {
			if (temp == null) {
				break;
			}
			System.out.println(temp);
			temp = temp.next;
		}
	}

	// update info based on no. (no.can't be changed)
	public void update(HeroNode newHeroNode) {
		if (head.next == null) {
			System.out.println("This is an empty list");
			return;
		}
		HeroNode temp = head.next;

		// if the node exist
		boolean flag = false;
		while (true) {
			if (temp == null) {
				break;
				// pointer is at the end
			}
			if (temp.no == newHeroNode.no) {
				flag = true; // fount it
				break;
			}
			temp = temp.next;
		}

		if (flag == true) {
			temp.name = newHeroNode.name;
			temp.nickName = newHeroNode.nickName;
		} else {
			System.out.println("Didn't find no." + newHeroNode.no);
		}

	}

	// delete info based on no.
	public void del(int no) {
		HeroNode temp = head;

		// if the node before this can be found
		boolean flag = false;

		while (true) {
			if (temp.next == null) {
				break;
			}

			if (temp.next.no == no) {
				flag = true; // found the one before
				break;
			}
			temp = temp.next;
		}

		if (flag) {
			temp.next = temp.next.next;
		} else {
			System.out.println("Didn't find no." + no);
		}

	}
	
	

}
