package AssistedPracticeProjects;

public class TypeCastingExample {
 public static void main(String[] args) {
	 
 // Implicit type casting (Widening Conversion)
	 
 int numInt = 100;
 long numLong = numInt; // Implicit casting from int to long
 System.out.println("Implicit casting: int to long");
 System.out.println("numInt: " + numInt);
 System.out.println("numLong: " + numLong);
 
 // Explicit type casting (Narrowing Conversion)
 
 double numDouble = 123.45;
 int numIntAgain = (int) numDouble; // Explicit casting from double to int
 System.out.println("\nExplicit casting: double to int");
 System.out.println("numDouble: " + numDouble);
 System.out.println("numIntAgain: " + numIntAgain);
 }
}