package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
        int numRows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int numCols = sc.nextInt();

        int[][] array = new int[numRows][numCols];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int[] rowSums = new int[numRows];
        int[] colSums = new int[numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                rowSums[i] += array[i][j];
                colSums[j] += array[i][j];
            }
        }

        System.out.println("The sum of each row is:");
        System.out.println(Arrays.toString(rowSums));

        System.out.println("The sum of each column is:");
        System.out.println(Arrays.toString(colSums));


	}

}
