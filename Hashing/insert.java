public class insert {
    public static void main(String[] args){
        int a[] = {14,9,15,12,6,8,13};
        int n = a.length;
        // System.out.print(n);
        for(int i = 0; i <n-1 ;i++){
            int j = i;
            while(j>0 && a[j-1]>a[j]){
                int temp = a[j];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
            } 
        }
        for(int i = 0; i <n ;i++){
            System.out.println(a[i]);
        }
    }
}
