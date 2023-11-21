import java.util.Scanner;

public class countingdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0,reminder=0,temp=n;
        while(temp!=0)                  
        {
            reminder=temp%10;           
            temp=temp/10;               
            if(reminder!=0 && n%reminder==0) 
                count++;
        }
        System.out.println(count);
    }

}