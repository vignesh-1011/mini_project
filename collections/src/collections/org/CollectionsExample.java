package collections.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

    public static void main(String[] args) {
        
        List<Integer> list=new ArrayList<>(20);
        list.add(23);
        list.add(3);
        list.add(67);
        list.add(89);
        list.add(33);
        list.add(25);
        list.add(99);
        System.out.println(list);
        
        Collections.swap(list, 0, 1);
        
        System.out.println(list);
        
        Collections.addAll(list, 123,67,51);
        
        System.out.println(list);
        
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        
        Collections.shuffle(list);
        System.out.println(list);
        
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        
        Collections.replaceAll(list, 33, 44);

        
        System.out.println(list);
        
        List<Integer> list1=new ArrayList<>();
        
         list1.add(33);
         list1.add(33);
         list1.add(33);
         list1.add(33);
         list1.add(33);
         list1.add(33);
         list1.add(33);
         list1.add(33);
         list1.add(33);
         list1.add(33);
        
        
          System.out.println(list1); 
          Collections.copy(list1,list);
         
        System.out.println(list1);
        

    }

}
