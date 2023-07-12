package Collections;

import java.util.*;

public class dqpractice {

	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<>();
		//addition
		ad.add("banana");
		ad.addFirst("cherry");
		ad.addLast("apple");
		ad.offerFirst("kiwi");
		ad.offer("pear");
		ad.offerLast("mango");
		System.out.println(ad);
		//peek
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		//poll
		System.out.println(ad.poll());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
		System.out.println(ad);
		//size
		System.out.println(ad.size());
       //default capacity is 17 in deque
		//addition--we want to add on head-offer first--tail--offer last
		//peek--peek first, peek last , peek
		//removal--poll, poll first, poll last ,remove, remove first, remove last.

	}

}
