package collections.org;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        
        Set<Integer> set1=new LinkedHashSet<>();
        
        set1.add(62);
        set1.add(22);
        set1.add(52);
        set1.add(92);
        set1.add(72);
        set1.add(42);
        set1.add(null);
        set1.add(42);
        System.out.println(set1);
        
        Set<Integer> set2=new LinkedHashSet<>();
        
        set2.add(12);
        set2.add(22);
        set2.add(52);
        set2.add(92);
    
        
        
        System.out.println(set1.equals(set2));
        
        
          Iterator<Integer> itr=set1.iterator();
          
          while(itr.hasNext()) { System.out.println(itr.next()); }
          
          System.out.println(set1.addAll(set2)); 
          
          System.out.println(set1.containsAll(set2));
          
          System.out.println(set1);
          System.out.println(set2);
          System.out.println(set1.retainAll(set2));
          System.out.println(set1);
          
          
          
          
         

    }

}
