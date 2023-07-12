package phase1AssistedProject;

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Inheritance: Subclass that inherits from the Person class
class Employee extends Person {
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

// Polymorphism: Method overloading
class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// Abstraction: Abstract class with abstract method
abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class OOPDemo {
    public static void main(String[] args) {
        // Creating objects and accessing methods
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        System.out.println("Person: Name - " + person.getName() + ", Age - " + person.getAge());

        Employee employee = new Employee();
        employee.setName("Jane");
        employee.setAge(25);
        employee.setSalary(50000);
        System.out.println("Employee: Name - " + employee.getName() + ", Age - " + employee.getAge() + ", Salary - " + employee.getSalary());

        // Polymorphism: Method overloading
        MathUtils mathUtils = new MathUtils();
        int result1 = mathUtils.add(5, 10);
        double result2 = mathUtils.add(2.5, 3.7);
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);

        // Abstraction: Creating objects of abstract class
        Circle circle = new Circle(5.0);
        double area = circle.calculateArea();
        System.out.println("Circle Area: " + area);
    }
}