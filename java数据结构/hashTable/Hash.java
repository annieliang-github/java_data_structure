package hashTable;

import java.util.Scanner;

public class Hash {

	public static void main(String[] args) {

		HashTable hashTable = new HashTable(7);
		// 菜单
		String keyString = "";
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("add:添加雇员");
			System.out.println("list:显示雇员");
			System.out.println("find:查询雇员");
			System.out.println("exit:退出程序");

			keyString = scanner.nextLine();

			switch (keyString) {
			case "add":
				System.out.println("请输入id:");
				int id = scanner.nextInt();
				System.out.println("请输入名字:");
				String nameString = scanner.next();

				// 创建雇员
				Emp emp = new Emp(id, nameString);
				hashTable.add(emp);
				break;
			case "list":
				hashTable.list();
				break;
			case "find":
				System.out.println("请输入id:");
				id = scanner.nextInt();
				hashTable.findEmpById(id);
				break;
			case "exit":
				scanner.close();
				System.exit(0);
			default:
				break;
			}
		}
	}

}
