package collections.org;
import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SplitIteratorExample {

    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<> ();
        
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        
        Stream<Integer> str=list.stream();
    
        Spliterator<Integer> splititr=str.spliterator();
       // System.out.println(splititr.characteristics());
        System.out.println(splititr.estimateSize());
        
        splititr.forEachRemaining( i -> System.out.println(i));
        
        
        System.out.println(splititr.estimateSize());
        System.out.println(splititr.characteristics());

    }

}