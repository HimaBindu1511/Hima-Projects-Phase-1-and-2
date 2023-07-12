package Collections;

import java.util.TreeSet;

public class tsetpractice {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(19);
		ts.add(11);
		ts.add(23);
		ts.add(69);
		ts.add(79);
		System.out.println(ts);
		//same operations in a tree set as in a hash set
		//some additional elements
		System.out.println(ts.first());//highest elements
		System.out.println(ts.last());//lowest elements
		System.out.println(ts.pollFirst());//highest  elements remove
		System.out.println(ts.pollLast());//lowest  elements remove

		System.out.println(ts);
		//subset
		System.out.println(ts.subSet(19, 23));//subset is a virtual element it will print between elements in two elements
		System.out.println(ts.descendingSet());
		}

}
