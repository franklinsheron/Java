package corejava;

import java.util.Scanner;

public class DoWHile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		
		
		do
		{
			System.out.println("Enter a positive number");
			m = sc.nextInt();
		}
		while(m<=0);
		
			int fact = 1;
			for(int i=1;i<=m;i++)
			{
				fact *=i;
				
			}
			System.out.println(m+"!=" +fact);
		

	}

}
