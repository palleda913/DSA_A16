package in.stacks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Question1 {

	public static int[] findnextHigherFrequencyElement(int[] nums) {
		int[] result=new int[nums.length];
		
		Arrays.fill(result, -1);
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		Stack<Integer> stack=new Stack<Integer>();
		int j=0;
		while(j<nums.length) {
			map.put(nums[j],map.getOrDefault(nums[j],0)+1 );
			j++;
		}
		for(int i=nums.length-1;i>=0;i--) {
			
			while(!stack.isEmpty() && map.get(stack.peek()) <= map.get(nums[i]))
				stack.pop();
			
			if(!stack.isEmpty())
				result[i]=stack.peek();
	
			stack.push(nums[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		 int[] arr = {1, 1, 2, 3, 4, 2, 1};
	     int[] nextGreater = findnextHigherFrequencyElement(arr);
	     for(int res:nextGreater)
	    	 System.out.print(res+" ");

	}

}
