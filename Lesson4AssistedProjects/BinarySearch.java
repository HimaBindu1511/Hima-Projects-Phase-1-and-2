package Lesson4AssistedProjects;
public class BinarySearch {
 public static int binarySearch(int[] array, int target) {
 int left = 0;
 int right = array.length - 1;
 while (left <= right) {
 int mid = left + (right - left) / 2;
 if (array[mid] == target) {
 return mid; // Element found, return its index
 }
 if (array[mid] < target) {
 left = mid + 1; // Target is in the right half
 } else {
 right = mid - 1; // Target is in the left half
 }
 }
 return -1; // Element not found
 }
 public static void main(String[] args) {
 int[] numbers = {26, 40, 60, 80, 100};
 int target = 80;
 int index = binarySearch(numbers, target);
 if (index != -1) {
 System.out.println("Element found at index: " + index);
 } else {
 System.out.println("Element not found in the array");
 }
 }
}