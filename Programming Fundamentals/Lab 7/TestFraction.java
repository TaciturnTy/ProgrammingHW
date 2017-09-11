/*
Tyler Paulley
Lab Assignment 7
TestFraction.java
Nov. 10th, 2013
*/

public class TestFraction
{
	public static void main(String[] args)
	{
		Fraction empty = new Fraction();
		Fraction full = new Fraction(1, 2);

		empty.setFraction(1, 8);

		System.out.println("The empty fraction has been set to " + empty.toString());

		full.add(1, 4);
		System.out.println("Adding the fraction 1 / 4 to the fraction 1 / 2 gives us "
				 + full.toString());
	
		full.sub(1, 4);
		System.out.println("Subtracting the fraction 1 / 4 from the previous fraction gives us "
				 + full.toString());

		full.mul(1, 3);
		System.out.println("Multiplying the fraction 1 / 3 by the previous fraction gives us "
				 + full.toString());

		full.div(3, 1);
		System.out.println("Dividing the previous fraction by the fraction 3 / 1 gives us "
				 + full.toString());
	}
}

		















