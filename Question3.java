package in.stacks;

import java.util.Stack;

public class Question3 {

	public static void main(String[] args) {
		 Stack<Integer> stack = new Stack<>();
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        stack.push(4);
	        stack.push(5);

	        findMiddleElement(stack);

	        System.out.println(stack);
	}

	public static void findMiddleElement(Stack<Integer> stack) {
		
		int size=stack.size();
		int middlePosition = (size % 2 == 0) ? (size / 2) : (size / 2) + 1;

        deleteMiddleUtil(stack, middlePosition, 1);
    }

    private static void deleteMiddleUtil(Stack<Integer> stack, int middlePosition, int currentPosition) {
        if (stack.isEmpty() || currentPosition > middlePosition) {
            return;
        }

        int element = stack.pop();

        deleteMiddleUtil(stack, middlePosition, currentPosition + 1);

        if (currentPosition != middlePosition) {
            stack.push(element);
        }
    }

}
