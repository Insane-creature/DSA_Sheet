import java.util.Scanner;

public class reversing {
    public static long main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 0;
		for (int i = 0; i < 32; i++)
		{
		result <<= 1;
		result |= (n & 1); //Set the least significant bit of result to the current bit of n
		n >>= 1; //Right shift n by 1 bit to process the next bit 
		}
		return result;
    }
}
