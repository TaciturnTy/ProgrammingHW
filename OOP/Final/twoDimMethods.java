import java.util.*;
public class twoDimMethods
{
	static Scanner console = new Scanner(System.in);
	public static void printArray(double[][] sales)
	{
		for(int i = 0; i < sales.length; i++)
		{
			for(int j = 0; j < sales[i].length; j++)
				System.out.printf("%7.2f", sales[i][j]);
			
			System.out.println();
		}
	}

	public static void toString(double[][] myArray)
	{
		System.out.println();
		
		for(int i = 0; i < myArray.length; i++)
		{
			for(int j = 0; j < myArray[i].length; j++)
			{
				System.out.printf("%7.2f", myArray[i][j]);
			}
			System.out.println();
		}
	}

	public static void setAll(double[][] anyArray, double set)
	{
		for(int i = 0; i < anyArray.length; i++)
			for(int j = 0; j < anyArray[i].length; j++)
				anyArray[i][j] = set;
	}

	public static void setRow(double[][] anyArray, int row, double set)
	{
		for(int col = 0; col < anyArray[row].length; col++)
			anyArray[row][col] = set;
	}
	
	public static void setCol(double[][] anyArray, int col, double set)
	{
		for(int row = 0; row < anyArray.length; row++)
			anyArray[row][col] = set;
	}

	public static void setSingle(double[][] anyArray, int row, int col, double set)
	{
		anyArray[row][col] = set;
	}

	public static void fillArray(double[][] anyArray)
	{
		for(int i = 0; i < anyArray.length; i++)
			for(int j = 0; j < anyArray[i].length; j++)
			{
				int r = i;
				int c = j;
				System.out.print("Please enter double for row " + 								(r + 1) + " and column number " + (c + 1) 						+ " for the array: ");
				anyArray[i][j] = console.nextDouble();
			}
	}
		
	public static double max(double[][] myArray)
	{
		double max = myArray[0][0];
		
		for(int i = 0; i < myArray.length; i++)
			for(int j = 0; j < myArray[i].length; j++)
				if(max < myArray[i][j])
					max = myArray[i][j];
			
		return max;
	}
	
	public static double min(double[][] myArray)
	{
		double min = myArray[0][0];
		
		for(int i = 0; i < myArray.length; i++)
			for(int j = 0; j < myArray[i].length; j++)
				if(min > myArray[i][j])
					min = myArray[i][j];
			
		return min;
	}

	public static boolean search(double[][] myArray, double find)
	{
		boolean found = false;
		for(int i = 0; i < myArray.length; i++)
			for(int j = 0; j < myArray[i].length; j++)
				if(find == myArray[i][j])
				{
					System.out.println("Double " + find + " has been found at row # "
							 + (i + 1) + " and column # " + (j + 1) + ".");
					found = true;
				}
		return found;
	}
		
	public static double average(double[][] myArray)
	{
		double total = 0;
		double average = 0;
		int numElements = 0;
	
		for(int i = 0; i < myArray.length; i++)
			for(int j = 0; j < myArray[i].length; j++)
			{
				total += myArray[i][j];
				numElements = (i + 1) * (j + 1);
			}
		average = total / numElements;
		return average;
	}
		
		
}





















