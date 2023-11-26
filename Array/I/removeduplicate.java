import java.util.*;

public class removeduplicate {

    public static void main(String[] args){
        int n = 5;
        ArrayList<Integer>arr = new ArrayList<>(Arrays.asList(1,2,3,2,3));
        // int []arr = {1s,2,2,2,3};
        Set<Integer> map= new HashSet<>();
		for(int i: arr){
			map.add(i);
		}
        System.out.println(map.size());
		// return map.size();
        // System.out.println(removeduplicate(arr,n));
    }
}