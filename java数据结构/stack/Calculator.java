package stack;

import java.util.List;
import java.util.Stack;

public class Calculator {
	
	public int calRPN(List<String> parseSuffixExpList) {
		
        Stack<Integer> stack = new Stack<>();
        
        for (String str : parseSuffixExpList) {
            switch (str){
                case "+": 
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int num = stack.pop();
                    stack.push(stack.pop() - num);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int num2 = stack.pop();
                    stack.push(stack.pop() / num2);
                    break;
                default:
                    stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }

}



   