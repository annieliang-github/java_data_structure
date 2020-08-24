package stack;

import java.util.Scanner;

public class ArrayStack {
	
	private int maxSize;
	private int[] stack;
	private int top = -1;
	
	public ArrayStack(int maxSize) {
		this.maxSize = maxSize;
		stack = new int[this.maxSize];
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack is FULL");
			return;
		}
		top++;
		stack[top] = value;
		
	}
	
	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException( "Stack is EMPTY");
		}
		int value = stack[top];
		top--;
		return value;
	}
	
	public void list() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		
		for (int i = top; i >= 0; i--) {
			System.out.printf("stack[%d] = %d\n", i, stack[i]);
		}
	}
	
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(4);
		String keyString = "";
		boolean loop = true;
		
		Scanner scanner = new Scanner(System.in);
		
		while (loop) {
			System.out.println("show: 显示栈");
			System.out.println("exit: 退出栈");
			System.out.println("push: 添加数据");
			System.out.println("pop: 从栈推出");
			System.out.println("请输入你的选择： ");
		
		keyString = scanner.next();
		
		switch (keyString) {
			case "show": 
				stack.list();
				break;
			case "exit": 
				scanner.close();
				loop = false;
				break;	
			case "push": 
				System.out.println("请输入一个数字： ");
				int num = scanner.nextInt();
				stack.push(num);
				break;
			case "pop": 
				try {
					int res = stack.pop();
					System.out.println("弹出的数字为： " + res);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
		}
		System.out.println("程序已结束");
	}
	
	
}
