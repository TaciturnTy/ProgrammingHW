/*
Tyler Paulley
Exercise #5 Chapter 11
January 28th, 2014
TestCylinder.java
*/

public class TestCylinder
{
	public static void main (String[] args)
	{
//Testing the Cylinder constructors
		Cylinder cylinder1 = new Cylinder();
		Cylinder cylinder2 = new Cylinder(2, 2, 2, 2);
		Cylinder cylinder3 = new Cylinder(1, 1, 3, 5);

//Testing the Cylinder mutators
		cylinder1.setCylinder(3, 3, 3, 3);
		cylinder2.setRadius(4);
		cylinder2.setHeight(6);

		System.out.println("cylinder1's values have been set as follows:\n"
						 + "The x-value is " + cylinder1.getX()
						 + "\nThe y-value is " + cylinder1.getY()
						 + "\nThe radius is " + cylinder1.getRadius()
						 + "\nThe height is " + cylinder1.getHeight());

		System.out.println("\nThe radius of cylinder2 has been changed \n"
						 + "from 2 to " + cylinder2.getRadius());

		System.out.println("\nThe height of cylinder2 has been changed \n"
						 + "from 2 to " + cylinder2.getHeight());

//Testing the Cylinder accessors
		System.out.println("\nThe height of cylinder3 is: " +
						 + cylinder3.getHeight());

//Testing the Circle classes's toString method
		System.out.println();
		System.out.println(cylinder3);
	}
}

