public class rightrotation {
    // public static int[] reversing(int[] nums, int k){
        
    //     int temp;
    //     for(int j = 0;j<k;j++){
    //         temp = nums[n-1];
    //         for(int i = n-1; i>=1;i--){    // i = 6
    //             nums[i] = nums[i-1];        // ar[1] = ar[0]
    //         }
    //         nums[0] = temp;
    //     }
        
    //     return nums;
    // }
    public static void main(String[] args){
        int []nums = {1,2,3,4,5,6,7};
        int k = 3;
        int n = nums.length;
        int temp;
        for(int j = 0;j<k;j++){
            temp = nums[n-1];
            for(int i = n-1; i>=1;i--){    // i = 6
                nums[i] = nums[i-1];        // ar[1] = ar[0]
            }
            nums[0] = temp;
        }
        for(int i = 0; i < n;i++){
            System.out.print(nums[i]+",");
        }
    }
}


// public void rotate(int[] nums, int k) {
//         k %= nums.length;
//         int n = nums.length;
//         reverseNum(nums,0,n-1);
//         reverseNum(nums,0,k-1);
//         reverseNum(nums,k,n-1);
//     }
//     public void reverseNum(int[] nums, int start, int end) {
//         while(start < end) {
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }