public class largestsubarray{
        public static int longestSubarrayWithSumK(int []a, long k) {
            // Write your code here
            int left = 0, right = 0;
            int n = a.length, ansMax = 0;
            long curSum = 0L;
            while(right < n){
                curSum += a[right];
                while(left < right && curSum > k){
                    curSum -= a[left];
                    left++;
                }
                if(curSum == k){
                    ansMax = Math.max(ansMax, right-left+1);
                }
                right++;
            }
            return ansMax;
        }
        public static void main(String[] args){
            int[] a = {1, 2, 3, 1, 1,1,1};
            int k = 3;
            System.out.println(longestSubarrayWithSumK(a, k));

        }
}