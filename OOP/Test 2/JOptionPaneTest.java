import javax.swing.JOptionPane;
public class JOptionPaneTest
{
	public static void main(String[] args)
	{
		double number1;
		double number2;
		double sum = 0;

		String num1str;
		String num2str;

		String input1String = "Please enter the first number";
		String input2String = "Please enter the second number";

		num1str = JOptionPane.showInputDialog(input1String);
		number1 = Double.parseDouble(num1str);

		num2str = JOptionPane.showInputDialog(input2String);
		number2 = Double.parseDouble(num2str);

		sum = number1 + number2;

		String outputSumString = "The sum of the first number: " + number1 + " and the second number: " + number2
					+ " was " + sum;

		JOptionPane.showMessageDialog(null, outputSumString, "The Sum", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}
			