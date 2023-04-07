package collection;
import java.util.*;
public class DeQueueExample{

	public static void main(String[] args)
	{
		Deque<String> dq = new ArrayDeque<String>();
		
		dq.add("Ball");
		dq.addFirst("Apple");
		dq.addLast("Cat");
		
		System.out.println("Elements are: "+dq);
		
		System.out.println("Removed elements: "+dq.pop());
		
		System.out.println("First elements is "+dq.pollFirst());
		System.out.println("Last Element is "+dq.pollLast());

	}

}
