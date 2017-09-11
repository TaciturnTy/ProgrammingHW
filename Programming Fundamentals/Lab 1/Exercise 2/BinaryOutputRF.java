/*
Tyler Paulley
Lab Assignment #1
Exercise 2
September 4th, 2013
*/

/*
******************************************************
************** Programming Assignment # 1 ************
************** Fundamentals of Programming ***********
************** Author: Tyler Paulley *****************
************** Due Date: September 5, 2013 ***********
************** Submitted: September 5,2013 ***********
******************************************************
*/

//BinaryOutputRF.java


import java.util.Scanner;

public class BinaryOutputRF 
{

	static Scanner console = new Scanner (System.in);

	public static void main (String[] args)
	{

		int base ;

		int number ;

		System.out.print ("\nPlease enter the base: ");
		base = console.nextInt();

		System.out.print ("\nPlease enter the number: ");
		number = console.nextInt();

	
		System.out.println ("\nYour base is: " + base);
		System.out.println ("Your base number is: " + number);
		System.out.print ("Your answer is: ");

		binaryOutput(number,base);

		System.exit ( 0) ;

	}

	public static void binaryOutput (int number, int base)
	{
		
		if ( number != 0 )
		{
		
			binaryOutput (number/base, base);
			System.out.print (number % base);
		}
	
	}

}