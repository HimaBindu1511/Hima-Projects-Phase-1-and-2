package phase1AssistedProject;

public class TryAndCatch {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            // Exception handling code
            System.out.println("An error occurred: " + ex.getMessage());
        }
    }

    public static int divide(int num1, int num2) {
        // Division operation that may throw an ArithmeticException
        return num1 / num2;
    }
}