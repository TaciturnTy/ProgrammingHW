import java.util.Scanner;
public class add
{
	static Scanner console = new Scanner (System.in);
	public static void main (String[]args)
	{
		double a;
		double b;
		double sum;

		System.out.print("Please enter your number to add:");
			a = console.nextDouble();
		System.out.print("\nPlease enter your second number to add:");
			b = console.nextDouble();
		
		sum = a + b;
	
		System.out.print("\n\nYour answer is:" + sum);
	}

}