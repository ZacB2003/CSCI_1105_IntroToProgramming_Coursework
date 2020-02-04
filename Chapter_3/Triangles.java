/*
Author: Zac Burrows
Date: 1/31/2020

This program finds if a triangles sides are valid, and if they are it computes the perimeter.
*/
import java.util.Scanner;

class Triangles {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter side a: ");
		double a = input.nextDouble();
		System.out.println("Enter side b: ");
		double b = input.nextDouble();
		System.out.println("Enter side c: ");
		double c = input.nextDouble();
		
		double p = a+b+c;
		
		if (a+b > c && b+c > a && a+c > b){
			System.out.println("The perimeter is: " + p);
				}
			}
		} else {
			System.out.println("Triangle is invalid");
		}
	}
}
