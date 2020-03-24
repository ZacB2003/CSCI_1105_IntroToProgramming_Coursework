/* 
Author: Zac Burrows
Date: 3/24/2020

This program searches a list of numbers between 100 and 200 and finds if each number is divisible by 5 or 6 but not both.
*/
class Ex511 {
	public static void main(String[] args) {
		
		System.out.println("Counting from 100-200");
		System.out.println("Divisible by 5 or 6, but not both");
		System.out.println("------------------------------------");
				
		int position = 0; 		
		for (int x = 100; x <= 200; x++) {
			if (x % 5 == 0 ^ x % 6 == 0) {
				position++;
				if (position % 10 == 0)
					System.out.println(x);
				else
					System.out.print(x + " ");			
					}
				}
				System.out.println();
			}
		}