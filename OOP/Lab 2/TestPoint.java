/*
Tyler Paulley
Exercise #3 Chapter 11
January 28th, 2014
TestPoint.java
*/

public class TestPoint
{
	public static void main(String[] args)
	{
		Point point1 = new Point();
		Point point2 = new Point();
		Point point3 = new Point(3, 4);
		Point point4 = new Point();
		Point point5 = new Point();

//Testing the Mutators
		point1.setPoint(1, 1);
		point2.setX(2);
		point2.setY(2);

//Testing makeCopy method and the equals method
		point4.makeCopy(point3);
		if (point3.equals(point4))
			System.out.println("true, method equals works");
		else
			System.out.println("false, I messed up");

//Testing the getCopy method and equals method again
		point5 = point1.getCopy();
		if (point1.equals(point5))
			System.out.println("true, method equals works");
		else
			System.out.println("false, I messed up");

//Testing the method toString() and the accessors
		System.out.println("\nUsing toString to print point1 yields: " + point1);
		System.out.println("\nThe x-value of point2 is: " + point2.getX()
					     + "\nThe y-value of point2 is: " + point2.getY());
		System.out.println("This will print the values of point3: " + point3.getPoint());
	}
}



