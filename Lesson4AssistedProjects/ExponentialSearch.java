package Lesson4AssistedProjects;

public class ExponentialSearch {
 public static int exponentialSearch(int[] array, int target) {
 if (array[0] == target) {
 return 0; // Element found at index 0
 }
 int bound = 1;
 int length = array.length;
 while (bound < length && array[bound] <= target) {
 bound *= 2; // Double the bound
 }
 int left = bound / 2; // Start of the binary search range
 int right = Math.min(bound, length - 1); // End of the binary search range
 return binarySearch(array, target, left, right);
 }
 public static int binarySearch(int[] array, int target, int left, int right) {
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
 int[] numbers = {2, 4, 6, 8, 10};
 int target = 8;
 int index = exponentialSearch(numbers, target);
 if (index != -1) {
 System.out.println("Element found at index: " + index);
 } else {
 System.out.println("Element not found in the array.");
 }
 }
}
