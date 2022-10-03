package collections.org;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(34);
        deque.add(24);
        deque.add(34);
        deque.add(44);
        deque.add(94);
        deque.add(4);
        deque.add(74);
        
        
        System.out.println(deque);
        deque.addFirst(14);
        
        
        System.out.println(deque);
        
        deque.addLast(90);
        
        System.out.println(deque);
        
        
        deque.removeFirst();
        System.out.println(deque);
        
        deque.removeLast();
        System.out.println(deque);
        
        
        deque.add(66);
        System.out.println(deque);
        
       /* for(Integer i:deque)
        {
            System.out.println(i);
        }*/
        
        System.out.println(deque.offer(34));
        System.out.println(deque);
        
        
    }

}
