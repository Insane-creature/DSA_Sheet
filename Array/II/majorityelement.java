import java.util.Arrays;

public class majorityelement {
    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        Arrays.sort(nums);
        int n = nums.length;
        System.out.println(nums[n/2]);
    }
}
