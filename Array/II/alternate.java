public class alternate {
    public static void main(String[] args){
        
        // funtion
        int[] arr = {3,1,-2,-5,2,-4};
        int n = arr.length;
        
        int[] nums = new int[n];
        int posIndex = 0, negIndex = 1;

        for(int i = 0; i<n;i++){
            if(arr[i] < 0){
                nums[negIndex] = arr[i];
                negIndex +=2;
                // System.out.println("The index is "+);
            }
            else{
                nums[posIndex] = arr[i];
                posIndex +=2;
            }
        }
        

        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
