package AssistedPracticeProjects;

import java.util.HashMap;
import java.util.Map;

public class mapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		 map.put("One", 1);
		 map.put("Two", 2);
		 map.put("Three", 3);
		 System.out.println("\nMap:");
		 for (Map.Entry<String, Integer> entry : map.entrySet()) {
		 System.out.println(entry.getKey() + " -> " + entry.getValue());

	}

}
}
