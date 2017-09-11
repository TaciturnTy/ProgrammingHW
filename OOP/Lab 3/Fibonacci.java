/*
Tyler Paulley
The Object-Oriented Paradigm
Lab Assignment 3
February 2nd, 2013
Question 3: Fibonacci.java
*/

public class Fibonacci
{
	private int iteration;
	private double first;
	private double second;

	public Fibonacci()
	{
		iteration = 1;
		first = 1;
		second = 3;
	}

	public Fibonacci(int i, double f, double s)
	{
		iteration = i;
		first = f;
		second = s;
	}

	public void setFib(int i, double f, double s)
	{
		iteration = i;
		first = f;
		second = s;
	}

	public void setI(int i)
	{
		iteration = i;
	}

	public void setF(double f)
	{
		first = f;
	}

	public void setS(double s)
	{
		second = s;
	}

	public int getI()
	{
		return iteration;
	}

	public double getF()
	{
		return first;
	}

	public double getS()
	{
		return second;
	}

	public double fibSequence(int i, double f, double s)
	{
		double value = 0;

		if(i == 1)
			System.out.print(f);

		else if(i == 2)
			System.out.print(s + " " + f);

		else
		{
			value = f + s;
			setF(s);
			setS(value);
			setI(iteration - 1);
			System.out.print(value + " ");
			fibSequence(getI(), getF(), getS());
		}
		return value;
	}

	public double findValue(int i, double f, double s)
	{
		if(i == 1)
			return f;

		else if(i == 2)
			return s;

		else
			return findValue(i - 1, f, s) + findValue(i - 2, f, s);
	}
}