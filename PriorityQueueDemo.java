package collection;

import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args)
	{						
		PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
		
		pq.add(11);
		pq.add(15);
		pq.add(20);
		pq.add(18);
		
		System.out.println("Total elements are: "+pq);
		
		System.out.println("Top element is "+pq.peek());
		System.out.println("Removed element is "+pq.poll());
		System.out.println("Total element: "+pq);
		
	}

}
