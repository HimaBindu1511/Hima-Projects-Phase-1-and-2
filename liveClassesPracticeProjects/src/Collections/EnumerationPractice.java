package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationPractice {

	public static void main(String[] args) {
		//Enumeration-Interface
		//Introduced for iterating the legacy collection objects
		//legacy classes-v1.0--HashTable, stack, vector, Dictionary, properties.
		//new classes--v1.2
		Vector<Integer> v = new Vector<>();
		v.add(12);
		v.add(34);
		v.add(25);
		v.add(45);
		Enumeration<Integer> e=v.elements();
		//e.hasMoreElements()
		//e.nextElement()
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
