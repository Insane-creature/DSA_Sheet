import java.util.Scanner;

class checkPalindrome {
    public static boolean checkPalindrome(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print(number);
        int temp = number;
        int reverseNumber = 0;
        while(temp!=0){
            int lastdigit = temp%10;
            reverseNumber = reverseNumber * 10 + lastdigit;
            temp /= 10;
        }
        if(reverseNumber==number){
            return true;
        }
        else{
            return false;
        }
        
    }
}
