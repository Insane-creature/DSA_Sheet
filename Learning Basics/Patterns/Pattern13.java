import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        //sc.nextInt();
    for(int i=1;i<=n;i++){//each row
        //1)num print
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        
        //2)Space
        for(int j=0;j<2*n-2*i;j++){
             System.out.print("  ");
        }
        
        //3)num print
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
}
