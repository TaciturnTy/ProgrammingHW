/*
Tyler Paulley
NumberGuessingGame.java
Oct. 9th, 2013
*/

import java.lang.Math.*;
import java.util.*;
public class NumberGuessingGame5Trys
{
	static Scanner console = new Scanner (System.in);
	public static void main (String[] args)
	{
		int num;
		int guess;
		int guessesLeft = 6;
		
		boolean done;
		
		num = (int) (Math.random() * 100);
		
		done = false;

		while(!done)
		{
			System.out.print ("\nEnter an integer greater than "
					+ "or equal to 0 and less than 100: ");
				guess = console.nextInt();
				System.out.println();

			if(guessesLeft > 1)
			{
				if (guess == num)
				{
					System.out.println("You guessed the "
							+ "correct number!\nYOU WIN!");
					
					done = true;
				}
				else if (guess < num)
				{
					guessesLeft--;
					System.out.println("You have " + guessesLeft + " guess(es) remaining!");
					System.out.println("Your guess is lower "
							+ "than the number.\n"
							+ "Guess Again!");
				}
				else
				{
					guessesLeft--;
					System.out.println("You have " + guessesLeft + " guess(es) remaining!");
					System.out.println("Your guess is higher "
							+ "than the number.\n"
							+ "Guess Again!");
				}
			}
			else
			{
				System.out.print("\nYou ran out of guesses. The number was " + num + "\nYOU LOSE.");
				done = true;
			}
				
		}
	}
}
					
						
						
					