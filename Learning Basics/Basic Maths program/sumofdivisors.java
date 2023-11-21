import java.util.Scanner;

public class sumofdivisors {
    public static int main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i >= 1;i++){     // 1
            if(n%i==0){sum += i;}
            
        }
        return sum;
    }
}
