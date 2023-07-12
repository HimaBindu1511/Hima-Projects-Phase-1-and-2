package Lesson4AssistedProjects;

public class InsertionSort {
 public static void insertionSort(int[] array) {
 int length = array.length;
 for (int i = 1; i < length; i++) {
 int key = array[i];
 int j = i - 1;
 while (j >= 0 && array[j] > key) {
 array[j + 1] = array[j];
 j--;
 }
 array[j + 1] = key;
 }
 }
 public static void main(String[] args) {
 int[] numbers = {5, 3, 8, 4, 2};
 System.out.println("Array before sorting:");
 printArray(numbers);
 insertionSort(numbers);
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
