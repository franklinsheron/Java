package corejava;

import java.util.Scanner;

public class PrimeNonPrime {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		
		
		do {
			System.out.println("Enter a number");
			n = sc.nextInt();
			
				
		}
		while(n<2);
		boolean isPrime = true;
		for(int i=2;i<n/2;i++)
		{
			if(n%i ==0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(n+ "is a prime number");
		}
		else
		{
			System.out.println(n+ "is not a prime");
		}
			
		
		
		
		
	}

}
