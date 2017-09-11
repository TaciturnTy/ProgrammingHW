/*
Tyler Paulley
Lab Assignment 7
Fraction.java
Chapter 8 pg.549
Nov. 10th, 2013
*/

public class Fraction extends Object
{
	private int a;
	private int b;
	
	public Fraction()
	{
		a = 0;
		b = 0;
	}

	public Fraction(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public void setFraction(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public void add(int c, int d)
	{
		int a = this.a;
		int b = this.b;

		a *= d;
		b *= c;

		a += b;
		b = this.b * d;

		this.a = a;
		this.b = b;
	}	

		
	public void sub(int c, int d)
	{		
		int a = this.a;
		int b = this.b;

		a *= d;
		b *= c;

		a -= b;
		b = this.b * d;

		this.a = a;
		this.b = b;
	}

	public void mul(int c, int d)
	{
		int a = this.a;
		int b = this.b;
		
		a *= c;
		b *= d;

		this.a = a;
		this.b = b;
	}

	public void div(int c, int d)
	{
		if(c / d != 0)
		{
			int a = this.a;
			int b = this.b;
			
			a *= d;
			b *= c;
			
			this.a = a;
			this.b = b;
		}
	}

	public String toString()
	{
		String fraction = "";
		fraction += this.a + " / " + this.b;
		return fraction;
	}
}


	
