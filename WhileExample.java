package corejava;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 10");
		int a;
		 a = sc.nextInt();
		
		while(a<1 || a>10)
		{
			System.out.println("Invalid input please enter a value between 1 and 10....");
			System.out.println("Enter a number between 1 and 10");
			 a = sc.nextInt();
		}
		System.out.println("You entered a number : " +a);

	}

}
