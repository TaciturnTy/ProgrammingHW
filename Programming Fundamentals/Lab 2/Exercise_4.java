/*
Tyler Paulley
Lab Assignment 2
Exercise 4
Sept. 25th, 2013
Page 175
*/

import java.util.*;
import java.io.*;
public class Exercise_4
{
	public static void main (String[] args)
				throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("Exercise_4_input.txt"));
		PrintWriter outFile = new PrintWriter("Exercise_4_output.txt");

		String firstName;
		String lastName;
		double currentSalary;
		double percentPayIncrease;
		String firstName2;
		String lastName2;
		double currentSalary2;
		double percentPayIncrease2;
		String firstName3;
		String lastName3;
		double currentSalary3;
		double percentPayIncrease3;
		double percentage;
		double percentage2;
		double percentage3;
	
		lastName = inFile.next();
		firstName = inFile.next();
		currentSalary = inFile.nextDouble();
		percentPayIncrease = inFile.nextDouble();
		lastName2 = inFile.next();
		firstName2 = inFile.next();
		currentSalary2 = inFile.nextDouble();
		percentPayIncrease2 = inFile.nextDouble();
		lastName3 = inFile.next();
		firstName3 = inFile.next();
		currentSalary3 = inFile.nextDouble();
		percentPayIncrease3 = inFile.nextDouble();
		percentage= percentPayIncrease / 100;
		percentage2= percentPayIncrease2 / 100;
		percentage3= percentPayIncrease3 / 100;

		double newSalary= currentSalary + (currentSalary * percentage);
		double newSalary2= currentSalary2 + (currentSalary2 * percentage2);
		double newSalary3= currentSalary3 + (currentSalary3 * percentage3);

		outFile.print(firstName + " " + lastName + " ");
		outFile.printf("%.2f%n", newSalary);

		outFile.print(firstName2 + " " + lastName2 + " ");
		outFile.printf("%.2f%n", newSalary2);
		
		outFile.print(firstName3 + " " + lastName3 + " ");
		outFile.printf("%.2f", newSalary3);


		inFile.close();
		outFile.close();
	}

}
		