package paki4;

import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		Integer[] usage = new Integer[26];
		for(int a=0; a<26; a++) {
			usage[a]=0;
		}
		String duma1,duma2;
		System.out.println("Enter the first word:");
		duma1=reader.nextLine();
		System.out.println("Enter the second word:");
		duma2=reader.nextLine();
		for(int a=0; a<duma1.length(); a++) {
			if(duma1.charAt(a)>='a' && duma1.charAt(a)<='z') {
				usage[(duma1.charAt(a)-'a')]++;
			}
		}
		for(int a=0; a<duma2.length(); a++) {
			if(duma2.charAt(a)>='a' && duma2.charAt(a)<='z') {
				usage[(duma2.charAt(a)-'a')]--;
			}
		}
		boolean anagram=true;
		for(int a=0; a<26; a++) {
			if(usage[a]==0) {
				continue;
			} else {
				anagram=false;
				System.out.println("Not anagrams.");
				break;
			}
		}
		if(anagram) {
			System.out.println("Anagrams");
		}
		reader.close();
	}

}
