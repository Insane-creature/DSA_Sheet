import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class movezerotoend {
    public static int[] mainfunction(int[] a, int n){
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                temp.add(a[i]);
            }
        }
        int nz = temp.size();
        for (int i = 0; i < nz; i++) {
            a[i] = temp.get(i);
        }

        for (int i = nz; i < n; i++) {
            a[i] = 0;
        }
        return a;
    }
    public static void main(String[] args){

        int[] a = {1,3,5,0,3,0,7};
        int n = a.length;
       System.out.println(mainfunction(a,n));
    }
}