package stack;

import java.util.*;

public class ReversePoland {
	
	public static void main(String[] args) {
		String suffixExp = "3 4 + 5 * 6 -";
		List<String> list = getList(suffixExp);
		System.out.println("Result is: " + calculate(list));
	}
	
	public static List<String> getList(String suffixExp) {
		
		String[] split = suffixExp.split(" ");
		List<String> lst = new ArrayList<>();
		
		for (String elem : split) {
			lst.add(elem);
		}
		
		return lst;
	}
	
	public static int calculate(List<String> lst) {
		
		Stack<String> stack = new Stack<>();
		for (String item : lst) {
			
			if(item.matches("\\d+")) {
				stack.push(item);
			} else {
				int num1 = Integer.parseInt(stack.pop());
				int num2 = Integer.parseInt(stack.pop());
				
				int res = 0;
				if (item.equals("+")) {
					res = num2 + num1;
				} else if (item.equals("-")) {
					res = num2 - num1;
				} else if (item.equals("*")) {
					res = num2 * num1;
				} else if (item.equals("/")) {
					res = num2 / num1;
				} else {
					throw new RuntimeException("Unsupported Operator Type");
				}
					
				stack.push(res + "");
				
			}
		}
	
		return Integer.parseInt(stack.pop());
		
	}

}
