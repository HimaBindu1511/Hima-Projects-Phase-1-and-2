package AssistedPracticeProjects;

public class AcessesModifiers {
 private int privateVariable;
 public int publicVariable;
 protected int protectedVariable;
 private void privateMethod() {
 System.out.println("This is a private method.");
 }
 public void publicMethod() {
 System.out.println("This is a public method.");
 }
 protected void protectedMethod() {
 System.out.println("This is a protected method.");
 }
 public static void main(String[] args) {
 AcessesModifiers obj = new AcessesModifiers();
 
 // Accessing variables
 
 obj.privateVariable = 10;
 obj.publicVariable = 20;
 obj.protectedVariable = 30;
 System.out.println("Accessing variables:");
 System.out.println("Private variable: " + obj.privateVariable);
 
//Accessing methods
 
obj.privateMethod();
obj.publicMethod();
obj.protectedMethod();
}
}