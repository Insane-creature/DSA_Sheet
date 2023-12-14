import java.util.Scanner;

public class switch_case {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        double result = 0.0;

        switch (ch) {

            case 1:

                result = Math.PI * (a[0] * a[0]);

                break;

            case 2:

                result = a[0] * a[1];

                break;

 

        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        double []a = new double[2];
        if(ch == 2){
            a[0] = sc.nextDouble();
            a[1] = sc.nextDouble();
        }
        else{
            a[0] = sc.nextDouble();
        }
        System.out.println(areaSwitchCase(ch, a));

    }

}
