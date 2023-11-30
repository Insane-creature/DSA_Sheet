public class sum {
        public static int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(nums[i]+nums[j]==target){
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{};
        }
        public static void main(String[] args){
            int[] nums = {1, 2, 3, 1, 1,1,1};
            int target = 4;
            System.out.println(twoSum(nums, target));
        }
        
}
