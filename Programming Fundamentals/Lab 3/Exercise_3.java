/*
Tyler Paulley
Lab Assignment #3
Exercise_3.java
Oct. 6th, 2013
Page 320, Exercise 4
*/

import javax.swing.JOptionPane;
public class Exercise_3
{
	public static void main (String[] args)
	{
		char letter;

		String inputMessage;
		String inputString;
		String outputMessage;
		
		inputMessage = "Program to convert uppercase and lowercase "
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

		if (letter >= 'A' && letter <='z')
		{
			switch (letter)
			{
			case 'A':
			case 'B':
			case 'C':
			case 'a':
			case 'b':
			case 'c':
				outputMessage = outputMessage
					      + "2";
				break;
			
			case 'D':
			case 'E':
			case 'F':
			case 'd':
			case 'e':
			case 'f':
				outputMessage = outputMessage
					      + "3";
				break;

			case 'G':
			case 'H':
			case 'I':
			case 'g':
			case 'h':
			case 'i':
				outputMessage = outputMessage
					      + "4";
				break;
				
			case 'J':
			case 'K':
			case 'L':
			case 'j':
			case 'k':
			case 'l':
				outputMessage = outputMessage
					      + "5";
				break;
	
			case 'M':
			case 'N':
			case 'O':
			case 'm':
			case 'n':
			case 'o':
				outputMessage = outputMessage
					      + "6";
				break;
			
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			
				outputMessage = outputMessage
					      + "7";
				break;

			case 'T':
			case 'U':
			case 'V':
			case 't':
			case 'u':
			case 'v':

				outputMessage = outputMessage
					      + "8";
				break;
				
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			
				outputMessage = outputMessage
					      + "9";
			}
		}
		else
			outputMessage = outputMessage
				      + "Not a letter";

		JOptionPane.showMessageDialog(null, outputMessage,
				"Telephone Digit",
				JOptionPane.PLAIN_MESSAGE);

		inputMessage = "Enter another letter "
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