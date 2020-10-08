package paki4;

import java.util.Scanner;

public class Rearrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.println("Enter 10 numbers");
		for(int i=0; i<10; i++) {
			numbers[i]=reader.nextInt();
		}
		for(int i=0; i<9; i++) {
			numbers[i+1]+=numbers[i];
			numbers[i]=numbers[i+1]-numbers[i];
			numbers[i+1]-=numbers[i];
		}
		for(int i=0; i<10; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
