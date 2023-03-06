package corejava;

import java.util.Scanner;

public class EligibleForVoting
{

	public static void main(String[] args)
	
	{
		//creating a Scanner class object
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to check whether you are eligible to vote or not");
		int age = sc.nextInt();
		
		//if else statement
		if(age>18) // for age above 18
		{
			System.out.println("You are eligible to vote");
		}
		else if(age>0 && age<18) //for age below 18 and age above 0
		{
			System.out.println("you are still a minor| you are not eligible to vote");
		}
		else if(age<0) 
		{
			System.out.println("Enter a positive number");
		}
		else
		{
			System.out.println("Enter proper age......");
		}
		sc.close();

	}

}
