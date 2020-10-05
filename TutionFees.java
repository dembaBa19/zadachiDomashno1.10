package paki4;

import java.util.Scanner;

public class TutionFees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double increase=0.06;
		double tutionfee=10000;
		int years=10;
		for(int a=0; a<years; a++) {
			tutionfee+=tutionfee*increase;
		}
		System.out.println("In " + years + " years the tution fee will be " + tutionfee);
		int additionalYears=4;
		double sum=0;
		for(int a=0; a<additionalYears; a++) {
			tutionfee+=tutionfee*increase;
			sum+=tutionfee;
		}

		System.out.println("Total fees in the next " + additionalYears
				+ " will be " + sum);
		reader.close();
	}

}
