/*
Tyler Paulley
Lab Assignment 2
Exercise 5
Sept. 26, 2013
Page 175
*/

import java.util.*;
import java.lang.Math.*;
public class Exercise_5
{
	static Scanner console = new Scanner (System.in);
	public static void main (String[] args)
	{
		double density;
		double mass;
		double volume;
		
		System.out.print("Please enter the the mass in grams: ");
			mass = console.nextDouble();
		System.out.print("Please enter the density in grams/cubic centimeter: ");
			density = console.nextDouble();

		volume = mass / density;

		System.out.printf("The volume is: %.2f", volume);
	 	System.out.print("grams/cm^3");
	}
	
}