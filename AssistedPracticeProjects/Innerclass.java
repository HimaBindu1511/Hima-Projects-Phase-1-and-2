package AssistedPracticeProjects;

public class Innerclass {
 private String outerName;
 public Innerclass(String outerName) {
 this.outerName = outerName;
 }
 public void outerMethod() {
 System.out.println("Outer Method");
 }
 // Inner Class
 public class InnerClass {
 private String innerName;
 public InnerClass(String innerName) {
 this.innerName = innerName;
 }
 public void innerMethod() {
 System.out.println("Inner Method");
 System.out.println("Outer Name: " + outerName);
 }
 }
 public static void main(String[] args) {
 Innerclass outerObj = new Innerclass("Outer");
 Innerclass.InnerClass innerObj = outerObj.new InnerClass("Inner");
 innerObj.innerMethod();
 }
}
