//Ch3_PrExercise5.java

/*
Tyler Paulley
Chapter 3
Exercise 5
Sept. 26, 2013
*/

import java.io.*;
import java.util.*;
public class Ch3_PrExercise5
{
	public static void main (String[] args)
				throws FileNotFoundException
	{
		double saleAmount = 0;
		double ticketPrice;
		int ticketsSold;
		int totalTicketsSold = 0;

		Scanner inFile = new Scanner(new FileReader("Ch3_Ex5Data.txt"));
		PrintWriter outFile = new PrintWriter("Ch3_Ex5Out.txt");

		System.out.println("Processing Data");
		
		for(int i = 0; i < 4; i++)
		{ 
			ticketPrice = inFile.nextDouble();
			ticketsSold = inFile.nextInt();
			saleAmount = saleAmount + ticketPrice * ticketsSold;
			totalTicketsSold = totalTicketsSold + ticketsSold;
		}	
		
		outFile.printf("Number of tickets sold = %d %n", totalTicketsSold);
		outFile.printf("Sale amount = $%.2f %n", saleAmount);
		
		inFile.close();
		outFile.close();
	}

}
		
		