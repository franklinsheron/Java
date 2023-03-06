package corejava;

import java.util.Scanner;

public class Multiplication 
{

	public static void main(String[] args) 
	{
		//creating scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the number of which you want to print the table");
		int number = sc.nextInt();
		
		//using for loop
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+"x"+i + "="+ (number*i));
			
		}
		sc.close();
		
		
	}

}
