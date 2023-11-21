import java.util.Scanner;

public class withoutloop {
    public static int[] repeatingnumber(int n, int[] ar){
        if(n==0) return ar;
        int i = n;
        ar[i-1] = n;
        return repeatingnumber(n-1, ar);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 4;
        int[] ar = new int[x];
        System.out.println(repeatingnumber(x, ar));
    }
}