package collections.org;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        
        Queue<Integer> queue=new PriorityQueue<>();
        
        
          queue.add(12); 
          queue.add(22); 
          queue.add(32); 
          queue.add(42); 
          queue.add(5);
          queue.add(62); 
          queue.add(72);
         // queue.add(null);
         
        
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.peek());
        
        System.out.println("Before revome operation:"+queue);
        queue.remove();
        System.out.println("After revome operation:"+queue);
        queue.poll();
        System.out.println("After poll operation:"+queue);
        
        Iterator<Integer> itr=queue.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        
        for(Integer i:queue)
        {
            System.out.println(i);
        }
        
        
    }

}
