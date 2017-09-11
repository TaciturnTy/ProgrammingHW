/*
Tyler Paulley
The Object-Oriented Paradigm
Lab Assignment 3
February 2nd, 2013
Question 2: Tower.java
*/

//This is part of the two-file solution to the Tower of Hanoi problem,
//this class contains only the method used to solve the problem.

public class Tower
{
	private int n;
	private char A;
	private char B;
	private char C;

	public Tower()
	{
		n = 1;
		A = 'A';
		B = 'B';
		C = 'C';
	}

	public Tower(int n, char A, char B, char C)
	{
		this.n = n;
		this.A = A;
		this.B = B;
		this.C = C;
	}

	public void move()
	{
		if(this.n == 1)
			System.out.println("Move disk " + this.n + " from peg " + this.A
							 + " to peg " + this.B);
		else
		{
			move(this.n - 1, this.A, this.C, this.B);
			System.out.println("Move disk " + this.n + " from peg " + this.A
							 + " to peg " + this.B);
			move(this.n - 1, this.C, this.B, this.A);
		}
	}

	public void move(int n, char A, char B, char C)
	{
		if(n == 1)
			System.out.println("Move disk " + n + " from peg " + A
							 + " to peg " + B);
		else
		{
			move(n - 1, A, C, B);
			System.out.println("Move disk " + n + " from peg " + A
							 + " to peg " + B);
			move(n - 1, C, B, A);
		}
	}

	public int getRings()
	{
		return n;
	}

	public void setRings(int n)
	{
		this.n = n;
	}

	public char getL()
	{
		return A;
	}

	public char getM()
	{
		return B;
	}

	public char getR()
	{
		return C;
	}

	public void namePegs(char a, char b, char c)
	{
		A = a;
		B = b;
		C = c;
	}
}