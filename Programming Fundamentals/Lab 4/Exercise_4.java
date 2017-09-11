/*
Tyler Paulley
Lab Assignment 4
Exercise_4.java
October 27th, 2013
*/

import java.util.*;
import static java.lang.Math.*;
public class Exercise_4
{
	static Scanner console = new Scanner(System.in);
	public static void main (String[] args)
	{
		System.out.print("This program takes current price of an item and its prices from one year and\n"
			       + "two years ago and finds the inflation rates. It then finds whether the\n"
			       + "inflation rates are increasing or decreasing.\n");
		
		double priceNow, price1Year, price2Years;
		double inflationRate2to1, inflationRate1toNow;
		int truncate2to1, truncate1toNow;

		System.out.print("\nPlease enter the current price of the item: ");
			priceNow = console.nextDouble();
		System.out.print("\nPlease enter the price of the item 1 year ago: ");
			price1Year = console.nextDouble();
		System.out.print("\nPlease enter the price of the item 2 years ago: ");
			price2Years = console.nextDouble();

		inflationRate2to1 = findInflation(price2Years, price1Year);
	
		inflationRate1toNow = findInflation(price1Year, priceNow);
		
		truncate2to1 = (int) inflationRate2to1;
		truncate1toNow = (int) inflationRate1toNow; 

		System.out.printf("\nThe inflation rate from two years ago to one year ago was: %d%%."
			       + "\nThe inflation rate from one year ago to now was: %d%%", truncate2to1, truncate1toNow);
	}

	public static double findInflation(double priceBefore, double priceAfter)
	{
		double inflation;

		inflation = (priceBefore - priceAfter) / priceBefore;

		inflation= -inflation;

		return inflation * 100; 
	}
}




























			