import java.util.Arrays;
public class TwoSum {
    public static String read(int n, int []book, int target){
        // Write your code here.
        Arrays.sort(book);
        int left = 0, right = n - 1;
        while (left <= right) { 
           int sum = book[left] + book[right]; 
           if (sum == target) {
                return "YES";
            } 
            else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
       // No pair found
        return "NO";
    }
    public static void main(String[] args){
        int n = 5;
        int target = 5;
        int[] book = {4, 1, 2, 3, 1};
        System.out.println(read(n, book, target));
         
     }
}
