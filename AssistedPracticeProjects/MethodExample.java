package AssistedPracticeProjects;

public class MethodExample {
 // Method without parameters
	
 public void methodWithoutParameters() {
 System.out.println("This is a method without parameters.");
 }
 // Method with parameters
 
 public void methodWithParameters(String name, int age) {
 System.out.println("Name: " + name);
 System.out.println("Age: " + age);
 }
 // Method with return value
 
 public int methodWithReturnValue(int a, int b) {
 return a + b;
 }
 public static void main(String[] args) {
 MethodExample obj = new MethodExample();
 
 // Calling a method without parameters
 
 obj.methodWithoutParameters();
 
 // Calling a method with parameters
 
 String name = "John";
 int age = 25;
 obj.methodWithParameters(name, age);
 // Calling a method with return value
 
 int result = obj.methodWithReturnValue(5, 7);
 System.out.println("Sum: " + result);
}
}
