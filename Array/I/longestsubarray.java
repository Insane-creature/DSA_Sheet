import java.util.* ;
import java.io.*; 

public class longestsubarray {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();


        int n = nums.length;
        int maxLen = 0;
        int prefixSum = 0;


        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            
            if(prefixSum == k){
                maxLen = Math.max(maxLen,i+1);
            }
            int remove = prefixSum - k;
            if(map.containsKey(remove)){
                int len = i - map.getOrDefault(remove,0);
                maxLen = Math.max(maxLen,len);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, i));


        }
        return maxLen;
	}
    public static void main(String[] args){
        int[] a = {1, 2, 3, 1, 1,1,1};
        int k = 3;
        System.out.println(getLongestSubarray(a, k));
    }
}
