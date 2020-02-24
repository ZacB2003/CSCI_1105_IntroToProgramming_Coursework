/*
Author: Zac Burrows
Date: 2/19/2020

This program calculates the annual pay of an employee after taxes.
*/
import java.util.Scanner;

class PayRoll{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.println("Enter number of hours worked: ");
		Double hours = input.nextDouble();
		
		System.out.println("Enter hourly pay rate: ");
		Double payRate = input.nextDouble();
		
		System.out.println("Enter federal tax withholding rate: ");
		Double fedTax = input.nextDouble();
		
		System.out.println("Enter state tax withholding rate: ");
		Double stateTax = input.nextDouble();
		
		System.out.println("\n");
		
		Double grossPay = payRate * hours;
		
		Double fedPercent = fedTax * 100;
		Double statePercent = stateTax * 100;
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.printf("Pay Rate: $%4.2f %n",payRate);
		System.out.printf("Gross Pay: $%4.2f %n",grossPay);
		
		System.out.println("Deductions: ");
		Double fedHold = fedTax * grossPay;
		Double stateHold = stateTax * grossPay;
		System.out.printf("Federal Withholding (%4.2f): $%4.2f %n",fedPercent,fedHold);
		System.out.printf("State Withholding (%4.2f): $%4.2f %n",statePercent, stateHold);
		Double totalDeduct = fedHold + stateHold;
		System.out.printf("Total Deduction: $%4.2f %n",totalDeduct);
		
		Double netPay = grossPay - totalDeduct;
		System.out.printf("Net Pay: %4.2f",netPay);
	}
}