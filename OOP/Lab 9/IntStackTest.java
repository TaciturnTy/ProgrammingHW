/*
Tyler Paulley
April 16th, 2014
Lab Assignment 9A
IntStackTest.java
*/

public class IntStackTest
{
	public static void main(String[] args)
	{
		IntStack stack1 = new IntStack();
		IntStack stack2 = new IntStack(4);
		int array[] = {10, 20, 30, 40, 50, 60, 70, 80};

		System.out.println("\nStack1: " + stack1);
		System.out.println("\nStack2: " + stack2);

		for(int i = 0; i < array.length; i++)
			stack1.push(array[i]);

		System.out.println();
		System.out.println("Checking that stack1 is empty: " + stack1.isEmpty());
		System.out.println("Checking that stack2 is empty: " + stack2.isEmpty());

		stack1.push(90);
		stack1.push(100);
		stack2.push(10);
		stack2.push(20);

		System.out.println("The top element of stack1 is: " + stack1.pop());
		System.out.println("The top element of stack2 is: " + stack2.pop());

		System.out.println("\nWe will check print again and that stack1 pushed properly.");
		System.out.println("Stack1: " + stack1);

		System.out.println("\nWe will now push elements into stack1 until we receive "
						 + "a FullStackException...\n");

		try
		{
			stack1.push(110);
			stack1.push(120);
		}
		catch (Exception eRef)
		{
			System.out.println("If this is printing then the exception occurred.");
			eRef.printStackTrace();
		}

		System.out.println("\nThe top element of stack1 is: " + stack1.pop());
		System.out.println("The reason the top element is 110 instead of 120 is b/c the "
						 + "\npush exception was caught and push(120) didn't execute.");

		System.out.println("\nWe will now pop elements from stack2 until we receive "
						 + "an EmptyStackException...");

		try
		{
			stack2.pop();
			stack2.pop();
		}
		catch (Exception eRef2)
		{
			System.out.println("\nIf this is printing then the exception occurred.");
			eRef2.printStackTrace();
		}

		System.out.println("\nWe will now try to peek into the empty stack2 to get "
						 + "an EmptyStackException...");

		try
		{
			stack2.peek();
		}
		catch (Exception eRef3)
		{
			System.out.println("\nIf this is printing then the exception occurred.");
			eRef3.printStackTrace();
		}

		stack1.push(120);

		System.out.println("\nWe will now test the remaining isFull(), getTop, and getSize() methods.");
		System.out.println("Checking that stack1 is full: " + stack1.isFull());
		System.out.println("Checking that stack2 is full: " + stack2.isFull());
		System.out.println("The top of stack1 is: " + stack1.getTop());
		System.out.println("The top of stack2 is: " + stack2.getTop());
		System.out.println("Checking stack1's size: " + stack1.getSize());
		System.out.println("Checking stack2's size: " + stack2.getSize());
	}
}



