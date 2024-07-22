package Array.I;

public class optimisedCode {
        public static int largest(int n, int[] arr) {
            // code here
            // arr.length = 5
            int largest = arr[0];
            for(int i = 1; i < arr.length; i++){ // 4
                if(largest<arr[i]){ // 56 < 90
                    largest = arr[i];
                }
            }
            return largest;
        }
    
}
