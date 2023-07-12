package ExpectionHandling;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capital of India: ");
        String capital = scanner.nextLine();
        try {
            checkCapital(capital);
            System.out.println("Correct capital!");
        } catch (InvalidCapitalException e) {
            System.out.println("Invalid capital!");
        }
    }
    public static void checkCapital(String capital) throws InvalidCapitalException {
        if (!capital.equalsIgnoreCase("Delhi")) {
            throw new InvalidCapitalException("The capital of India is Delhi!");
            }
    }
}
class InvalidCapitalException extends Exception {
    public InvalidCapitalException(String message) {
        super(message);
        }
    }