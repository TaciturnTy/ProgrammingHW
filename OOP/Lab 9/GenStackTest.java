/*
Tyler Paulley
April 16th, 2014
Lab Assignment 9B
GenStackTest.java
*/

public class GenStackTest
{
	public static void main(String[] args)
	{
		int[] arrayI = {10, 20, 30, 40, 50, 60, 70, 80};
		double[] arrayD = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8};
		String[] arrayS = {"Dog", "Cat", "Mouse", "Horse", "Ali's Elephant"};
		GenStack stackI = new GenStack();
		GenStack stackD = new GenStack(8);
		GenStack stackS = new GenStack(5);

		System.out.println("Before pushing into stacks...");
		System.out.println("Stack of integers: " + stackI);
		System.out.println("Stack of doubles: " + stackD);
		System.out.println("Stack of strings: " + stackS);


		for(Integer elements: arrayI)
			stackI.push(elements);

		System.out.println("\nElements have been pushed into stackI.\n");

		System.out.println("Checking that stackI is empty: " + stackI.isEmpty());
		System.out.println("Checking that stackD is empty: " + stackD.isEmpty());

		System.out.println("\nElements have been pushed into stackD and stackS.\n");

		for(Double elements: arrayD)
			stackD.push(elements);

		for(String elements: arrayS)
			stackS.push(elements);

		System.out.println("Checking that stackI is full: " + stackI.isFull());
		System.out.println("Checking that stackD is full: " + stackD.isFull());

		System.out.println("\nAfter pushing into stacks...");
		System.out.println("Stack of integers: " + stackI);
		System.out.println("Stack of doubles: " + stackD);
		System.out.println("Stack of strings: " + stackS);

		System.out.println("\nThe top of stackI is: " + stackI.getTop());
		System.out.println("The top of stackD is: " + stackD.getTop());
		System.out.println("The top of stackS is: " + stackS.getTop());

		System.out.println("\nThe size of stackI is: " + stackI.getSize());
		System.out.println("The size of stackD is: " + stackD.getSize());
		System.out.println("The size of stackS is: " + stackS.getSize());

		System.out.println("\nWe will now push elements into stackD until we receive "
						 + "a FullStackException...\n");
		try
		{
			stackD.push(9.9);
			stackD.push(10.1);
		}
		catch (Exception eRef)
		{
			System.out.println("If this is printing then the exception occurred.");
			eRef.printStackTrace();
		}

		System.out.println("\nWe will now pop elements from stackS until we receive "
						 + "an EmptyStackException...");
		try
		{
			for(int i = 0; i < 7; i++)
				stackS.pop();
		}
		catch (Exception eRef2)
		{
			System.out.println("\nIf this is printing then the exception occurred.");
			eRef2.printStackTrace();
		}

		System.out.println("\nWe will now try to peek into the empty stackS to get "
						 + "an EmptyStackException...");
		try
		{
			stackS.peek();
		}
		catch (Exception eRef3)
		{
			System.out.println("\nIf this is printing then the exception occurred.");
			eRef3.printStackTrace();
		}

	}
}