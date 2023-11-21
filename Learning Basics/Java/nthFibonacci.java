import java.util.Scanner;

public class nthFibonacci {
    public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int m[]=new int [n+1];

        m[0]=0;

        m[1]=1;

        for(int i=2;i<n+1;i++){

            m[i]=m[i-1]+m[i-2];

        }

        System.out.println(m[n]);
		
	}

}
