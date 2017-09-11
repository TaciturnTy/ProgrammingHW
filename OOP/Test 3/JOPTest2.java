import javax.swing.*;
public class JOPTest2
{
	public static void main(String[] args)
	{
		double radius;
		double area;
		double circumference;
		String radiusString;
		String output;

		radiusString = JOptionPane.showInputDialog("Please enter the radius: ");
		radius = Double.parseDouble(radiusString);
	
		area = Math.pow(radius, 2) * Math.PI;
		circumference = Math.PI * 2 * radius;

		output = String.format("The circumference is %1$5.0f%n The area is %3$5.0f%n So the radius was %2$5.0f%n", circumference, radius, area);

		JOptionPane.showMessageDialog(null, output, "Circle", JOptionPane.QUESTION_MESSAGE);
		
		System.exit(0);
	}
}
	
		