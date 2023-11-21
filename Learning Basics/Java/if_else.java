import java.util.Scanner;

public class if_else {
    public static String compareIfElse(int a, int b) {
        // Write your code here
        if(a>b){
            return "Greater";
        }
        else if(a<b){
            return "Smaller";
        }
        else{
            return "Equal";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        System.out.println(compareIfElse(input1, input2));

    }
}
