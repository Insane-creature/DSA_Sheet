public class leftrotation{
    // public static int operation(int[] arr, int n){
        
    // }
    public static void main(String[] args){
        // Write your code here.
        int []arr = {1,2,3,4,5};
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1; i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        for(int i = 0; i < n;i++){
            System.out.print(arr[i]+",");
        }
    }
}