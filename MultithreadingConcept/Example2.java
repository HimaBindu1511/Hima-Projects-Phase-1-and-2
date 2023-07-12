package MultithreadingConcept;

// of Thread at time of Creation
  
// Importing I/O classes from java.io package
import java.io.*;
  
// Class 1
// Helper class
@SuppressWarnings("unused")
class ThreadNaming extends Thread {
  
	// Parameterized constructor
    ThreadNaming(String name)
    {
        // Call to constructor of
        // the Thread class as super keyword
        // refers
    	super(name);
    }
    public void run()
    {
    	System.out.println("Theard is running......");
    }
    }
// Main class
class GFG {
  
    // main driver method
    public static void main(String[] args)
    {
  
        // Creating two threads
        ThreadNaming t1 = new ThreadNaming("geek1");
        ThreadNaming t2 = new ThreadNaming("geek2");
  
        // Getting the above created threads names.
        System.out.println("Thread 1: " + t1.getName());
        System.out.println("Thread 2: " + t2.getName());
  
        // Starting threads using start() method
        t1.start();
        t2.start();
    }
}
