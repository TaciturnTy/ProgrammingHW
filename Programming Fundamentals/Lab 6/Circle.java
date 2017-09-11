/*
Tyler Paulley
Lab Assignment 6
Circle.java
Nov. 6th, 2013
*/

public class Circle extends Object
{
	private double xCoordinate;
	private double yCoordinate;
	private double radius;

	public Circle()
	{
		xCoordinate = 0.0;
		yCoordinate = 0.0;
		radius = 1.0;
		
	}

	public Circle(double x, double y)
	{
		xCoordinate = x;
		yCoordinate = y;
		radius = 1.0;
	}

	public Circle(double x, double y, double r)
	{
		xCoordinate = x;
		yCoordinate = y;
		radius = r;
	}

	public void setXCoordinate(double x)
		{xCoordinate = x;}
	
	public void setYCoordinate(double y)
		{yCoordinate = y;}

	public void setRadius(double r)
		{radius = r;}
	
	public double getXCoordinate()
		{return xCoordinate;}
		
	public double getYCoordinate()
		{return yCoordinate;}

	public double getRadius()
		{return radius;}
	
	public double area()
		{return Math.PI * radius * radius;}

	public double circumference()
		{return 2.0 * Math.PI * radius;}
	
	public void print()
	{
		String output = " ";
		output = output + "\nCircle:\n\tThe center of the circle is at: ( "
			        + getXCoordinate() + ", " + getYCoordinate() + " ).";
		output += "\n\tRadius of the circle is = " + getRadius();
		output += "\n\tArea of the circle is = " + area();
		output += "\n\tCircumference of the circle is = " + circumference();
		System.out.println(output);
	}
}
	









