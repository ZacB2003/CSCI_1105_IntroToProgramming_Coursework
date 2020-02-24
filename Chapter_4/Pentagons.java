/*
Author: Zac Burrows
Date: 2/04/2020

This program serves the purpose of solving the area of a pentagon.
*/
import java.util.Scanner;

class Pentagons {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length from the center to the vertex: ");
		double r = input.nextDouble();
		double s = 2*r * Math.sin(3.1415 / 5);
		double area = (5*(s * s))/(4*Math.tan(3.1415/5));
		double rounded = Math.round(area*100)/100.0;
		System.out.println("The area of the pentagon is " + rounded);
	}
}