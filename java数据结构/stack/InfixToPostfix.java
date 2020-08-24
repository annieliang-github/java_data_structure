package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InfixToPostfix {
	
	public static void main(String[] args) {
		String expressionString = "8+((2+1)*4)-9";
		List<String> list = toList(expressionString);
		System.out.println("中缀List为: " + list);
		
		List<String> parseSuffixExpList = parseSuffixExpList(list);
		System.out.println("后缀List为: " + parseSuffixExpList);
		
		Calculator calculator = new Calculator();
		int res = calculator.calRPN(parseSuffixExpList);
		System.out.println("结果为: " + res);
		
	}

	public static List<String> toList(String s) { //字符串表达式转list
		List<String> lst = new ArrayList<>();
		
		int i = 0;
		String string;
		char c;
		
		do {
			if((c=s.charAt(i)) < 48 ||  (c=s.charAt(i)) > 57) {
				lst.add("" + c);
				i++; //i需要后移
			} else { //如果是一个数，需要考虑多位数
				string = ""; //先将string 置成"" '0'[48]->'9'[57]
				while(i < s.length() && (c=s.charAt(i)) >= 48 && (c=s.charAt(i)) <= 57) {
					string += c;//拼接
					i++;
				}
				lst.add(string);
			}
		}while(i < s.length());
		return lst;//返回	
	}	
	
	public static List<String> parseSuffixExpList(List<String> list) {
		
		Stack<String> stack1 = new Stack<>();
		List<String> stack2 = new ArrayList<>();
		
		for (String item : list) {
			if (item.matches("\\d+")) { //如果是数字
				stack2.add(item);
			} else if (item.equals("(")) { //如果是左括号
				stack1.push(item);
			} else if (item.equals(")")) { //如果是右括号
				while (!stack1.peek().equals("(")) { //只要没遇到左括号就一直弹出	
					stack2.add(stack1.pop());
				}
				stack1.pop(); //将左括号弹出
			} else { //扫描到operator
				
				//如果item优先级 <= stack1栈顶，将top弹出压入stack2，再比较
				while(stack1.size() != 0 && 
					Operation.getValue(stack1.peek()) >= Operation.getValue(item)) {
					stack2.add(stack1.pop());
				}
				
				//如果item优先级高，入stack1
				stack1.push(item);
			}
		}
		
		//以上循环完毕，把stack1剩余的operator一次加入stack2
		while (stack1.size() != 0) {
			stack2.add(stack1.pop());
		}
		return stack2; //存放在ArrayList中，顺序输出即为后缀表达式，不需要再逆序
	}
	
	static class Operation {
		private static int ADD = 1;
		private static int SUB = 1;
		private static int MUL = 2;
		private static int DIV = 2;
		
		//返回对应的优先级数字
		public static int getValue(String operation) {
			int result = 0;
			switch (operation) {
			case "+":
				result = ADD;
				break;
			case "-":
				result = SUB;
				break;
			case "*":
				result = MUL;
				break;
			case "/":
				result = DIV;
				break;
			}
			return result;
		}
		
	}
	
	
}
