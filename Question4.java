package in.stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question4 {

	public static String checkIncreasingOrder(Queue<Integer> inputQueue) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> resultQueue = new LinkedList<>();
        int expectedElement = 1;

        while (!inputQueue.isEmpty()) {
            if (inputQueue.peek() == expectedElement) {
                resultQueue.add(inputQueue.poll());
                expectedElement++;
            } else if (!stack.isEmpty() && stack.peek() == expectedElement) {
                resultQueue.add(stack.pop());
                expectedElement++;
            } else {
                stack.push(inputQueue.poll());
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == expectedElement) {
                resultQueue.add(stack.pop());
                expectedElement++;
            } else {
                return "No";
            }
        }

        int currentElement = resultQueue.poll();
        while (!resultQueue.isEmpty()) {
            if (currentElement > resultQueue.peek()) {
                return "No";
            }
            currentElement = resultQueue.poll();
        }

        return "Yes";
    }

    public static void main(String[] args) {
        Queue<Integer> inputQueue1 = new LinkedList<>();
        inputQueue1.add(5);
        inputQueue1.add(1);
        inputQueue1.add(2);
        inputQueue1.add(3);
        inputQueue1.add(4);
        System.out.println("Input Queue: " + inputQueue1);
        System.out.println("Can be arranged in increasing order? " + checkIncreasingOrder(inputQueue1));

    }

}
