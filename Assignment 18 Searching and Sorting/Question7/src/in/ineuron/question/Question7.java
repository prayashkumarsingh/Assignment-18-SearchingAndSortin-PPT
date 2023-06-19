package in.ineuron.question;

import java.util.Arrays;

public class Question7 {
	public static int lengthOfLSIS(int[] nums) {
	    if (nums.length == 0)
	      return 0;
	    int[] dp = new int[nums.length];
	    Arrays.fill(dp, 1);

	    for (int i = 1; i < nums.length; ++i)
	      for (int j = 0; j < i; ++j)
	        if (nums[j] < nums[i])
	          dp[i] = Math.max(dp[i], dp[j] + 1);

	    return Arrays.stream(dp).max().getAsInt();
	  }
	public static void main(String[] args)
    {
 
        int nums[] = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLSIS(nums));
    }
}
