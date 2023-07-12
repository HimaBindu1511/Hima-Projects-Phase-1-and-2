package PracticeProjects;
public class ArrayVerification {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = { 5, 10, 15, 20, 25 };

        // Accessing elements of the array
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 2: " + numbers[2]);
        System.out.println("Element at index 4: " + numbers[4]);

        // Modifying elements of the array
        numbers[1] = 12;
        numbers[3] = 18;

        // Displaying the modified array
        System.out.println("Modified array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Length of the array
        System.out.println("Length of the array: " + numbers.length);
    }
}