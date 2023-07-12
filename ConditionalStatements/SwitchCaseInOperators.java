package ConditionalStatements;

import java.util.Scanner;

public class SwitchCaseInOperators {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner obj=new Scanner(System.in);
		double first=obj.nextDouble();
		double second=obj.nextDouble();
		System.out.println("enter an operator(+,-,*,/):");
		char operator=obj.next().charAt(0);
		double result=0;
		switch(operator) {
		case '+':
		result=first+second;
		break;
		case '-':
		result=first-second;
		break;
		case '*':
		result=first*second;
		break;
		case '/':
		result=first/second;
		break;
		default:
		System.out.println("invalid ");
		}
		System.out.println("the output is:"+result);


	}

}
