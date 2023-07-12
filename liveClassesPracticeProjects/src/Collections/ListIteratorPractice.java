package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorPractice {

	public static void main(String[] args) {
		//Introduced for iterating the only list type of collection of objects.
		//bi Direction, Read and Write
		ArrayList<Integer> al = new ArrayList<>();
		al.add(23);
		al.add(34);
		al.add(56);
		ListIterator<Integer> li = al.listIterator();
		//forward direction
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println();
		//backward direction
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
		li.remove();
		System.out.println(al);
		
		

	}

}
