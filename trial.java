import java.util.Scanner;

public class trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int currentDigit = 0;
        int evenDigitSum = 0;
        int oddDigitSum = 0;
        
        while(input>0){
            currentDigit = input%10;
            input = input/10;
            if(currentDigit % 2 == 0){
                evenDigitSum += currentDigit;
            }
            else{
                oddDigitSum += currentDigit;
            }

        }
        System.out.println(evenDigitSum+" "+oddDigitSum);        
    }

    
}
