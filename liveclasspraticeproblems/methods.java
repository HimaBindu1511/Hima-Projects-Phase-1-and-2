package liveclasspraticeproblems;

import java.util.Scanner;

    //class is a blue print to create object. Class is a group of variables and methods
class Student{
	      //instance variables
	int rollno;
	String name;  //String is pre defined class in java.lang to store no of characters
	int maths, english, hindi;

	// instance methods
	void display(){
		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
		System.out.println("Maths marks="+maths);
		System.out.println("english marks="+english);
		System.out.println("hindi="+hindi);

	}
	void getInfo() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your rollno");
		rollno=scan.nextInt();
		System.out.println("Enter your name");
		name=scan.next();
		System.out.println("Enter maths marks");
		maths=scan.nextInt();
		System.out.println("Enter english marks");
		english=scan.nextInt();
		System.out.println("Enter hindi marks");
		hindi=scan.nextInt();
		
	}

}

