package in.ineuron.question;

import java.util.Arrays;

public class Question6 {
	public static int findMinShots(int[][] points) {
	    Arrays.sort(points, (a, b) -> a[1] - b[1]);

	    int ans = 1;
	    int arrowX = points[0][1];

	    for (int i = 1; i < points.length; ++i)
	      if (points[i][0] > arrowX) {
	        arrowX = points[i][1];
	        ++ans;
	      }

	    return ans;
	  }
	public static void main(String[] args) {
		int points[][] = {{10,16},{2,8},{1,6},{7,12}};
		System.out.println(findMinShots(points));
	}
}
