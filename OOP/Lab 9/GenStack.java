/*
Tyler Paulley
April 16th, 2014
Lab Assignment 9B
GenStack.java
*/

public class GenStack <T>
{
	private final int size;
	private int top;
	private T[] elements;

	public GenStack()
	{this(10);}

	public GenStack(int s)
	{
		size = (s > 0)? s:10;
		top = -1;
		elements = (T[]) new Object[size];
	}

	public void push(T value)
	{
		if(top == size - 1)
			throw new FullStackException(
					String.format("Stack is full. Cannot push %s", value));

		elements[++top] = value;
	}

	public T pop()
	{
		if(top == -1)
			throw new EmptyStackException(
					"Stack is empty. Cannot pop.");

		return elements[top--];
	}

	public boolean isEmpty()
	{return (top== -1)? true:false;}

	public boolean isFull()
	{return (top== size - 1)? true:false;}

	public int getSize()
	{return size;}

	public int getTop()
	{return top;}

	public T peek()
	{
		if(isEmpty())throw new EmptyStackException(
							   "Stack is empty. Cannot peek.");

		return elements[top];
	}

	public String toString()
	{
		String str = "\n\tSize of the stack is: " + size
				   + ", Stack has " + (top + 1) + " elements.";
		int t = top;

		str = str + "\n\tThe elements are: ";

		while(t>-1)
			str = str + elements[t--] + " ";

		return str;
	}

//JAVA DOESN'T SUPPORT GENERIC THROWABLE CLASSES, THEREFORE STATIC USED AS A WORKAROUND
	public static class EmptyStackException extends RuntimeException
	{
		public EmptyStackException()
		{this("Stack is empty");}

		public EmptyStackException(String excep)
		{super(excep);}
	}

	public static class FullStackException extends RuntimeException
	{
		public FullStackException()
		{this("Stack is full");}

		public FullStackException(String excep)
		{super(excep);}
	}
}

