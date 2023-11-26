public class whatstheissue {
    public static void main(String[] args){
        int []nums = {1,2,3,4,5,6,7};
        int k = 3;
        int n = nums.length;
        System.out.println("Hello");
        System.out.println(reversing(nums, k, n));
        for(int i = 0; i < n;i++){
            System.out.print(nums[i]+",");
        }
    }
    public static int[] reversing(int[] nums, int k, int n){
        
        int temp;
        for(int j = 0;j<k;j++){
            temp = nums[n-1];
            for(int i = n-1; i>=1;i--){    // i = 6
                nums[i] = nums[i-1];        // ar[1] = ar[0]
            }
            nums[0] = temp;
        }
        // for(int i : nums){
        //     System.out.println(i);
        // }
        return nums;

    }
}
