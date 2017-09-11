/*
Tyler Paulley
Lab Assignment #3
Exercise_5.java
Oct. 6th, 2013
Page 323, Exercise 19
*/

import java.lang.Math.*;
import java.util.*;
public class Exercise_5
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		double loanAmount;
		double LOAN_AMOUNT;
		double interestRatePerYear;
		double monthlyPayment;
		double interestRatePerMonth;
		double decimalMonthlyInterest;
		double afterMonth = 0;
		int monthsToPay = 0;

		System.out.print("Please enter the loan amount here: ");
			loanAmount = console.nextDouble();
			
		LOAN_AMOUNT = loanAmount;
		
		System.out.print("Please enter the interest rate " +
				 "\nper year here (ex. 7.2% = 7.2): ");
			interestRatePerYear = console.nextDouble();
		
		System.out.print("Please enter your monthly payment here: ");
			monthlyPayment = console.nextDouble();
		
		interestRatePerMonth = interestRatePerYear / 12;
		decimalMonthlyInterest = (interestRatePerMonth / 100);
		
		while (decimalMonthlyInterest * loanAmount >= monthlyPayment)
		{
			System.out.print("The monthly payment isn't great enough to " +
					 "pay off the loan's interest. \nPlease try again.");
			
			System.out.print("\n\nPlease enter the loan amount here: ");
				loanAmount = console.nextDouble();
		
			System.out.print("Please enter the interest rate " +
					 "\nper year here (ex. 7.2% = 7.2): ");
				interestRatePerYear = console.nextDouble();
		
			System.out.print("Please enter your monthly payment here: ");
				monthlyPayment = console.nextDouble();
		
			interestRatePerMonth = interestRatePerYear / 12;
			decimalMonthlyInterest = (interestRatePerMonth / 100);
		}

		decimalMonthlyInterest = decimalMonthlyInterest + 1;

		do
		{
			afterMonth = decimalMonthlyInterest * LOAN_AMOUNT - monthlyPayment;
			LOAN_AMOUNT = afterMonth;
			monthsToPay++;
		}
		while(afterMonth > 0);

		System.out.print("\nYou entered " + loanAmount + " for the loan amount.\n");
		System.out.print("You entered " + interestRatePerYear + "% for the yearly interest.");
		System.out.print("\nYou entered " + monthlyPayment + " for the monthly payment.");
		System.out.print("\nIt will take " + monthsToPay + " months to pay off the loan.");
		
	}
} 
			
				






		