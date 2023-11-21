import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int n = 5;
    
    for(int i=1;i<=n;i++){
        char ch='A';
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //char forwards
        for(int j=1;j<=i;j++){
            System.out.print(ch);
            ch++;
        }
        
        //char backwards 
        ch--;
        for(int j=i;j>1;j--){
            ch--;
            System.out.print(ch);
        }
        
        //space
        
         System.out.println();     
    }
}
}
