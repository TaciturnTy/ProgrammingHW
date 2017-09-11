/*
Tyler Paulley
Lab #4
Exercise_1.java
Page 460
Oct. 17th, 2013
*/

import java.util.*;
import static java.lang.Math.*;
public class Exercise_1
{
	final static double PI = 3.1416;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		double xC, yC, xP, yP, circleRadius, circleCircum, circleArea, distance;
		
		System.out.print("Please enter the value of x and y for the circle's\n"
			       + "center separated by a space: ");
			xC = scan.nextDouble();
			yC = scan.nextDouble();

		System.out.print("Please enter the value of x and y for a point on\n"
			       + "the circle separated by a space: ");
			xP = scan.nextDouble();
			yP = scan.nextDouble();

		circleRadius = radius(xC, yC, xP, yP);
		circleCircum = circumference(circleRadius);
		circleArea = area(circleRadius);
		
		System.out.printf("%nThe radius of the circle was: %.2f", circleRadius);
		System.out.printf("%nThe diameter of the circle was: %.2f", circleRadius * 2);
		System.out.printf("%nThe circumference of the circle was: %.2f", circleCircum);
		System.out.printf("%nThe area of the circle was: %.2f", circleArea);
	}

	public static double radius(double a1, double b1, double a2, double b2)
	{
		return distance(a1, b1, a2, b2);
	}
	
	public static double distance(double xC, double yC, double xP, double yP)
	{
		double d = sqrt((xP - xC) * (xP - xC) + (yP - yC) * (yP- yC));
		return d;
	}
	
	public static double circumference(double radius)
	{
		return 2 * radius * PI;
	}

	public static double area(double radius)
	{
		return (radius * radius) * 2 * PI;
	}

}
		
