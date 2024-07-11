package Recusrion;

public class cubesum {
    long sumOfSeries(long n) {
        // code here
        if(n<1){
            return 0;
        }
        long sum = 0;
        if(n>=1){
            sum = n*n*n + sumOfSeries(n-1);    
        }
        
        return sum;
    }
}
