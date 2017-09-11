//THIS PROGRAMS ASKS WHAT TYPE OF DICE TO ROLL AND RETURNS THE RESULT

import javax.swing.*;
import static java.lang.Math.*;
public class DiceRoll
{
	public static void main(String[] args)
	{
		int die1;
		int die2;
		int sum;
		String stop = "";
		do
		{
			die1 = (int) (Math.random() * 6) + 1;
			die2 = (int) (Math.random() * 6) + 1;
			sum = die1 + die2;

			String output = "The sum of the numbers rolled was: " + sum;

			JOptionPane.showMessageDialog(null, output, "Two Dice", JOptionPane.INFORMATION_MESSAGE);
			stop = "";
			stop = JOptionPane.showInputDialog("Type \"stop\" to stop rolling, if not type anything other than stop.");
			
		}
		while(stop.compareTo("stop") != 0);
		
		System.exit(0);
	}
}
		
		