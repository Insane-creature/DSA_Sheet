import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        //sc.nextInt();
        for(int i=n;i>0;i--)
        {
            int k=1;
            for(k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
