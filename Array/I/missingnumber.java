public class missingnumber {
    public static int missingNumber(int[] nums) {  // [3,0,1]
        int n = nums.length;                // 3
        int totalSum = n*(n+1)/2;           // 6
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+nums[i];              // sum = 3
        }
        return totalSum - sum;              // 6-4
    }
    public static void main(String[] args){
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    
}
