/*
Tyler Paulley
Exercise #4 Chapter 11
January 28th, 2014
TestCircle.java
*/

public class TestCircle
{
	public static void main (String[] args)
	{
//Testing the Circle constructors
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Circle circle3 = new Circle(1, 1, 3);

//Testing the Circle mutators
		circle1.setCircle(1, 1, 1);
		circle2.setPoint(2, 2);
		circle2.setRadius(2);

//Testing the Circle accessors
		System.out.println("The center of circle1 is: " + circle1.getPoint()
				+ "\nThe radius of circle1 is: " + circle1.getRadius());

		System.out.println("\nThe area of circle2 is: " + circle2.area());
		System.out.println("The circumference of circle2 is: " + circle2.circumference());

//Tesing the Circle classes's toString method
		System.out.println();
		System.out.println(circle3);
	}
}

