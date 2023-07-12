package Lesson4AssistedProjects;
public class MergeSort {
 public static void mergeSort(int[] array) {
 int length = array.length;
 if (length < 2) {
 return; // Base case: Array is already sorted
 }
 int mid = length / 2;
 int[] leftArray = new int[mid];
 int[] rightArray = new int[length - mid];
 // Populate left and right arrays
 for (int i = 0; i < mid; i++) {
 leftArray[i] = array[i];
 }
 for (int i = mid; i < length; i++) {
 rightArray[i - mid] = array[i];
 }
 mergeSort(leftArray); // Sort the left array recursively
 mergeSort(rightArray); // Sort the right array recursively
 merge(leftArray, rightArray, array); // Merge the sorted arrays
 }
 public static void merge(int[] leftArray, int[] rightArray, int[] array) {
 int leftLength = leftArray.length;
 int rightLength = rightArray.length;
 int i = 0, j = 0, k = 0;
 while (i < leftLength && j < rightLength) {
 if (leftArray[i] <= rightArray[j]) {
 array[k] = leftArray[i];
 i++;
 } else {
 array[k] = rightArray[j];
 j++;
 }
 k++;
 }
 // Copy the remaining elements from the left array
 while (i < leftLength) {
 array[k] = leftArray[i];
 i++;
 k++;
 }
 // Copy the remaining elements from the right array
 while (j < rightLength) {
 array[k] = rightArray[j];
 j++;
 k++;
 }
 }
 public static void main(String[] args) {
 int[] numbers = {5, 3, 8, 4, 2};
 System.out.println("Array before sorting:");
 printArray(numbers);
 mergeSort(numbers);
 System.out.println("Array after sorting:");
 printArray(numbers);
 }
 public static void printArray(int[] array) {
 for (int num : array) {
 System.out.print(num + " ");
 }
 System.out.println();
 }
}