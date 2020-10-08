package paki4;

import java.util.Scanner;

public class Pick4Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int[] numbers = new int[10];
		char[] cardPower = {'2','3','4','5','6','7','8','9','T','J','Q','K','A'};
		String[] boq = {"Spades","Hearts","Diamonds","Clubs"};
		String[] pickedCards = new String[4];
		for(int i=0; i<4; i++) {
			double a = Math.random()*13;
			double b = Math.random()*4;
			int rand = (int) a;
			int rand2 = (int) b;
			String currentCard = cardPower[rand] + boq[rand2];
			for(int j=0; j<i; j++) {
				if(currentCard.equals(pickedCards[j])) {
					i--;
					break;
				}
			}
			pickedCards[i]=currentCard;
		}
		for(int i=0; i<4; i++) {
			System.out.print(pickedCards[i] + " ");
		}
	}

}
