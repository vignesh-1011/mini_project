package collections.org;

import java.util.ArrayList;

import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Integer> sort=new ArrayList<>();
         sort.add(23);
         sort.add(2);
         sort.add(33);
         sort.add(13);
         sort.add(1);
         sort.add(5);
         sort.add(4);
         sort.add(7);
         sort.add(15);
         sort.add(6);
         Collections.sort(sort);
         System.out.println(sort);
         

	}

}
