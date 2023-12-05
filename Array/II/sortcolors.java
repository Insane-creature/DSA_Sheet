public class sortcolors {
    public static void main(String[] args){
        int[] nums = {2,0,1};
        int n = nums.length;    // 3
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        
        }
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
