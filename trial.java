import java.util.Scanner;

public class trial {
    public static int secondsmallest(int[] a, int n){
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            if(a[i] < smallest){
                ssmallest = smallest;
                smallest = a[i];
            }
            else if(a[i]!=smallest && a[i]<ssmallest){
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }
    
    public static int secondlargest(int[] a, int n){
        int largest = a[0];     // 1
            int slargest = -1;      // -1
            for(int i = 1; i<n;i++){
                if(a[i] > largest){    // 4 > 2
                    slargest = largest; // sl = 1
                    largest = a[i];    // l = 2
                }
                else if(a[i]<largest && a[i]>slargest){
                    slargest = a[i];
                }
            }
            return slargest;
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 3};
        int n = arr.length;

        int[] result = new int[2];
        result[0] = secondsmallest(arr, n);
        result[1] = secondlargest(arr, n);
        
        System.out.println(secondlargest(arr, n));
        System.out.println(secondsmallest(arr, n));
        
    }

    
}
