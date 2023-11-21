import java.util.Arrays;
import java.util.Scanner;

public class gcdHcf {
    public static int main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        
        int greater = n>m?n:m;
        int [] arr=new int [100];

        for(int i = 1; i <= greater; i++){
            if (n%i == 0 && m%i == 0){
                arr[i] = i;
            }
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
