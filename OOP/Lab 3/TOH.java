/*
Tyler Paulley
The Object-Oriented Paradigm
Lab Assignment 3
February 2nd, 2013
Question 1: TOH.java
*/

//This is a one-file version of the Tower of Hanoi problem with the
//method to solve the tower written in the same class with the input
//for the number of rings, n.

import java.util.Scanner;
public class TOH
{
	static Scanner console = new Scanner (System.in);
	public static void main (String[] args)
	{
		int n;
		char c1 = 'A', c2 = 'B', c3 = 'C';

		System.out.print("Please enter the number of disks: ");
		n = console.nextInt();

		towerOfHanoi(n, 'A', 'B', 'C');
	}

	public static void towerOfHanoi(int n, char A, char B, char C)
	{
		if(n == 1)
			System.out.println("Move disk " + n + " from peg " + A
							 + " to peg " + B);
		else
		{
			towerOfHanoi(n - 1, A, C, B);
			System.out.println("Move disk " + n + " from peg " + A
							 + " to peg " + B);
			towerOfHanoi(n - 1, C, B, A);
		}
	}
}