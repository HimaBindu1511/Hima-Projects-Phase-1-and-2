package ConditionalStatements;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		String day;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Day");
		day=scanner.nextLine();
		switch(day){
		case "monday" :
		System.out.println("Hey , It is a working day");
		break;
		case "tuesday":
		System.out.println("Hey , It is a working day");
		break;
		case "wedensday":
		System.out.println("Hey , It is a working day");
		break;
		case "thursday" :
		System.out.println("Hey , It is a working day");
		break;
		case "friday":
		System.out.println("Hey , It is a working day");
		break;
		case "saturday":
		System.out.println("Hey , It is a Weekend");
		break;
		case "sunday":
		System.out.println("Hey , it is a Weekend");
		break;
		}

	}

}
