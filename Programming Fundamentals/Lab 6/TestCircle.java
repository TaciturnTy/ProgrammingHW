/*
Tyler Paulley
Lab Assignment 6
TestCircle.java
Nov. 6th, 2013
*/

public class TestCircle extends Object
{
	public static void main (String[]args)
	{
		Circle circleOne = new Circle();
		circleOne.print();

		Circle circleTwo = new Circle(1.0, 2.0);
		circleTwo.print();

		circleOne.setXCoordinate(1.0);
		circleOne.setYCoordinate(2.0);

		System.out.println("The x-coordinate of circle one is: "
				   + circleOne.getXCoordinate());
		System.out.println("The y-coordinate of circle one is: "
				   + circleOne.getYCoordinate());

		circleTwo.setRadius(3.0);
		System.out.println("The radius of circle two is: " + circleTwo.getRadius());

		Circle circleThree = new Circle(1.0, 3.0, 5.0);
		circleThree.print();

		System.out.println("The area of circle three is: " + circleThree.area());
		System.out.println("The circumference of circle three is: "
				   + circleThree.circumference());
	}
}