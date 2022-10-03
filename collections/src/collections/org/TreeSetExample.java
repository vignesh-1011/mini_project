package collections.org;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        
        Set<String> set=new TreeSet<>();
        set.add("A");
        set.add("W");
        set.add("P");
        set.add("K");
        set.add("M");
        set.add("C");
        
        Set<Integer> set1=new TreeSet<>();
        set1.add(12);
        set1.add(89);
        set1.add(2);
        set1.add(45);
        set1.add(78);
        set1.add(22);
        set1.add(22);
        //set1.add(null);
        
        System.out.println(set);
        System.out.println(set1);
        
        

    }

}
