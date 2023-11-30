public class findingsingleelement {
        public static int getSingleElement(int []arr){
            // Write your code here.
             for (int i = 0; i < arr.length - 1; i+=2) {
    
                if (arr[i] != arr[i + 1])
    
                     return arr[i];
    
            }
    
            return arr[arr.length-1];
        }
    
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,4,5};
        System.out.println(getSingleElement(arr));
    }
}
