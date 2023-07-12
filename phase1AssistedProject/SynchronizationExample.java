package phase1AssistedProject;

public class SynchronizationExample {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        Thread thread1 = new Thread(new IncrementThread(sharedData));
        Thread thread2 = new Thread(new DecrementThread(sharedData));

        thread1.start();
        thread2.start();
    }

    private static class SharedData {
        private int counter = 0;

        public synchronized void increment() {
            counter++;
            System.out.println("Increment: Counter = " + counter);
        }

        public synchronized void decrement() {
            counter--;
            System.out.println("Decrement: Counter = " + counter);
        }
    }

    private static class IncrementThread implements Runnable {
        private final SharedData sharedData;

        public IncrementThread(SharedData sharedData) {
            this.sharedData = sharedData;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                sharedData.increment();
            }
        }
    }

    private static class DecrementThread implements Runnable {
        private final SharedData sharedData;

        public DecrementThread(SharedData sharedData) {
            this.sharedData = sharedData;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                sharedData.decrement();
            }
        }
    }
}