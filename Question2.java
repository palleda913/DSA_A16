package in.stacks;

import java.util.Stack;

public class Question2 {

	public static Stack<Integer> ascendingOrder(Stack<Integer> stack) {
		
		Stack<Integer> tempStack=new Stack<Integer>();
		
		while(!stack.isEmpty()) {
			int temp=stack.pop();
			
			while(!tempStack.isEmpty() && tempStack.peek()< temp) {
			    stack.push(tempStack.pop());
			}
			
			tempStack.push(temp);
		}
		
		while(!tempStack.isEmpty()) {
			stack.push(tempStack.pop());
		}
		
		return stack;
	}
	public static void main(String[] args) {
		Stack<Integer> stack1=new Stack<Integer>();
		stack1.push(34);
		stack1.push(3);
		stack1.push(31);
		stack1.push(98);
		stack1.push(92);
		stack1.push(23);
		Stack<Integer> order = ascendingOrder(stack1);
		System.out.println(order);
		
	}

}
