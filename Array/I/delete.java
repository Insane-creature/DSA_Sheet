public class delete {
    public static int[] moveZeros(int[] a, int n) {
        // Write your code here.
        int temp;
        for(int j = 0; j<n-1;j++){
        for(int i = 0; i<n-1;i++){
            if(a[i] == 0){
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
    }
        return a;
    }
    public static void main(String[] args){
        int[] a = {1,3,5,0,3,0,7};
        int n = a.length;
        // System.out.print(moveZeros(a, n));
        int[] result = moveZeros(a, n);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }        
}

