/*
Tyler Paulley
March 22nd, 2014
Chapter 6, Lab #6
Exercise #9
BaseConvert.java
*/

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import static java.lang.Math.*;

public class BaseConvert extends JFrame
{
	private static final int WIDTH = 500;
	private static final int HEIGHT = 300;

	private JLabel numberL,
				   baseL,
				   newBaseL,
				   tenConvertL,
				   newBaseConvertL;

	private JTextField numberTF,
					   baseTF,
					   newBaseTF,
					   tenConvertTF,
					   newBaseConvertTF;

	private JButton convertB,
					exitB;

	private ConvertButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;

	public BaseConvert()
	{
		setTitle("Base Converter");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container pane = getContentPane();
		pane.setLayout(new GridLayout(6, 2));

		numberL = new JLabel("Please enter the number to convert: ", SwingConstants.LEFT);
		baseL = new JLabel("Please enter the number's base: ", SwingConstants.LEFT);
		newBaseL = new JLabel("Please enter the new base: ", SwingConstants.LEFT);
		tenConvertL = new JLabel("The number with base 10 is: ", SwingConstants.LEFT);
		newBaseConvertL = new JLabel("The number in the new base is: ", SwingConstants.LEFT);

		numberTF = new JTextField(20);
		baseTF = new JTextField(20);
		newBaseTF = new JTextField(20);
		tenConvertTF = new JTextField(20);
		newBaseConvertTF = new JTextField(20);

		tenConvertTF.setEditable(false);
		newBaseConvertTF.setEditable(false);

		convertB = new JButton("CONVERT BASE");
		cbHandler = new ConvertButtonHandler();
		convertB.addActionListener(cbHandler);

		exitB = new JButton("EXIT");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);

//ROW 1         ONE					  		 TWO
	      pane.add(numberL);          pane.add(numberTF);
//ROW 2
		  pane.add(baseL);            pane.add(baseTF);
//ROW 3
		  pane.add(newBaseL);         pane.add(newBaseTF);
//ROW 4
		  pane.add(tenConvertL);      pane.add(tenConvertTF);
//ROW 5
		  pane.add(newBaseConvertL);  pane.add(newBaseConvertTF);
//ROW 6
		  pane.add(convertB);		  pane.add(exitB);

		  setVisible(true);
	}

	private class ConvertButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int number,
				tenConvert,
				newBaseConvert;

			int base,
				newBase;

			number = Integer.parseInt(numberTF.getText());
			base = Integer.parseInt(baseTF.getText());
			newBase = Integer.parseInt(newBaseTF.getText());
			tenConvert = convertToTen(number, base);
			newBaseConvert = baseChange(number, base, newBase);

			tenConvertTF.setText("" + tenConvert);
			newBaseConvertTF.setText("" + newBaseConvert);
		}
	}

	private class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.exit(0);
		}
	}

	private int convertToTen(int number, int base)
	{
		int numInTen = 0;
		int numMod10;
		int power = 0;

		if(number == 0)
			return 0;

		if(base == 0)
			return 1;

		else
		{
			while(number > 0)
			{
				numMod10 = number % 10;
				number = (number - numMod10) / 10;
				numInTen += numMod10 * pow(base, power);
				power++;
			}
		return numInTen;
		}
	}

	private int baseChange(int number, int base, int newBase)
	{
		int numTen = convertToTen(number, base);
		int tempFact;
		String output = "";

		if(newBase == 10)
			return numTen;

		if(newBase == 0 || numTen == 0)
			return 0;

		while(numTen > 0)
		{
			output += numTen % newBase;
			numTen = numTen / newBase;
		}
		int newOutput = Integer.parseInt(output);
		newOutput = reverse(newOutput);
		return newOutput;
	}

	private int reverse(int number)
	{
		int numberReversed = 0;
		int tempNumber = number;
		int digitHolder;

		if(number < 10)
			return number;

		while(tempNumber != 0)
		{
			digitHolder = tempNumber % 10;
			numberReversed = numberReversed * 10 + digitHolder;
			tempNumber /= 10;
		}
		return numberReversed;
	}

	public static void main(String[] args)
	{
		BaseConvert changeBase = new BaseConvert();
	}
}
