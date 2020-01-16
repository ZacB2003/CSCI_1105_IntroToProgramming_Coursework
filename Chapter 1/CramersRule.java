/*
Author: Zac Burrows
Date: 1/16/2020

This program solves a more complex equation using Cramer's Rule.
*/	
import java.util.Scanner;
class CramersRule 
{
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a, b, c, d, e, f:");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		double e = in.nextDouble();
		double f = in.nextDouble();
		if ((a*d)-(b*c) != 0) {
			double x = (((e*d)-(b*f))/((a*d)-(b*c)));
			double y = (((a*f)-(e*c))/((a*d)-(b*c)));
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
		else {
			System.out.println("The equation has no solution.");
		}
	}
}