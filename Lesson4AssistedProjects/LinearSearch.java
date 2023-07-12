package Lesson4AssistedProjects;

public class LinearSearch {
 public static int linearSearch(int[] array, int target) {
 for (int i = 0; i < array.length; i++) {
 if (array[i] == target) {
 return i; // Element found, return its index
 }
 }
 return -1; // Element not found
 }
 public static void main(String[] args) {
 int[] numbers = {10, 23, 88, 34, 20};
 int target = 34;
 int index = linearSearch(numbers, target);
 if (index != -1) {
 System.out.println("Element found at index: " + index);
 } else {
 System.out.println("Element not found in the array.");
 }
 }
}
