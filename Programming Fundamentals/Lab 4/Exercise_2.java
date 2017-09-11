/*
Tyler Paulley
Lab Assignment 4
Exercise_2.java
October 27th, 2013
*/

import java.util.*;
import static java.lang.Math.*;
public class Exercise_2
{
	static Scanner console = new Scanner(System.in);
	public static void main (String[] args)
	{
		int number;
		boolean palindrome = false;
		
		System.out.print("This program takes an integer and tests whether it is a palindrome.\n"
			       + "Please enter an integer.\n");
			number = console.nextInt();

		palindrome = isPalindrome(number);

		if(palindrome == true)
			System.out.print("The integer " + number + " was a palindrome.");
		
		else
			System.out.print("The integer " + number + " was not a palindrome.");
	}

	public static boolean isPalindrome(int Number)
	{
		int numberReversed = 0;
		int tempNumber = Number;
		int digitHolder;
		
		if(Number < 10)
			return true;
		
		while(tempNumber != 0)
		{
			digitHolder = tempNumber % 10;
			numberReversed = numberReversed * 10 + digitHolder;
			tempNumber/=10;
		}
		
		if(numberReversed == Number)
			return true;
		else
			return false;

	}
}



















	
		
				