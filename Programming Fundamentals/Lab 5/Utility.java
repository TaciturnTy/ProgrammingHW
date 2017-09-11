/*
Tyler Paulley
Utility.java
Oct. 31, 2013
Lab Assignment 5
*/

import static java.lang.Math.*;
public class Utility
{

//TESTING WHETHER A NUMBER IS EVEN
	public static boolean isEven(int number)
	{
		if(number % 2 == 0)
			return true;
		else
			return false;
	}

//TESTING WHETHER A NUMBER IS ODD	
	public static boolean isOdd(int number)
	{
		if(number % 2 == 1)
			return true;
		else
			return false;
	}
	
//TESTING WHETHER A NUMBER IS PRIME
	public static boolean isPrime(int number)
	{
		if(number == 2 || number == 3)
			return true;
		
		if(number % 2 == 0)
			return false;
		
		for(int d = 3; d <= (int) Math.sqrt(number) + 1; d +=2)
		{
			if(number % d == 0)
				return false;
		}
		return true;
	}
	
//FINDING THE FACTORIAL OF A NUMBER (int, long, double)
	public static int factorial(int n)
	{
		int fact = 1;
		
		if(n == 0 || n == 1)
			return 1;

		for(int i = 2; i <= n; i++)
			fact *=i;

		return fact;
	}

	public static long factorial(long n)
	{
		long fact = 1;
		
		if(n == 0 || n == 1)
			return 1;

		for(int i = 2; i <= n; i++)
			fact *=i;

		return fact;
	}

	public static double factorial(double n)
	{
		double fact = 1;
		
		if(((int) n == 0) || ((int) n == 1))
			return fact;

		for(int i = 2; i <= (int) n; i++)
			fact *=i;

		return fact;
	}

//FINDING THE MAXIMUM OF A SET OF NUMBERS (SETS OF 3, 4, AND 5)
	public static int max(int a, int b, int c)
	{
		int temp = a;
		
		if(temp < b)
			temp = b;
		
		if(temp < c)
			temp = c;
		
		return temp;
	}

	public static int max(int a, int b, int c, int d)
	{
		int temp = a;
		
		if(temp < b)
			temp = b;
		
		if(temp < c)
			temp = c;
		
		if(temp < d)
			temp = d;
		
		return temp;
	}

		public static int max(int a, int b, int c, int d, int e)
	{
		int temp = a;
		
		if(temp < b)
			temp = b;
		
		if(temp < c)
			temp = c;
		
		if(temp < d)
			temp = d;
		
		if(temp < e)
			temp = e;
		
		return temp;
	}
	
//FINDING THE MINIMUM OF A SET OF NUMBERS (SETS OF 3, 4 AND 5)
	public static int min(int a, int b, int c)
	{
		int temp = a;
		
		if(temp > b)
			temp = b;
		
		if(temp > c)
			temp = c;
		
		return temp;
	}

	public static int min(int a, int b, int c, int d)
	{
		int temp = a;
		
		if(temp > b)
			temp = b;
		
		if(temp > c)
			temp = c;
		
		if(temp > d)
			temp = d;
		
		return temp;
	}

		public static int min(int a, int b, int c, int d, int e)
	{
		int temp = a;
		
		if(temp > b)
			temp = b;
		
		if(temp > c)
			temp = c;
		
		if(temp > d)
			temp = d;
		
		if(temp > e)
			temp = e;
		
		return temp;
	}

//FINDING THE SUM OF AN ARITHMETIC SERIES
	public static int sumOfAS(int f, int l, int d)
	{
		int sum = 0;
		int term = f;

		for(int i = f; i <= l; i +=d)
		{
			sum +=term;
			term +=d;
		}		
		return sum;
	}
}	
	





























		