package collections.org;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
    
        LinkedHashMap<Integer, String> map=new LinkedHashMap<>();
        
        map.put(1, "A");
        map.put(0, "E");
        map.put(2, "W");
        map.put(5, "F");
        map.put(9, "M");
        map.put(3, "K");
        
        System.out.println(map);
        for(Map.Entry<Integer, String> m: map.entrySet())
        {
            System.out.println(m.getKey() +" : "+m.getValue());
        }
        
        map.forEach((k,v)->{System.out.println(k + " : "+v);});
        
        
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Y"));
        
        System.out.println(map.get(5)); 
        System.out.println(map.remove(3));

    }

}
