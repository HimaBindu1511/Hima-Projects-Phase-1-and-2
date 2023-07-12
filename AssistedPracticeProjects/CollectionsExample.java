package AssistedPracticeProjects;

import java.util.*;
public class CollectionsExample {
 public static void main(String[] args) {
 // List
	 
 List<String> list = new ArrayList<>();
 list.add("Apple");
 list.add("Banana");
 list.add("Orange");
 System.out.println("List:");
 for (String item : list) {
 System.out.println(item);
 }
 // Set
 
 Set<Integer> set = new HashSet<>();
 set.add(10);
 set.add(20);
 set.add(30);
 System.out.println("\nSet:");
 for (Integer item : set) {
 System.out.println(item);
 }
 // Map
 
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