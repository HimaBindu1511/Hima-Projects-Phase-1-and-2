package phase1AssistedProject;

class MyThread extends Thread {
    public void run() {
        // Code to be executed in the thread
        System.out.println("Thread is running!");
    }
}

public class threadExample {
    public static void main(String[] args) {
        // Create an instance of the custom thread
        MyThread thread = new MyThread();
        
        // Start the thread
        thread.start();
    }
}