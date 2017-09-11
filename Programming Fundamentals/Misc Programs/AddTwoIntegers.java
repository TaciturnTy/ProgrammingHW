/*
Tyler Paulley
Programming Fundamentals
September 5th, 2013
*/

/*
Write a complete java program to add two integers entered from 
the keyboard. Please display prompts for inputs. Display the integers 
and their sum with appropriate headings.
*/

//AddTwoIntegers.java

import java.util.Scanner;
public class AddTwoIntegers {
	
	static Scanner console = new Scanner (System.in);
	
	public static void main (String[] args){
		int first;
		int second;
		int sum;
		
		System.out.print ("\nPlease enter the first integer:");
		first = console.nextInt();
	
		System.out.print ("\nPlease enter the second integer:");
		second = console.nextInt();

		sum = first + second;

		System.out.println ("\nThe first integer is:" + first);
		System.out.println ("\nThe first integer is:" + second);
		System.out.println ("\nThe sum of the two integers is:" + sum);
	
	}//main

}//AddTwoIntegers
