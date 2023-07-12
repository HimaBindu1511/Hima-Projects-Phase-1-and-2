package phase1AssistedProject;

public class SleepAndWaitExample {
    public static void main(String[] args) {
        Thread sleepThread = new Thread(new SleepThread());
        Thread waitThread = new Thread(new WaitThread());

        sleepThread.start();
        waitThread.start();
    }

    private static class SleepThread implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println("SleepThread is running.");
                Thread.sleep(2000); // Sleep for 2 seconds
                System.out.println("SleepThread woke up.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class WaitThread implements Runnable {
        @Override
        public void run() {
            synchronized (this) {
                try {
                    System.out.println("WaitThread is running.");
                    wait(2000); // Wait for 2 seconds
                    System.out.println("WaitThread woke up.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
