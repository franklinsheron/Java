package collection;
import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) 
	{
		Set<String> s = new TreeSet<String>();
		
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("C");
		
		//in hash set and tree set both these will not take duplicate values 
		//for eg check line 11 & 12 it prints C only one time
		
		System.out.println("Elements are: "+s);

	}

}
