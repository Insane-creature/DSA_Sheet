import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class union {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int n = a.length;
        int m = b.length;

        ArrayList<Integer> union = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(b[i]);
        }

        for (int it : set) {
            union.add(it);
        }

        Collections.sort(union);
        return union;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {2,3,5};
        System.out.println(sortedArray(a,b));
    }
}
