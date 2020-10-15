package paki4;

import java.util.Scanner;

public class sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a 9x9 sudoku : ");
		int[][] matrix = new int[9][9];
		boolean[] ima9 = new boolean[10];
		boolean valid=true;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				matrix[i][j]=reader.nextInt();
			}
		}
		for(int i=1; i<=9; i++) {
			ima9[i]=false;
		}
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				ima9[matrix[i][j]]=true;
			}
			for(int a=1; a<=9; a++) {
				if(!ima9[a]) {
					valid=false;
					break;
				}
			}
			for(int c=1; c<=9; c++) {
				ima9[i]=false;
			}
		}
		for(int i=1; i<=9; i++) {
			ima9[i]=false;
		}
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				ima9[matrix[j][i]]=true;
			}
			for(int a=1; a<=9; a++) {
				if(!ima9[a]) {
					valid=false;
					break;
				}
			}
			for(int c=1; c<=9; c++) {
				ima9[i]=false;
			}
		}
		for(int i=1; i<=9; i++) {
			ima9[i]=false;
		}
		for(int a=0; a<3; a++) {
			for(int b=0; b<3; b++) {
				for(int i=a*3; i<a*3+3; i++) {
					for(int j=b*3; j<b*3+3; j++) {
						ima9[matrix[j][i]]=true;
					}
				}
				for(int c=1; c<=9; c++) {
					if(!ima9[c]) {
						valid=false;
						break;
					}
				}
				for(int i=1; i<=9; i++) {
					ima9[i]=false;
				}
			}
		}
		if(valid) {
			System.out.println("Valid");
		} else {
			System.out.println("Not Valid");
		}
	}

}
