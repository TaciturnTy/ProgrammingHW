/*
Tyler Paulley
Exercise #4 Chapter 11
January 28th, 2014
Circle.java
*/

import static java.lang.Math.*;
public class Circle extends Point
{
	private double radius;

	public Circle()
	{
		super();
		radius = 0.0;
	}

	public Circle(double x, double y)
	{
		super(x, y);
	}

	public Circle(double x, double y, double r)
	{
		super(x, y);
		radius = r;
	}

	public void setRadius(double r)
	{
		radius = r;
	}

	public void setCircle(double x, double y, double r)
	{
		setPoint(x, y);
		radius = r;
	}

	public double getRadius()
	{
		return radius;
	}

	public double area()
	{
		return pow((PI * radius), 2);
	}

	public double circumference()
	{
		return 2 * PI * radius;
	}

	public String toString()
	{
		return super.toString() + String.format("%nCircle:") + "\n\t"
								+ String.format("Radius: %.2f", radius) + "\n\t"
								+ String.format("Area: %.2f", this.area()) + "\n\t"
								+ String.format("Circumference: %.2f", this.circumference());
	}


}