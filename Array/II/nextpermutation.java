import java.util.Collections;
import java.util.List;
import java.util.*;

public class nextpermutation {
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        // Write your code here.
        int n=A.size();
        int idx=-1;
        for(int i=n-2;i>=0;i--){

            if(A.get(i)<A.get(i+1)){

                idx=i;
                break;
            }
        }

    if(idx==-1){

    Collections.reverse(A);

    return A;

    }

    for(int i=n-1;i>idx;i--){

        if(A.get(i)>A.get(idx)){

            int temp= A.get(i);

            A.set(i,A.get(idx));

            A.set(idx,temp);

            break;

        }

    }

    List<Integer> subtitle = A.subList(idx+1,n );

    Collections.reverse(subtitle);

    return A;

    }
}
