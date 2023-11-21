public class largestnumber {
    static int largestElement(int[] arr, int n) {
        // Write your code here.

        int largest = arr[0];
        for(int i = 1; i<n;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
        
    }
    public static void main(String[] args){
        int[] arr = {4,7, 8, 6, 7, 6};
        int n = arr.length;
        System.out.println(largestElement(arr, n));

    }
}