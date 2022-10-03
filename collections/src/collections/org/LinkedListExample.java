package collections.org;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        
        List<Integer> score=new LinkedList<>();
        score.add(25);
        score.add(40);
        score.add(30);
        score.add(35);
        score.add(20);
        
        System.out.println(score);
        
        for(Integer i:score)
        {
            System.out.println(i);
        }
    
                for(int i=0;i<score.size();i++)
                {
                    System.out.println(score.get(i));
                }

                
                Iterator<Integer> iterator=score.iterator();
                while(iterator.hasNext())
                {
                    System.out.println(iterator.next());
                }
                
        System.out.println(score.contains(20)); 
        System.out.println(score.isEmpty());
        System.out.println(score.lastIndexOf(20));
        System.out.println(score.set(2, 70));
        System.out.println(score);
    }

}
