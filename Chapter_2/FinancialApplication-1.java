/*
Author: Zac Burrows
Date: 1/22/2020

This program is used to solve the amount in a financial account with an interest rate.
*/
import java.util.Scanner;

class FinancialApplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter monthly saving amount:");
		double Savings = input.nextDouble();
		double Month1 = Savings*(1+0.00417);
		double Month2 = (Savings+Month1)*(1+0.00417);
		double Month3 = (Savings+Month2)*(1+0.00417);
		double Month4 = (Savings+Month3)*(1+0.00417);
		double Month5 = (Savings+Month4)*(1+0.00417);
		double Month6 = (Savings+Month5)*(1+0.00417);
		System.out.println("After the sixth month, the account value is $" + Month6);
	}
}