package CollectionsInJava;

import java.util.*;

public class PracticeInList {

	public static void main(String[] args) {
		//vector example
		//Creation of vector list
		Vector<String> v1 = new Vector<>();
		//Addition of Elements
		v1.add("Apple");
		v1.add("Banana");
		v1.add(0,"cherry");//adding the index 0
		v1.add("kiwi");
		v1.add("Guava");
		v1.add("orange");
		v1.add("Graps");
		System.out.println(v1);
		
		
		
		//size and capacity of the vector
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		
		//retrieval of elements we have to pass index of the elements.
		System.out.println(v1.get(1));
		
		
		
		//Deletion of the elements
		v1.remove(1);//pass index 
		System.out.println(v1);
		v1.remove("cherry");
		System.out.println(v1);
		
		
		//Verification of elements
		System.out.println(v1.contains("kiwi"));
		System.out.println(v1.containsAll(v1));
		
		
		
		//Updation of elements
		v1.set(1, "mango");
		System.out.println(v1.get(1));
		System.out.println(v1);
		}

}
