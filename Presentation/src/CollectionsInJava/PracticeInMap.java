package CollectionsInJava;
import java.util.*;

public class PracticeInMap {


	public static void main(String[] args) {
		//creation of map
		Map< Integer , String> m = new Hashtable<>();
		//Addition of elements into the map
		m.put(5005, "Hyderabad");
		m.put(30030, "Delhi");
		m.put(20202, "chennai");
		System.out.println(m);
		
		
		//retrieval of keys  from the map
		Set<Integer> keys = m.keySet();
		for(Integer key : keys) {
			System.out.println(key);
		}
		
		
		//Retrieval of values from the map
		Collection<String> values = m.values();
		for (String value : values) {
			System.out.println(value);
		}
		
		
		
		//Retrieval of value from the map based on a key
		//System.out.println(m.get(5005));
		
		for(Integer key : keys) {
			System.out.println(key + ">>>>>" + m.get(key));
		}
		
		
		
		//deletion of element from the map
		//m.remove(5005);
		
		
		//Verification of the elements
		System.out.println(m.containsKey(5005));
		System.out.println(m.containsKey(2005));
		System.out.println(m.containsValue(5005));
		System.out.println(m.containsKey(30030));
		System.out.println(m);
		
		//update the element
		m.put(4567, "Banglore");
		System.out.println(m);


		

	}

}
