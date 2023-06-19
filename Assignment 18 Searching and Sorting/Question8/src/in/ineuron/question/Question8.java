package in.ineuron.question;
import java.util.*;
public class Question8 {
	public static boolean find132pattern(int[] nums) {
	    Deque<Integer> stack = new ArrayDeque<>();
	    int ak = Integer.MIN_VALUE;

	    for (int i = nums.length - 1; i >= 0; --i) {
	      if (nums[i] < ak)
	        return true;
	      while (!stack.isEmpty() && stack.peek() < nums[i])
	        ak = stack.pop();
	      stack.push(nums[i]);
	    }

	    return false;
	  }
	public static void main(String[] args)
    {
 
        int nums[] = {-1,3,2,0};
        System.out.println(find132pattern(nums));
    }
}
