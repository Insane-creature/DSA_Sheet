import java.util.* ;
import java.io.*; 

public class maxsubarray {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
            }
            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        // To consider the sum of the empty subarray
        // uncomment the following check:
        if (maxi < 0) maxi = 0;
        return maxi;
	}
    public static void main(String[] args) {
        int[] arr = {10,20,30,-40,-50,50};
        int n = arr.length;
        System.out.println(maxSubarraySum(arr, n));
    }
}
