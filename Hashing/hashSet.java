import java.util.*;
import java.util.HashSet;

public class hashSet {
    public static void main(String[] args){
        // creating
        HashSet<Integer> set = new HashSet<>();
        
        //inserting
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);

        //searching
        // if(!set.contains(6)){
        //     System.out.println("Set contains 6");  // goes into the loop as set doesn't contain 6
        // }

        // System.out.println(set.size());
        // System.out.println(set);
        // // deleting
        // set.remove(1);
        // System.out.print(set.size());
  
        // Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
