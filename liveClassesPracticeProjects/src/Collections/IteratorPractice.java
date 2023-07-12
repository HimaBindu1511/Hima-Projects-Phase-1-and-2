package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {

	public static void main(String[] args) {
		//legacy classes -v1.0 + v1.2
		//one direction , read -only with special permission for removing
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(34);
		al.add(45);
		Iterator<Integer> i = al.iterator();
		//i.hasNext()
		//i.next()
		while(i.hasNext()) {
			i.next();
			i.remove();
		}
		System.out.println(al);


	}

}
