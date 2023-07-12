package Collections;

import java.util.Stack;

public class SPractice {

	public static void main(String[] args) {
		//LIFO = Last In First Out---STACK
		//FIFO= First In First Out--QUEUE
		//Stack is a class in java which implements the list interface and extends the vector class and also represents the LIFO principle.
		Stack <String> books = new Stack <>();
		books.push("red");//push and add same
		books.push("black");
		books.push("white");
		//books.clear();
		//System.out.println(books.peek());
		//System.out.println(books.pop());
		//System.out.println(books.search("white"));
		//System.out.println(books.indexOf("white"));



		System.out.println(books.isEmpty());
		System.out.println(books.empty());

		
		}

}
