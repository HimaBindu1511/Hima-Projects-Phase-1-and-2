package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,2,3,4,5};

		ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(arr));
		al1.add(5);
		al1.add(0,8);
		al1.add(5);
		al1.add(0,8);
		al1.add(5);
		al1.add(0,8);
		al1.add(5);
		al1.add(0,8);
		al1.add(5);
		al1.add(0,8);
		al1.add(52);
		al1.add(5);
		al1.add(0,8);
		al1.add(5);
		al1.add(0,8);
		al1.add(5);
		System.out.println(al1);
		System.out.println(al1.size());
		System.out.println(al1.get(2));
		System.out.println(al1.contains(2));
		System.out.println(al1.containsAll(al1));
		System.out.println(al1.set(0,12));
		System.out.println(al1);
		System.out.println(al1.indexOf(2));
		System.out.println(al1.lastIndexOf(5));
		//for(int i=0;i<al1.size();i++)
		//{
		//	System.out.print(al1.get(i) + " ");

		//}
		// for each loop
		for(Integer integer : al1) {
			System.out.print(integer + " ");

		}
		Collections.synchronizedList(al1); //by using the collections class ArrayList will be synchronised.
		//ArrayList will increase only 50 percent of list and vector it will increase the 100 percent of list.
		// vector List will handles the multiple threads at one by one.
		// Array List will handles the multiple threads at a time by facing some situations.
		//vector list is the best way to handle the multithreading concept.
		
 }

}
