public class hashing {
    public static void main(String[] args){
        int n = 5;
        int ar[] = {1,3,2,1,3};

        // precompute
        int[] hash = new int[13];
        for(int j = 0; j<n;j++){
            hash[ar[j]] += 1;
        }

        int q = 5;
        int number[] = {1,4,2,3,12};
        
        for(int j = 0; j<q;j++){
            System.out.println(hash[number[j]]);
        }
        
    }
}
