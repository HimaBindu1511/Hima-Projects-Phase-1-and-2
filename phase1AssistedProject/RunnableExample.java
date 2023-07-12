package phase1AssistedProject;

public class RunnableExample implements Runnable {
    public void run() {
        // Code to be executed in the thread
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        RunnableExample runnable = new RunnableExample();
        Thread thread = new Thread(runnable);
        thread.start(); // Start the thread
    }
}