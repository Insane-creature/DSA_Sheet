import java.util.*;
import java.util.HashMap;
public class HashMaps {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>(); 

        // Insertion
        map.put("India", 120);
        map.put("US", 50);
        map.put("CHina", 30);
        // System.out.println(map);

        //Searching
        // if(map.containsKey("India")){
        //     System.out.println("Does Contains");
        // }
        // else{
        //     System.out.println("Doesn't contains");
        // }
        // System.out.println(map.get("CHina"));
        // System.out.println(map.get("China"));

        // Iteration
        // int ar[] = {12,11,14};
        // for(int val:ar){
        //     System.out.print(val+" ");
        // }
        // System.out.println();

        // PRINTING THROUGH ENTRY SET
        // for(int val:ar)
        // for(Map.Entry<String, Integer> e: map.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }

        // PRINTING THROUGH THE KEY SET 
        Set<String> keys = map.keySet();
        // for(String key: keys){
        //     System.out.println(keys+" "+map.get(key));
        // }
        for(String key: keys){
            System.out.println(key+" "+map.get(key));
        }

        //Removing
        map.remove("CHina");
        System.out.println(map);

    }
}
