package paki4;

import java.util.Scanner;

public class TransponiranaRedica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int rows,columns;
		int[][] matrix = new int[20][20];
		int[][] matrix2 = new int[20][20];
		System.out.println("Enter the number of rows of the matrix :");
		rows=reader.nextInt();
		System.out.println("Enter the number of columns of the matrix : ");
		columns=reader.nextInt();
		System.out.println("Enter a " + rows + "x" + columns + "matrix : ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				matrix[i][j] = reader.nextInt();
			}
		}
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				matrix2[j][i] = matrix[i][j];
			}
		}
		for(int i=0; i<columns; i++) {
			for(int j=0; j<rows; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		//System.out.println("Biggest sum from a line is " + biggestSum + " from line number " + biggestSumIndex+1);
	}

}
