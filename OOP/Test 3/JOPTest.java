//THIS PROGRAMS WAS MADE TO PRACTICE THE COMMANDS OF JOptionPane

import javax.swing.*;
public class JOPTest
{
	public static void main(String[] args)
	{
		double radius;
		double circumference;
		double area;

		String radiusString;
		String output;

		radiusString = JOptionPane.showInputDialog("Please input the radius: ");
		radius = Double.parseDouble(radiusString);

		area = radius * radius * Math.PI;
		circumference = 2 * Math.PI * radius;
		
		output = "The radius is " + radius 
		       + "\nThe circumference is " + circumference
		       + "\nThe area is " + area;
		
		JOptionPane.showMessageDialog(null, output, "Circle Data", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}
		
		

		