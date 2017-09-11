/*
Tyler Paulley
March 21st, 2014
Chapter 6, Lab #6
Exercise #5
StringConverter.java
*/

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class StringConverter extends JFrame
{
	private static final int WIDTH = 500;
	private static final int HEIGHT = 200;

	private JLabel inputL,
				   outputL;

	private JTextField inputTF,
					   outputTF;

	private JButton capitalizeB,
					exitB;

	private CapitalizeButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;

	public StringConverter()
	{
		setTitle("Letter Capitalizer");
		setSize(WIDTH, HEIGHT);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container pane = getContentPane();
		pane.setLayout(new GridLayout(3, 2));

		inputL = new JLabel("Please enter the string to capitalize: ", SwingConstants.LEFT);
		outputL = new JLabel("Here is your capitalized string: ", SwingConstants.LEFT);

		inputTF = new JTextField(30);
		outputTF = new JTextField(30);

		outputTF.setEditable(false);

		capitalizeB = new JButton("CAPITALIZE");
		cbHandler = new CapitalizeButtonHandler();
		capitalizeB.addActionListener(cbHandler);

		exitB = new JButton("EXIT");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);

	    pane.add(inputL);        pane.add(inputTF);
		pane.add(outputL);       pane.add(outputTF);
		pane.add(capitalizeB);   pane.add(exitB);

//DISCOVERED THAT PUTTING setVisible AFTER pane.add WILL MAKE THE WINDOW OPEN NORMALLY,
//IF NOT PLACED IN THIS WAY, THE WINDOW'S SIZE WILL HAVE TO ADJUSTED BEFORE THE ELEMENTS APPEAR.
		setVisible(true);
	}

	private class CapitalizeButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String input,
				   output;

			input = inputTF.getText();
			output = input.toUpperCase();

			outputTF.setText(output);
		}
	}

	private class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.exit(0);
		}
	}

	public static void main(String[] args)
	{
		StringConverter letterCaps = new StringConverter();
	}
}