package collection;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) 
	{
		Set<String> hs = new HashSet<String>();
		hs.add("Frank");
		hs.add("james");
		hs.add("Shiva");
		hs.add("Shubham");
		
		System.out.println("Printing the set: "+hs);
		
		String c ="Paras";
		
		//Check whether the string is available of not
		System.out.println("Contains elements: "+c+" "+hs.contains(c));
		

	}

}
