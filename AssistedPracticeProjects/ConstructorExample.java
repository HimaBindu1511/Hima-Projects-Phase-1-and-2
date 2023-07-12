package AssistedPracticeProjects;
public class ConstructorExample {
 private String name;
 private int age;
 // Default constructor
 
 public ConstructorExample() {
 name = "John Doe";
 age = 0;
 }
 // Parameterized constructor
 
 public ConstructorExample(String name, int age) {
 this.name = name;
 this.age = age;
 }
 // Copy constructor
 
 public ConstructorExample(ConstructorExample other) {
	 this.name = other.name;
	 this.age = other.age;
 }
 public void displayInfo() {
	 System.out.println("Name: " + name);
	 System.out.println("Age: " + age);
	 }
	 public static void main(String[] args) {
		 
	 // Creating objects using different constructors
		 
	 ConstructorExample obj1 = new ConstructorExample(); // Default constructor
	 ConstructorExample obj2 = new ConstructorExample("Alice", 30); // Parameterized constructor
	 ConstructorExample obj3 = new ConstructorExample(obj2); // Copy constructor
	 // Displaying object information
	 
	 System.out.println("Object 1:");
	 obj1.displayInfo();
	 System.out.println("\nObject 2:");
	 obj2.displayInfo();
	 System.out.println("\nObject 3:");
	 obj3.displayInfo();
	 }
	}
 
