/*
Tyler Paulley
Lab Assignment #3
Exercise_2.java
Oct. 6th, 2013
Page 319, Exercise 1
*/

import java.lang.Math.*;
import java.util.*;
public class Exercise_2
{
	static Scanner crazy = new Scanner(System.in);
	public static void main (String[]args)
	{
		boolean inNegative = false;
		int number;
		int sum = 0;	
		int n;
		int ndigits = 0;
		int num;

		System.out.print("Please type in your number: ");
			number = crazy.nextInt();
			n = number; num = number;

		if (number < 0)
		{
			number = -number;
			inNegative = true;
		}
			num = number;

		while(n != 0)
		{
			n = n / 10;
			ndigits++;
		}
		
		if (ndigits == 0)
			System.out.print("\nYou entered zero.");

		if (inNegative)
			System.out.print("\nYour number was negative.");

		System.out.print("\nYour number was: " + number + "\nYour digits are: ");

		for(int i = 1; i <= ndigits; i++)
		{
		System.out.print(number / (int) Math.pow(10, ndigits - i) + " ");
		number %= (int) Math.pow(10, ndigits - i);
		}
	
		do
		{
			sum = sum + num % 10;
			num = num / 10;
		}
		while (num > 0);
	
	System.out.print("\nThe sum of the digits is: " + sum);
	}
}








