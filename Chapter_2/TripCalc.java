/*
Author: Zac Burrows
Date: 1/23/2020

This program is used to calculate the cost of driving for a trip.
*/
import java.util.Scanner;

class TripCalc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();
		System.out.println("Enter miles per gallon: ");
		double tank = input.nextDouble();
		System.out.println("Enter price per gallon: ");
		double gasPrice = input.nextDouble();
		
		double cost = (distance/tank)*gasPrice;
		double rounded = Math.round(cost*100)/100.0;
		System.out.println("The cost of driving is $" + rounded);
	}
}