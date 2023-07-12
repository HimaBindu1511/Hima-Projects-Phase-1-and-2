package Collections;
import java.util.*;

public class QPractice {

	public static void main(String[] args) {
		//priority Queue
		//creation of a queue
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(8);
		pq.offer(2);
		pq.offer(2);
		pq.add(7);
		pq.offer(4);
		pq.add(1);
		
		pq.peek();
		pq.poll();
		pq.remove();
		pq.clear();
		
	//	System.out.println(pq);
		//System.out.println(pq.peek());
		//System.out.println(pq.poll());

		System.out.println(pq);
		System.out.println(pq.contains(8));
		//using while loop we can iterate the elements in the queue
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		//we want to clear all the elements in the queue we can use clear
		pq.clear();
		System.out.println(pq);
	//add the elements
		//addition --add , offer
		//retrieval--peek
		//removal --poll, remove
		//if there is no data in queue then that time poll will display null but remove will through exception.
	}

}
