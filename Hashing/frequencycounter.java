import java.util.HashMap;
import java.util.Map;

public class frequencycounter {
    public static int[] maxFrequencies(Map<Integer,Integer> map)
    {
        int maxKey=map.keySet().iterator().next();
        int maxValue = map.get(map.keySet().iterator().next());
        int minKey=maxKey;
        int minValue = maxValue;
        int result[] = new int[2];
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
              int count = entry.getValue();
            int element = entry.getKey();
            if(count>= maxValue)
            {
                if(count==maxValue)
                {
                    maxKey = element<maxKey ? element : maxKey;
                }
                else
                    maxKey=element;
                maxValue=count;
                
            }

            if(count<= minValue)
            {
                
                if(count==minValue)
                {
                    minKey = element<minKey ?element : minKey;
                }
                else
                minKey=element;
                minValue=count;
                
            }
        }

       
        result[0]=maxKey;
         result[1]=minKey;
         return result;

    }
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<v.length;i++)
        {
            int count=map.containsKey(v[i]) ? map.get(v[i])+1 : 0;
            map.put(v[i],count);
        }
        return maxFrequencies(map);
    }
    public static void main(String[] args){
        int n = 6;
        int v[] = {1,2,3,1,1,4};
        System.out.println(getFrequencies(v));
    }

}
