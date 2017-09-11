/*
Tyler Paulley
Lab Assignment #3
Exercise_1.java
Oct. 6th, 2013
Page 244, Exercise 12
*/

import java.io.*;
import java.util.*;
public class Exercise_1
{
	public static void main (String[]args)
				throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("Exercise_1_input.txt"));
		PrintWriter outFile = new PrintWriter("Exercise_1_output.txt");
		
		final int SERVICE_CHARGE_FOR_SAVINGS = 10;
		final int SERVICE_CHARGE_FOR_CHECKING = 25;
		final double INTEREST_RATE_ON_SAVINGS = 1.04;
		final double INTEREST_RATE_CHECKING_LESS_THAN_5000 = 1.03;
		final double INTEREST_RATE_CHECKING_MORE_THAN_5000 = 1.05;

		int CustomerAccountNumber;
		char AccountType;
		double MinimumBalance;
		double CurrentBalance;
		double NewBalance = 0.0;

		for(int i = 0; i < 5; i++)
		{
			CustomerAccountNumber = inFile.nextInt();
			AccountType = inFile.next().charAt(0);
			MinimumBalance = inFile.nextDouble();
			CurrentBalance = inFile.nextDouble();

			if(AccountType == 's' || AccountType == 'S')
			{
				if(CurrentBalance < MinimumBalance)
					NewBalance = CurrentBalance - SERVICE_CHARGE_FOR_SAVINGS;

				else 
				     	NewBalance = CurrentBalance * INTEREST_RATE_ON_SAVINGS;
			}
			
			if(AccountType == 'c' || AccountType == 'C')
			{
				if(CurrentBalance < MinimumBalance)
					NewBalance = CurrentBalance - SERVICE_CHARGE_FOR_CHECKING;
				
				else if(CurrentBalance - MinimumBalance < 5000)
				     	NewBalance = CurrentBalance * INTEREST_RATE_CHECKING_LESS_THAN_5000;
					
				     else 
					  NewBalance = CurrentBalance * INTEREST_RATE_CHECKING_MORE_THAN_5000;
			}

			if(!(AccountType == 'c' || AccountType == 'C' || AccountType == 's' || AccountType == 'S'))
			{
				System.out.print("Error in input account type data");
			}

/*If the AccountNumber, MinimumBalance, or CurrentBalance aren't numbers, then the program
won't run, so the major error to check is whether AccountType is a usable character.*/
 
			outFile.print(CustomerAccountNumber + " " + AccountType + " " + CurrentBalance + " ");
			outFile.printf("%.2f",NewBalance);
			outFile.println();
		}//for
	inFile.close();
	outFile.close();
	}
}
					
					














			
		

		
		