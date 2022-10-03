package collections.org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        
        set.add("Sunday");
        set.add("Monday");
        set.add("Tuesday");
        set.add("Wednesday");
        set.add("Thursday");
        set.add("Friday");
        set.add("Saturday");
        System.out.println(set);
        
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(56);
        list.add(89);
        list.add(90);
        
        HashSet<Integer> myset=new HashSet<>(list);
        //myset.addAll(list);
        System.out.println(myset);
        myset.add(95);
        System.out.println(myset);
        
        List<Integer> list1=new ArrayList<>();
        list1.add(89);
        list1.add(12);
        
        System.out.println(myset.containsAll(list1));
        

    }

}
