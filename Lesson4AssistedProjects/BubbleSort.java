package Lesson4AssistedProjects;
public class BubbleSort {
 public static void bubbleSort(int[] array) {
 int length = array.length;
 for (int i = 0; i < length - 1; i++) {
 for (int j = 0; j < length - i - 1; j++) {
 if (array[j] > array[j + 1]) {
 // Swap array[j] and array[j+1]
 int temp = array[j];
 array[j] = array[j + 1];
 array[j + 1] = temp;
 }
 }
 }
 }
 public static void main(String[] args) {
 int[] numbers = {5, 3, 8, 4, 2};
 System.out.println("Array before sorting:");
 printArray(numbers);
 bubbleSort(numbers);
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