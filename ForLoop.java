package corejava;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times you want to print Happy Holi");
		int number  = sc.nextInt();
		for(int i=0;i<number;i++)
		{
			System.out.println("Happy Holi");
			
		}

	}

}
