package CollectionsInJava;

import java.util.Stack;

public class PracticeInStack {

	public static void main(String[] args) {
		//LIFO = Last In First Out---STACK
		//FIFO= First In First Out--QUEUE
		//Stack is a class in java which implements the list interface and extends the vector class and also represents the LIFO principle.
		Stack <String> books = new Stack <>();
		books.push("red");//push and add same
		books.push("black");
		books.push("white");
		books.push("Yellow");
		books.push("blue");
		books.push("orange");
		books.push("grey");
		
		
		//books.clear();
		//we want to see last element in the stack.
		System.out.println(books.peek());
		
		
		//remove the elements
		//System.out.println(books.pop());
		
		
		//search the elements
		System.out.println(books.search("white"));
		//System.out.println(books.indexOf("white"));
		
		
		//update the books
		books.set(0,"Black");
		System.out.println(books);




		
		}

}
