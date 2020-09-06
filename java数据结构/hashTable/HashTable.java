package hashTable;

public class HashTable {
	private EmpLinkedList[] empLinkedListArray;
	private int size; //有多少条链表
	
	public HashTable(int size) {
		this.size = size;
		empLinkedListArray = new EmpLinkedList[size];
		
		for (int i = 0; i < size; i++) {
			empLinkedListArray[i] = new EmpLinkedList();
		}
	}
	
	//用取模的方法计算哈希值
	public int hashCode(int id) {
		return id % size;
	}
	
	public void add(Emp emp) {
		int empLinkedListNo = hashCode(emp.id);
		empLinkedListArray[empLinkedListNo].add(emp);
	}
	
	public void list() {
		for (int i = 0; i < size; i++) {
			empLinkedListArray[i].list(i);
		}
	}
	
	public void findEmpById(int id) {
		int empLinkedListNo = hashCode(id);
		Emp emp = empLinkedListArray[empLinkedListNo].findEmpById(id);
		
		if (emp != null) {
			System.out.printf("在第%d条链表中找到该雇员，id = %d", (empLinkedListNo + 1), id);
		} else{
			System.out.println("在哈希表中，没有找到该雇员");
		}
	}

	
}
