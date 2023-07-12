package CollectionsInJava;

import java.util.*;

public class PracticeInLinkedList {

	public static void main(String[] args) {
	
		LinkedList<String> ll = new LinkedList<>();
		//List Type of Object We can't Access the queues values 
		//we can use LinkedList , Queue , Deque.
		//Queue<Integer> ll = new LinkedList<>();
		ll.add("Y1");
		ll.add("Y2");
		ll.add("Y3");
		ll.add("Y3");
		ll.add("Y3");
        ll.add(null);//LinkedList will allows null values
        ll.add(null);
		ll.add(1,"YY");//based on index
		ll.set(2, "SS");
		System.out.println(ll);
		
		
		//deletion of the elements in the linkedlist
		//ll.remove("YY");
		//ll.removeAll(ll);
		
		
		
		//we want to clear all elements in the linked list.
		//ll.clear();
		
		
        System.out.println(ll);
        //retrieval of the elements
        System.out.println(ll.get(4));
        System.out.println(ll);
        
        
        //verify the elements
        System.out.println(ll.contains("YY"));
        
        
        
        
        //updation of the elements
        ll.set(2, "BB");
        System.out.println(ll);

        
        
        
		}
}
