/*
Tyler Paulley
The Object-Oriented Paradigm
Lab Assignment 3
February 2nd, 2013
Question 2: Test_Tower.java
*/

//This is part of the the two-file solution for the Tower of Hanoi problem,
//this class contains the testing of the method of the class Tower used
//to solve the tower of hanoi, named move(), and the testing of the Tower class.

import java.util.Scanner;
public class Test_Tower
{
	static Scanner console = new Scanner (System.in);
	public static void main (String[] args)
	{
		System.out.println("If all the methods of the class Tower are working correctly,\n"
						 + "the names of the pegs of tower1 should be x, y, and z, the names\n"
						 + "of the pegs of tower2 should be a, b, and c, and the names of\n"
						 + "the pegs of tower3 should be P, E, and G.\n\n"
						 + "Additionally the number of movements of tower1 should be the\n"
						 + "most since it has 4 rings,followed by tower2 with 3 rings,\n"
						 + "and finally tower3 as the shortest with 2 rings.\n");

		Tower tower1 = new Tower();
		Tower tower2 = new Tower(3, 'a', 'b', 'c');
		Tower tower3 = new Tower(2, 'P', 'E', 'G');

		tower1.setRings(4);
		tower1.namePegs('x', 'y', 'z');

		System.out.println("Tower1:");
		tower1.move();
		System.out.println();

		System.out.println("Tower2:");
		tower2.move();
		System.out.println();

		System.out.println("Tower3:");
		tower3.move();
		System.out.println();

		System.out.println();
		System.out.println("The number of rings in tower3 is " + tower3.getRings()
					   + "\nand the names of the pegs are: " + tower3.getL() + " "
					   + tower3.getM() + " " + tower3.getR());


	}
}