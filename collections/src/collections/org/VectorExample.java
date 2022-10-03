package collections.org;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        
        Vector<String> vector=new Vector<>();
        
        vector.add("item 1");
        vector.add("item 2");
        vector.add("item 3");
        vector.add("item 4");
        
        
        System.out.println(vector);
        
        vector.remove("item 3");
        
        
        System.out.println(vector);
        System.out.println(vector.capacity());
        vector.ensureCapacity(20);
        System.out.println(vector.capacity());
        
        vector.set(0, "item A");
        
        
        Iterator<String> itr=vector.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

}
