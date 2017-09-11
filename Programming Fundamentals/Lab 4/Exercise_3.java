/*
Tyler Paulley
Lab Assignment 4
Exercise_3.java
October 27th, 2013
*/

import java.util.*;
import static java.lang.Math.*;
public class Exercise_3
{
	static Scanner console = new Scanner(System.in);
	public static void main (String[]args)
	{
		double L, r;
		int t, m, paymentsMade;
		int totalPaymentsNeeded;

		System.out.print("Please enter your loan amount: ");
			L = console.nextDouble();
		System.out.print("Please enter the interest rate as a decimal, e.g. %5.0 = .05: ");
			r = console.nextDouble();
		System.out.print("Please enter the number of payments per year: ");
			m = console.nextInt();
		System.out.print("Please enter the number of years for the loan: ");
			t = console.nextInt();
		System.out.print("Please enter the number of payments made: ");
			paymentsMade = console.nextInt();

		int totalPayments = m * t;
		
		double periodicPayment = paymentCalculator(L, r, t, m);

		double unpaidBalance = balanceCalculator(periodicPayment, paymentsMade, L, r, t, m);

		System.out.println("\nThe total number of payments needed to pay the loan was " 
			       + totalPayments + ".");
		System.out.printf("%nThe periodic payment on the loan was: $%.2f", periodicPayment);
		System.out.printf("%nThe amount that still needs to be paid after %d" 
			        + " payments is: $%.2f", paymentsMade, unpaidBalance);
	}
	
	public static double paymentCalculator(double L, double r, int t, int m)
	{
		double periodicPayment;

		double power = -m * t;

		double i = r / m;
		
		periodicPayment = (L * i) / (1 - pow((1 + i), power));
		
		return periodicPayment;
	}

	public static double balanceCalculator(double pP, int pM, double L, 
							double r, int t, int m)
	{
		double unpaidBalance;

		double i = r / m;
		
		double power = -(m * t - pM);

		unpaidBalance = pP * ((1 - pow((1 + i), power)) / i );
		
		return unpaidBalance;
	}
}
















