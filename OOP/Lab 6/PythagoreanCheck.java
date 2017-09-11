/*
Tyler Paulley
March 22nd, 2014
Chapter 6, Lab #6
Exercise #8
PythagoreanCheck.java
*/

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class PythagoreanCheck extends JFrame
{
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 300;

	private JLabel xL,
				   yL,
				   zL,
				   xSquaredL,
				   ySquaredL,
				   zSquaredL,
				   PyEquationL;

	private JTextField xTF,
					   yTF,
					   zTF,
					   xSquaredTF,
					   ySquaredTF,
					   zSquaredTF,
					   PyEquationTF;

	private JButton calculateB,
					exitB;

	private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;

	public PythagoreanCheck()
	{
		setTitle("Pythagorean Check");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container pane = getContentPane();
		pane.setLayout(new GridLayout(4, 4));

		xL = new JLabel("Please enter the value for x: ", SwingConstants.LEFT);
		yL = new JLabel("Please enter the value for y: ", SwingConstants.LEFT);
		zL = new JLabel("Please enter the value for z: ", SwingConstants.LEFT);
		xSquaredL = new JLabel("x squared is: ", SwingConstants.LEFT);
		ySquaredL = new JLabel("y squared is: ", SwingConstants.LEFT);
		zSquaredL = new JLabel("z squared is: ", SwingConstants.LEFT);
		PyEquationL = new JLabel("The value of 'x^2 + y^2 = z^2' evaluates to: ", SwingConstants.LEFT);

		xTF = new JTextField(20);
		yTF = new JTextField(20);
		zTF = new JTextField(20);
		xSquaredTF = new JTextField(20);
		ySquaredTF = new JTextField(20);
		zSquaredTF = new JTextField(20);
		PyEquationTF = new JTextField(20);

		xSquaredTF.setEditable(false);
		ySquaredTF.setEditable(false);
		zSquaredTF.setEditable(false);
		PyEquationTF.setEditable(false);

		calculateB = new JButton("CALCULATE");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);

		exitB = new JButton("EXIT");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);

//ROW 1         ONE					   TWO						   THREE				  FOUR
	      pane.add(xL);           pane.add(xTF);           pane.add(xSquaredL);    pane.add(xSquaredTF);
//ROW 2
		  pane.add(yL);           pane.add(yTF);           pane.add(ySquaredL);    pane.add(ySquaredTF);
//ROW 3
		  pane.add(zL);           pane.add(zTF);	       pane.add(zSquaredL);    pane.add(zSquaredTF);
//ROW 4
		  pane.add(PyEquationL);  pane.add(PyEquationTF);  pane.add(calculateB);   pane.add(exitB);

		  setVisible(true);
	}

	private class CalculateButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			double x,
				   y,
				   z,
				   xSquared,
				   ySquared,
				   zSquared;

			boolean PyEquation;

			x = Double.parseDouble(xTF.getText());
			y = Double.parseDouble(yTF.getText());
			z = Double.parseDouble(zTF.getText());
			xSquared = x * x;
			ySquared = y * y;
			zSquared = z * z;

			if(xSquared + ySquared == zSquared)
				PyEquation = true;
			else
				PyEquation = false;

			xSquaredTF.setText("" + xSquared);
			ySquaredTF.setText("" + ySquared);
			zSquaredTF.setText("" + zSquared);
			PyEquationTF.setText("" + PyEquation);
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
		PythagoreanCheck xyzInputs = new PythagoreanCheck();
	}
}