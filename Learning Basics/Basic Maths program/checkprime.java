public class checkprime {
    public static void main(String[] args){
        
        int num =5;
        if (num <= 1) 
            System.out.print("NO");
        for (int i = 2; i <= Math.sqrt(num); i++) 
            if (num % i == 0){ 
                System.out.print("NO");
            }
        System.out.print("YES");
    }
}
