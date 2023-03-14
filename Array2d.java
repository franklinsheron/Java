package Arrays;

import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);//this is multidimensional array
		//get the dimension of the array from the user
		System.out.println("Enter the number of rows: ");
		int r =sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int c = sc.nextInt();
		//create the array with the user specified dimension
		int [][] arr = new int[r][c];
		// get the values for the arrays from the user
		System.out.println("Enter the values for the array: ");
		for(int i =0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.printf("Enter the values for elements (%d,%d):",i,j);
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("THe Array is: ");
		for(int i =0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
			}				
	}		
}
