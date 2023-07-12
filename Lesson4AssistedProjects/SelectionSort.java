package Lesson4AssistedProjects;
public class SelectionSort {
 public static void selectionSort(int[] array) {
 int length = array.length;
 for (int i = 0; i < length - 1; i++) {
 int minIndex = i;
 // Find the index of the minimum element in the unsorted part of the array
 for (int j = i + 1; j < length; j++) {
 if (array[j] < array[minIndex]) {
 minIndex = j;
 }
 }
 // Swap the minimum element with the first unsorted element
 int temp = array[minIndex];
 array[minIndex] = array[i];
 array[i] = temp;
 }
 }
 public static void main(String[] args) {
 int[] numbers = {5, 3, 8, 4, 2};
 System.out.println("Array before sorting:");
 printArray(numbers);
 selectionSort(numbers);
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