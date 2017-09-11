import java.util.*;

public class vectorPrintTest
{
	public static void main (String[] args)
	{
		Vector<Integer> numbers = new Vector <Integer>();
		Vector<Double> decimals = new Vector <Double>();

		for(int i = 10; i < 15; i++)
		{
			numbers.addElement(i);
		}

		for(int i = 10; i < 15; i++)
		{
			decimals.addElement(i + .5);
		}

		System.out.printf("%10s %n", "Welcome to the Hardware Store!");

		for(int i = 0; i < numbers.size() - 1; i++)
		System.out.printf("%5d %7.2f %n", numbers.elementAt(i), decimals.elementAt(i));
	}
}





