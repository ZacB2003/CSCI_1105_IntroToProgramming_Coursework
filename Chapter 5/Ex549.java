/*
Author: Zac Burrows
Date: 3/24/2020

This program searches a string of characters and determines how many vowels and consonants it contains.
*/
import java.util.Scanner;

class Ex549 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a string:");
		
		String v = input.nextLine();
		int cons = 0;
		int vow = 0;
		
		for (int x = v.length() -1; x>= 0; x--) {
			switch (v.toUpperCase() .charAt(x)) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					vow++;
					break;
				case ' ':
					break;
				default:
					cons++;
					break;
					
			}
		}
		System.out.println("There are " + vow + " vowels and " + cons + " consonants in this string.");
	}
}