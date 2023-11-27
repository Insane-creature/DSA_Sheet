public class linearsearch {
    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
        for(int i = 0;i<n;i++){
            if(arr[i]==num){
                return i;
            }
            
        }

       return -1;
        
    }
    public static void main(String[] args){
        int[] arr = {1,3,5,0,3,0,7};
        int n = arr.length;
        int num = 3;
        System.out.println(linearSearch(n, num, arr));

    }
}
