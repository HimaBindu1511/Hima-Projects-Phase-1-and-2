package CollectionsInJava;
import java.util.*;

public class PracticeInQueue {

	public static void main(String[] args) {
		//priority Queue
		//creation of a queue
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		//Addition of elements into Queue
		pq.add(8);//add and offer both are same
		pq.offer(2);
		pq.offer(2);
		pq.add(7);
		pq.offer(4);
		pq.add(1);
		
		System.out.println(pq);
		
		System.out.println(pq);
		
		
		//Retrieval of the elements
		System.out.println(pq.peek());//only head element will retrives
		
		//remove the data means
		System.out.println(pq.poll());

		System.out.println(pq);
		
		
		//Verification of the elements
		System.out.println(pq.contains(8));
		
		
		//using while loop we can iterate the elements in the queue
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		//we want to clear all the elements in the queue we can use clear
		//Deletion of the elements in Queue
				//pq.poll();
				//pq.remove();
				//pq.clear();
				
				
		System.out.println(pq);
	//add the elements
		//addition --add , offer
		//retrieval--peek
		//removal --poll, remove
		//if there is no data in queue then that time poll will display null but remove will through exception.
	}

}
