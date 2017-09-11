import java.util.Scanner;
public class improvedFact
{
	static Scanner keyboard = new Scanner(System.in);

	public static void main (String[] args )
	{
		long fact = 1;
		long n;

		for(int infinite = 1; infinite >= 1; infinite++)
		{
		System.out.print("This program takes an input of a number N, \nand returns the factorial of the number entered."
						 + "\nPlease enter a positive integer for N.\n   N = ");

		n = keyboard.nextLong();

		while(n < 0)
		{
			System.out.print("Please enter a positive integer for the factorial N.\n   N = ");
			n = keyboard.nextLong();
		}

		if(n == 0 || n == 1)
			fact = 1;
		else
		for(long i = n; i >= 2; i--)
			fact *= i;

		System.out.println("The value of " + n + "! is: " + fact);

		fact = 1;
		}
	}
}