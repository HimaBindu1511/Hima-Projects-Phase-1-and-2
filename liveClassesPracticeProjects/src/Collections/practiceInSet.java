package Collections;

import java.util.*;

public class practiceInSet {

	public static void main(String[] args) {
		//HashSet is a class and it uses to store the data internally in HashMap and it stores the data internally in array of nodes(key, value)
		//Set<Integer> hs = new HashSet<>();
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(11);
		hs.add(13);
		hs.add(35);
		hs.add(40);
		hs.add(28);
		//set does not allow the duplicate values.
		hs.add(10);
		hs.add(11);
		//HashMap<Integer,String> hm = new HashMap<>();
		//hm.keySet();
		//remove the data in set pass data not a index
		hs.remove(35);
		hs.remove(1);
		System.out.println(hs.remove(1));
		//verification of data in the set
		System.out.println(hs.contains(13));
		//retrevial
		//for(Integer element :hs) {
			//System.out.println(element);
			//clear the data in the set
			hs.clear();
			//size 
			hs.size();
		//}
		System.out.println(hs);
      }

}
