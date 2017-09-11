/*
Tyler Paulley
March 18th, 2014
Chapter 6 Practice
Rectangle.java
*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Rectangle extends JFrame{
	private JLabel lengthL,
				   widthL,
				   areaL,
				   perimeterL;

	private JTextField lengthTF,
					   widthTF,
					   areaTF,
					   perimeterTF;

	private JButton calculateB,
					exitB;

	private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;

	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;

	public Rectangle()
	{
		lengthL = new JLabel("Please enter the length: ", SwingConstants.LEFT);
		widthL = new JLabel("Please enter the width: ", SwingConstants.LEFT);
		areaL = new JLabel("Area: ", SwingConstants.LEFT);
		perimeterL = new JLabel("Perimeter: ", SwingConstants.LEFT);

		calculateB = new JButton("CALCULATE");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);

		lengthTF = new JTextField(20);
		widthTF = new JTextField(20);
		perimeterTF = new JTextField(20);
		areaTF = new JTextField(20);

		perimeterTF.setEditable(false);
		areaTF.setEditable(false);

		exitB = new JButton("EXIT");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);

		Container pane = getContentPane();
		pane.setLayout(new GridLayout(5,2));

//ROW 1         ONE			          TWO
	    pane.add(lengthL);     pane.add(lengthTF);
//ROW 2
		pane.add(widthL);      pane.add(widthTF);
//ROW 3
		pane.add(areaL);       pane.add(areaTF);
//ROW 4
		pane.add(perimeterL);  pane.add(perimeterTF);
//ROW 5
		pane.add(calculateB);  pane.add(exitB);

		setTitle("Rectangle Calculator");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class CalculateButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double length,
				   width,
				   area,
				   perimeter;

			length = Double.parseDouble(lengthTF.getText());
			width = Double.parseDouble(widthTF.getText());
			area = length * width;
			perimeter = 2 * (length + width);
			areaTF.setText(" " + area);
			perimeterTF.setText(" " + perimeter);
		}
	}

	private class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}

	public static void main (String[] args)
	{
		Rectangle rect = new Rectangle();
	}
}




























