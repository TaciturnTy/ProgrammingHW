/*
Tyler Paulley
Lab Assignment #3
Exercise_4.java
Oct. 6th, 2013
Page 321, Exercise 8
*/

import java.lang.Math.*;
import java.util.*;
public class Exercise_4
{
	static Scanner console = new Scanner(System.in);
	public static void main (String[]args)
	{
		int number;
		int sign = 1;
		int ndigits = 0;
		int sum = 0;
		int nextDigit;
		
		System.out.println("This program takes an input of a positive integer and "
				   + "\noutputs whether or not the integer is divisible by 11."
				   + "\nTo find this, the program uses a variable t where "
				   + "\nt = (digit 1 - digit 2 + digit 3 - digit 4..)");
		System.out.print("\nPlease enter a positive integer to check "
				 + "its divisibility by 11: ");
			number = console.nextInt();

		int temp = number;

		while (number <= 0)
		{
			System.out.print("Not a positive integer!\n");
			System.out.print("Please enter a positive integer to check "
					 + "its divisibility by 11: ");
			number = console.nextInt();
		}

		while(number != 0)
		{
			number /= 10;
			ndigits++;
		}
		
		number = temp;

		for(int i = 1; i <= ndigits; i++)
		{
			nextDigit = number / (int) Math.pow(10,ndigits - i);
			sum = sum + nextDigit * sign;
			number %= Math.pow(10, ndigits - i);
			sign = sign * (-1);
		}
		
		if(sum % 11 == 0)
		{
			System.out.print("\nThe number was divisible by 11 since "
					 + "\nt was divisible by 11."
					 + "\n\nSince t = " + sum
					 + " is divisible by 11,\nthe number " + temp
					 + " is also divisible by 11.");
		}
		
		else
		{
		System.out.print("\nThe number was not divisible by 11 since "
				 + "\nt wasn't divisible by 11."
				 + "\n\nSince t = " + sum
				 + " isn't divisible by 11,\nthe number " + temp
				 + " is also not divisible by 11.");
		}
	}
}