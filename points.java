package paki4;

import java.util.Scanner;

public class points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int[] points = new int[8];
		int students = 8, questions = 10;
		char answer[][] = new char[8][10];
		System.out.println("Enter answers for every student (8 students, 10 questions) .");
		for(int i=0; i<students; i++) {
			for(int j=0; j<questions; j++) {
				answer[i][j]=reader.next().charAt(0);
			}
		}
		System.out.println("Enter answers.");
		char[] key = new char[10];
		for(int i=0; i<questions; i++) {
			key[i] = reader.next().charAt(0);
		}
		for(int i=0; i<students; i++) {
			for(int j=0; j<questions; j++) {
				if(key[j]==(answer[i][j])) {
					points[i]++;
				}
			}
		}
		for(int i=0; i<students; i++) {
			System.out.println("Student " + (i+1) + " has " + points[i] + " points.");
		}
	}

}