import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int n = 5;
    for(int i=1;i<=n;i++){
        char ch=(char)('A'+n-1);
        for(int j=1;j<=i;j++){
            System.out.print(ch+" ");
            ch--;
        }
         System.out.println();
    }
}
}
