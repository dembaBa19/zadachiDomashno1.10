
package paki4;

import java.util.Scanner;

public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.println("Enter 10 numbers");
		for(int i=0; i<10; i++) {
			numbers[i]=reader.nextInt();
		}
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<10; j++) {
				if(((int) (Math.random()*2))==1) {
					numbers[j]+=numbers[i];
					numbers[i]=numbers[j]-numbers[i];
					numbers[j]-=numbers[i];
				}
			}
		}
		for(int i=0; i<10; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}