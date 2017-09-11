import java.util.*;
public class Q1
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		double number;
		
		System.out.print("Please enter a number: ");
			number = console.nextDouble();
	
		while(number < 10)
		{
			System.out.print("Please enter a number: ");
			number = console.nextDouble();
		}
		
		System.out.print("The number was greater than 10 so the prompt will stop appearing");
	}
}