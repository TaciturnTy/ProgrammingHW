import java.util.Scanner;
public class basechange
{
	static Scanner console = new Scanner (System.in);
	public static void main (String[] args)
	{
		int number;
		int base;
	
		System.out.print("Please enter your number:");
			number = console.nextInt();
		System.out.print("Please enter your base:");
			base = console.nextInt();

		System.out.print("\nYour number was:" + number);
		System.out.print("\nYour base was:" + base);
		System.out.print("\nYour answer is:");

		basechange (number,base);

		System.exit (0);

	}
	public static void basechange (int number, int base)
	{
		if (number !=0)
		{
			basechange(number/base, base);
			System.out.print(number % base);
		}
	
	}

}