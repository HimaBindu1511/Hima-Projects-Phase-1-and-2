package Collections;

import java.util.*;

public class LPractice {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("S1");
		al.add("S2");
		LinkedList<String> ll = new LinkedList<>();
		//List Type of Object We can't Access the queues values we can use LinkedList , Queue , Deque.
		//Queue<Integer> ll = new LinkedList<>();
		ll.add("Y1");
		ll.add("Y2");
		ll.add("Y3");
		ll.add("Y3");
		ll.add("Y3");
         ll.add(null);
         ll.add(null);
		ll.add(1,"YY");
		ll.addAll(0, al);
		ll.set(2, "SS");
		//ll.remove("YY");
		//ll.clear();
		//ll.removeAll(al);
		
        System.out.println(ll);
        for(String s: ll) {
        	System.out.println(s);
        }
        
		}
}
