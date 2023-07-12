package ConditionalStatements;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int x=4;
		if(x>0)
		{
		System.out.println("Positive number");
		if(x%2==0)
		{
		System.out.println("Even Number");
		}
		else {
		System.out.println("Number is positive but it is odd");
		}
		}
		else {
		System.out.println("Number is Negative");
		}

	}

}
