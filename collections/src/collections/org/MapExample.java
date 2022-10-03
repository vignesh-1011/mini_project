package collections.org;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        
        Map<String, String> players=new HashMap<String, String>();
       // HashMap<String, String> players1=new HashMap<String, String>();
        
        players.put("a", "Amit");
        players.put("b", "Kunal");
        players.put("b", "Raman");
        players.put(null, "Raman");
        players.put("c", "kumar");
        players.put("d", "Rahul");
        players.put("e", "Srijani");
        System.out.println(players);
        
        
        
        for(Map.Entry<String, String> player: players.entrySet())
        {
            System.out.println(player.getKey() +" : "+player.getValue());
        }
        
        //players.clear();
        System.out.println(players.containsKey("e"));
        System.out.println(players.containsValue("kumar")); 
        
        System.out.println(players.get("a"));
        players.remove(null);
        
        System.out.println(players);
    }

}
