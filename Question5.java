package in.stacks;

import java.util.Stack;

public class Question5 {

	 public static void main(String[] args) {
	        int number = 12345;
	        System.out.println("Original number: " + number);
	        int reversedNumber = reverseNumber(number);
	        System.out.println("Reversed number: " + reversedNumber);
	    }

	 public static int reverseNumber(int number) {
	        Stack<Integer> stack = new Stack<>();
	        String numberString = Integer.toString(number);

	        for (int i = 0; i < numberString.length(); i++) {
	            int digit = Character.getNumericValue(numberString.charAt(i));
	            stack.push(digit);
	        }

	        StringBuilder reversedString = new StringBuilder();
	        while (!stack.isEmpty()) {
	            reversedString.append(stack.pop());
	        }

	        int reversedNumber = Integer.parseInt(reversedString.toString());
	        return reversedNumber;
	    }


}
