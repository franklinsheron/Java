package collection;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) 
	{
		//create an object of queue interface
		Queue<Integer> q = new LinkedList<>();
		//add elements
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		//display elements of the queue
		System.out.println("ELements of the queue: "+q);
		
		//to remove the head of queue
		int r=q.remove(); //removes head of element as it has fifo
		System.out.println("removed element of the queue: "+r);
		System.out.println("Elemets after removing : "+q);
		
		int h=q.peek(); //this peek method gives the head of element
		System.out.println("Head element of queue: "+h);
		//printing size of queue
		int s=q.size();
		System.out.println("Size of queue:"+s);
		
		

	}

}
