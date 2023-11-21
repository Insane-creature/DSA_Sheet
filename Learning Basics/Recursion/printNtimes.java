import java.util.Scanner;

public class printNtimes {
    static void printit(int i, int n){
        if(i>n) return;
        System.out.println("Coding Ninjas");

        printit(i+1, n);
        
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       printit(1, n); 
    }
}
