public class checkingarray {
    public static int isSorted(int n, int []a) {
                // Write your code here.
                // int res = 0;
                for (int i = 1; i < n; i++) {
                  if (a[i] < a[i - 1])
                    return 0;
                }
                return 1;
            }
    public static void main(String[] args){
        int n = 4;
        int []a = {0,0,0,1};
        System.out.println(isSorted(n, a));
    }
}
