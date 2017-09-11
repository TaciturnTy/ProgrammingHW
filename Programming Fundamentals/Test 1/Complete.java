//PART 0

/*
Tyler Paulley
Sept. 16, 2013
Programming Fundamentals
Complete Java Program
*/

//PART 1

import java.util.Scanner;
public class Complete 
{
	static Scanner console = new Scanner (System.in);
	public static void main (String[] args)
	{
		System.out.print("I am printing this to answer part 1");
//PART 2
		System.out.println();
		String type;
	
		System.out.print("\nType a word to say here:");
			type = console.next();
		
		System.out.print("\nYour word was:" + type);
//PART 3
		double x;
		System.out.println();
		System.out.print("\nI have declared the variable x to be of the double type,");
		System.out.println(" therefore you can use any real number.");
		System.out.println();
		System.out.print("Please enter any real number:");
			x = console.nextDouble();
		
		System.out.print("The real number you entered was:" + x);
//PART 4
		System.out.println();
		System.out.print("\nFor part four, I have already imported Scanner in");
		System.out.println("\n the previous examples.");

//PART 5
		System.out.println();
		System.out.print("For part five we will add two integers together.");
		
		int one;
		int two;
		int sum;
		
		System.out.print("\nPlease enter your first integer:");
			one = console.nextInt();
		System.out.print("\nPlease enter your second integer:");
			two = console.nextInt();
		
		sum = one + two;
		
		System.out.println("\nThe sum is:" + sum);
//PART 6
		System.out.println();
		int number1 = number2 = 4;
		for(int i = 0; i < 5; i++)
		{
			System.out.println("This is a loop for part 6"+ number1++ +"\t" + ++number2);
		}
//PART 7
		System.out.println();

		System.out.print("\nFor part 7, we will add to a variable that I've declared to be constant");

		final int c = 5;
		int num;
		int addtoc;

		System.out.println();
		System.out.println("\nI have declared c to be 5, choose a number to add to c");
		System.out.print("Enter that number here:");
			num = console.nextInt();
	
		addtoc = c + num;
		
		System.out.println();
		System.out.print("The sum of c and your number is:" + addtoc);
//PART 8
		System.out.println();
		System.out.println("For part 8, I will declare and initialize the variables: t=5 and s=2" +
				" and then multiply them together.");
		
		int t = 5;
		int s = 2;
		int mult = s * t;
	
		System.out.println();
		System.out.print("\nThe product of s and t is:" + mult);

		System.out.println();
		System.out.print("This concludes Tyler's program, Thank You.");
		
	}

}
		
	
