/*
Tyler Paulley
Lab Assignment 2
Exercise 1
Sept. 19th, 2013
Page 109
*/

import java.util.*;
import static java.lang.Math.*;
public class Exercise_1
{
	static Scanner console = new Scanner (System.in);
	public static void main (String[] args)
	{
	
		double dec1;
		double dec2;
		double dec3;
		double dec4;
		double dec5;
		double sum;
		double average;

		System.out.print("Please enter the first decimal number:");
			dec1 = console.nextDouble();

		System.out.print("\nPlease enter the second decimal number:");
			dec2 = console.nextDouble();

		System.out.print("\nPlease enter the third decimal number:");
			dec3 = console.nextDouble();

		System.out.print("\nPlease enter the fourth decimal number:");
			dec4 = console.nextDouble();

		System.out.print("\nPlease enter the fifth decimal number:");
			dec5 = console.nextDouble();
		

		System.out.print("\nFirst Decimal: " + dec1 );
		System.out.print("\nSecond Decimal: " + dec2 );
		System.out.print("\nThird Decimal: " + dec3 );
		System.out.print("\nFourth Decimal: " + dec4 );
		System.out.print("\nFifth Decimal: " + dec5 );

		dec1 = round(dec1);
		dec2 = round(dec2);
		dec3 = round(dec3);
		dec4 = round(dec4);
		dec5 = round(dec5);

		sum = dec1+dec2+dec3+dec4+dec5;
		average = sum / 5;
		
		System.out.print("\nThe sum of the rounded decimals is: " + sum);
		System.out.print("\nThe average of the rounded decimals is: " + average);
	}

}

		
		
		
		