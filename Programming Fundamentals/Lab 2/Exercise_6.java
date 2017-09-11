/*
Tyler Paulley
Lab Assignment 2
Exercise 6
Sept. 26, 2013
Page 243
*/

import java.util.*;
import static java.lang.Math.*;
public class Exercise_6
{
	static Scanner console = new Scanner (System.in);
	public static void main (String[] args)
	{
		double a;
		double b;
		double c;
		
		System.out.print("Please enter a, b, and c for the quadratic equation" +
				"\nwhere ax^2 + bx + c = 0, a != 0: ");
	 	System.out.print("\na = ");
			a = console.nextDouble();
		System.out.print("b = ");
			b = console.nextDouble();
		System.out.print("c = ");
			c = console.nextDouble();

		double discriminantEquation = pow(b,2) - 4 * a * c;
		double discriminant = sqrt(discriminantEquation);
			
		if (discriminantEquation == 0)
		{
			double repeatedRoot = -b / 2 * a;
			System.out.print("\nThe repeated root is : " + repeatedRoot);
		}
		if (discriminantEquation < 0)
		{
			double complexRoot1 = (-b + discriminant) / 2 * a;
			double complexRoot2 = (-b - discriminant) / 2 * a;
			System.out.print("\nThe first complex root is : " + complexRoot1);
			System.out.print("\nThe second complex root is : " + complexRoot2);
		}
		if (discriminantEquation >= 0)
		{
			double root1 = (-b + discriminant) / 2 * a;
			double root2 = (-b - discriminant) / 2 * a;
			System.out.print("\nThe first root is : " + root1);
			System.out.print("\nThe second root is : " + root2);
		}
			
	}

}










