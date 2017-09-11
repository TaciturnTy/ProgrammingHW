/*
Tyler Paulley
Lab Assignment #3
Exercise_3.java
Oct. 6th, 2013
Page 320, Exercise 4
*/

import javax.swing.JOptionPane;
public class Exercise_3_Original
{
	public static void main (String[] args)
	{
		char letter;

		String inputMessage;
		String inputString;
		String outputMessage;
		
		inputMessage = "Program to convert uppercase "
			     + "letters to their corresponding "
			     + "telephone digits.\n"
			     + "To stop the program enter #.\n"
			     + "Enter a letter:";
		inputString = 
			JOptionPane.showInputDialog(inputMessage);

		letter = inputString.charAt(0);

		while (letter != '#' )
		{
			outputMessage = "The letter you entered is: "
				      + letter + "\n"
				      + "The corresponding telephone "
				      + "digit is: ";

		if (letter >= 'A' && letter <= 'Z')
		{
			switch (letter)
			{
			case 'A':
			case 'B':
			case 'C':
				outputMessage = outputMessage
					      + "2";
				break;
			
			case 'D':
			case 'E':
			case 'F':
				outputMessage = outputMessage
					      + "3";
				break;

			case 'G':
			case 'H':
			case 'I':
				outputMessage = outputMessage
					      + "4";
				break;
				
			case 'J':
			case 'K':
			case 'L':
				outputMessage = outputMessage
					      + "5";
				break;
	
			case 'M':
			case 'N':
			case 'O':
				outputMessage = outputMessage
					      + "6";
				break;
			
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				outputMessage = outputMessage
					      + "7";
				break;

			case 'T':
			case 'U':
			case 'V':
				outputMessage = outputMessage
					      + "8";
				break;
				
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				outputMessage = outputMessage
					      + "9";
			}
		}
		else
			outputMessage = outputMessage
				      + "Invalid input";

		JOptionPane.showMessageDialog(null, outputMessage,
				"Telephone Digit",
				JOptionPane.PLAIN_MESSAGE);

		inputMessage = "Enter another uppercase letter "
			     + "to find its corresponding "
			     + "telephone digit.\n"
			     + "To stop program enter #.\n"
			     + "Enter a letter:";

		inputString = 
		   JOptionPane.showInputDialog(inputMessage);
		letter = inputString.charAt(0);
		}
		
		System.exit(0);
	}
}