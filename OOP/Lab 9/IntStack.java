/*
Tyler Paulley
April 16th, 2014
Lab Assignment 9A
IntStack.java
*/

public class IntStack
{
	private final int size;
	private int top;
	private int[] elements;

	public IntStack()
	{this(10);}

	public IntStack(int s)
	{
		size = (s > 0)? s:10;
		top = -1;
		elements = new int[size];
	}

	public void push(int value)
	{
		if(top == size - 1)
			throw new FullStackException(
					  String.format("Stack is full. Cannot push %s", value));

		elements[++top] = value;
	}

	public int pop()
	{
		if(top == -1)
			throw new EmptyStackException(
					  "Stack is empty. Cannot pop.");

		return elements[top--];
	}

	public int peek()
	{
		if(isEmpty())throw new EmptyStackException(
		     				   "Stack is empty. Cannot peek.");

		return elements[top];
	}

	public boolean isEmpty()
	{return (top== -1)? true:false;}

	public boolean isFull()
	{return (top== size - 1)? true:false;}

	public int getSize()
	{return size;}

	public int getTop()
	{return top;}

	public String toString()
	{
		String str = "\n\tThe size of the stack is: " + size
				   + ", The stack has " + (top + 1) + " elements.";
		int t = top;

		str = str + "\n\tThe elements are: ";

		while(t > -1)
			str = str + elements[t--] + " ";

		return str;
	}

	public class EmptyStackException extends RuntimeException
	{
		public EmptyStackException()
		{this("The stack is empty");}

		public EmptyStackException(String excep)
		{super(excep);}
	}

	public class FullStackException extends RuntimeException
	{
		public FullStackException()
		{this("The stack is full");}

		public FullStackException(String excep)
		{super(excep);}
	}
}