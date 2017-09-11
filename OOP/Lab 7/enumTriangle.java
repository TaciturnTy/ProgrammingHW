/*
Tyler Paulley
3/30/14
Chapter 10
Exercise #2
enumTriangle.java
*/

import java.util.*;
public class enumTriangle
{
	static Scanner console = new Scanner(System.in);
	enum Triangle {Scalene, Isosceles, Equilateral, NoTriangle};

	public static void main(String[] args)
	{
		double side1,
			   side2,
			   side3;

		System.out.print("Please enter the length of side ONE: ");
			side1 = console.nextDouble();
		System.out.print("Please enter the length of side TWO: ");
			side2 = console.nextDouble();
		System.out.print("Please enter the length of side THREE: ");
			side3 = console.nextDouble();

		System.out.print("\nThe three lengths create a(n) " + TriangleShape(side1, side2, side3) + " triangle.\n");
	}

	public static Triangle TriangleShape(double side1, double side2, double side3)
	{
		Triangle triangle1;

		if(side1 == side2 && side1 == side3)
			triangle1 = Triangle.Equilateral;

		else if(side1 == side2 || side1 == side3 || side2 == side3)
				 triangle1 = Triangle.Isosceles;

			 else if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
			 		  triangle1 = Triangle.Scalene;

			 	  else
			 	      triangle1 = Triangle.NoTriangle;

		return triangle1;
	}
}















