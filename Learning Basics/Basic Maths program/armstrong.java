import java.util.Scanner;

public class armstrong {
    public static boolean main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem , sum = 0, count = 0;
        int ori = n;
        int temp = n;
        while(n > 0){
            rem = n % 10;
            n /= 10;
            count++;            

        }while(temp > 0){
            rem = temp % 10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }

        if(sum == ori){
            return true;
        }else{
            return false;
        }
        
    }
}
