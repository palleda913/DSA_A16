package in.stacks;

import java.util.Stack;

public class Question7 {

	public static int countRemainingWords(String[] words) {
        Stack<String> stack = new Stack<>();

        for (String word : words) {
            if (!stack.isEmpty() && stack.peek().equals(word)) {
                stack.pop();
            } else {
                stack.push(word);
            }
        }

        return stack.size();
    }

    public static void main(String[] args) {
        String[] words1 = {"ab", "aa", "aa", "bcd", "ab"};
        System.out.println("Number of words left: " + countRemainingWords(words1));

        
    }
}
