public class InsertionSort {
    public static void main(String[] args){
        int[] ar = {64, 34, 25, 12, 22, 11, 90};

        for(int i = 0; i < ar.length-1; i++){
            int mini = i;
            for(int j=i; j<ar.length-1;j++){
                if(ar[j]<ar[mini]){
                    mini = j;
                }
            }
            int temp = ar[mini];
            ar[mini] = ar[i];
            ar[i] = temp;

        }
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }
}