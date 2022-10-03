package collections.org;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        
        TreeMap<Integer, String> map=new TreeMap<>();
        
        map.put(3, "C");        
        map.put(1, "A");
        map.put(2, "B");
        map.put(4, "D");
        map.put(5, "E");
        
        System.out.println(map);
        
        
        //method 1
        for(Map.Entry<Integer, String> m: map.entrySet())
        {
            System.out.println(m.getKey() +" : "+m.getValue());
        }
        
        //method 2
        map.forEach((k,v)->
        {
            System.out.println(k + " : "+v);
            
        }
    );
        
 
        TreeMap<Integer, String> map1=new TreeMap<>(Comparator.reverseOrder());
        map1.put(3, "C");       
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(4, "D");
        map1.put(5, "E");
        
        map1.forEach((k,v)->
        {
            System.out.println(k + " : "+v);
            
        }
    );
        
        
        System.out.println(map1.size());
        System.out.println(map1.isEmpty());
        System.out.println(map1.remove(5));
        System.out.println(map1.replace(1, "a"));
        System.out.println(map1.firstKey());
        System.out.println(map1.firstEntry());
        
        //Find the entry whose key is just less than the given key
        System.out.println(map1);
        System.out.println(map1.lowerKey(2));
        System.out.println(map1.lowerEntry(2));
        
        
        System.out.println(map);
        System.out.println(map.higherKey(4));
        System.out.println(map.higherEntry(4));
        
        
        
        
    }

}