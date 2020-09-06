package hashTable;

public class EmpLinkedList {
	
	private Emp headEmp;
	
	public void add(Emp emp) {
		if (headEmp == null) { //如果添加的是第一个
			headEmp = emp;
			return;
		}
		//如果不是第一个，辅助指针定位到最后
		Emp curEmp = headEmp;
		while (true) {
			if (curEmp.next == null) { //已经到最后
				break;
			}
			curEmp = curEmp.next; //后移
		}
		curEmp.next = emp; //退出时，把emp加在链表最后
	}
	
	public void list(int no) {
		if (headEmp == null) {
			System.out.println("第" + (no + 1) + "链表为空");
			return;
		}
		System.out.print("第" + (no + 1) + "链表信息为:");
		
		Emp curEmp = headEmp;
		
		while (true) {
			System.out.printf(" => id = %d name = %s\t", curEmp.id, curEmp.name);
			 
			if (curEmp.next == null) { //已到结尾
				break;
			}
			curEmp = curEmp.next;
		}
		System.out.println();
	}
	
	public Emp findEmpById(int id) {
		if (headEmp == null) {
			System.out.println("链表为空");
			return null;
		}
		Emp curEmp = headEmp;
		while (true) {
			if (curEmp.id == id) {
				break;
			}
			if (curEmp.next == null) {
				curEmp = null;
				break;
			}
			curEmp = curEmp.next;
		}
		return curEmp;
	}
}
