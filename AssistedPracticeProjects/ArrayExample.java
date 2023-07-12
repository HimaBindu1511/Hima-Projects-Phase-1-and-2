package AssistedPracticeProjects;
public class ArrayExample {
 public static void main(String[] args) {
 // Declare and initialize an array
	 
 int[] numbers = { 1, 2, 3, 4, 5 };
 // Accessing elements in the array
 
 System.out.println("Array:");
 for (int i = 0; i < numbers.length; i++) {
 System.out.println(numbers[i]);
 }
 // Modifying an element in the array
 
 numbers[2] = 10;
 // Accessing a specific element
 
 int element = numbers[3];
 System.out.println("\nElement at index 3: " + element);
//Length of the array
 
int length = numbers.length;
System.out.println("\nLength of the array: " + length);
}
}
