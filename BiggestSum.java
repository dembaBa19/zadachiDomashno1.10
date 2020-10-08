package paki4;

import java.util.Scanner;

public class BiggestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner reader = new Scanner(System.in);
		System.out.println("Enter a 5x5 matrix : ");
		int biggestSum=0,biggestSumIndex=0;
		int[][] matrix = new int[5][5];
		int[] sum = new int[5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				matrix[i][j]=reader.nextInt();
				sum[i]+=matrix[i][j];
			}
			if(i==0) {
				biggestSum=sum[i];
				biggestSumIndex=0;
			} else {
				if(biggestSum<sum[i]) {
					biggestSum=sum[i];
					biggestSumIndex=i;
				}
			}
		}
		System.out.println("Biggest sum from a line is " + biggestSum + " from line number " + biggestSumIndex+1);
	}

}
