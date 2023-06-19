package in.ineuron.question;
import java.util.*;
public class Question5 {
	public static boolean containsDuplicate(int[] nums) {
	    Set<Integer> seen = new HashSet<>();

	    for (final int num : nums)
	      if (!seen.add(num))
	        return true;

	    return false;
	  }
	public static void main(String[] args) {
		int nums[] = {1,2,3,1};
		System.out.println(containsDuplicate(nums));
	}
}
