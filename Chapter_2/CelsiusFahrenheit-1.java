/*
Author: Zac Burrows
Date: 1/17/2020

This program converts temperature in Celsius to Fahrenheit.
*/
import java.util.Scanner;

class CelsiusFahrenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a degree in Celsius: ");
		double Celsius = input.nextDouble();
		double Fahrenheit = (9.0/5)*Celsius+32;
		System.out.println(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit ");	
	}
}