/*
Author: Zac Burrows
Date: 1/30/2020

This program solves an algebraic equation with cramer's rule, this time however it utilizes an if-else statement.
*/
import java.util.Scanner;

class FancyCramers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		double a = input.nextDouble();
		System.out.println("Enter b: ");
		double b = input.nextDouble();
		System.out.println("Enter c: ");
		double c = input.nextDouble();
		System.out.println("Enter d: ");
		double d = input.nextDouble();
		System.out.println("Enter e: ");
		double e = input.nextDouble();
		System.out.println("Enter f: ");
		double f = input.nextDouble();
		
		double x = (((e*d)-(b*f))/((a*d)-(b*c)));
		double y = (((a*f)-(e*c))/((a*d)-(b*c)));
		e = (a*x)+(b*y);
		f = (c*x)+(d*y);
		
		if (a*d - b*c == 0) {
			System.out.println("The equation has no solution.");
		} 
		else {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}

	}
}