/*
Tyler Paulley
Lab Assignment #5
Exercise 2
SortUtility.java
March 6th, 2014
*/

import java.util.Random;
public class SortUtility
{

//PART 1
	public static void randomArray(int[] array, int start, int range)
	{
		Random random = new Random();
		for(int i = 0; i < array.length; i++)
			array[i] = random.nextInt(range) + start;
	}

//PART 2
	public static void printArray(int[] array)
	{
		System.out.println();

		int j = 9;
		for(int i = 0; i < array.length; i++)
		{
			System.out.printf("%5d", array[i]);

			if(i == j)
			{
				System.out.println();
				j += 10;
			}
		}
		System.out.println("\n");
	}

//PART 3
	public static void bubbleSort(int[] array)
	{
		boolean swapped;
		int pass = 0;
		int numSwaps = 0;

		do
		{
			swapped = false;
			for(int j = 0; j < array.length - pass - 1; j++)
			{
				if(array[j] > array[j + 1])
				{
					swap(array, j, j + 1);
					swapped = true;
					numSwaps++;
				}
			}
		pass++;
		}
		while(swapped && (pass < array.length - 1));

		System.out.print("The array was Bubble Sorted after " + pass + " passes and " + numSwaps + " swaps.\n\n");
	}

//PART 4
	public static void selectionSort(int[] array)
	{
		boolean swapped;
		int pass = 0;
		int numSwaps = 0;

//Using 'array.length - 1' in the statement below would cause the loop to
//terminate prematurely, leaving the last integer unsorted.

		do
		{
			swapped = false;
			for(int j = pass + 1; j < array.length; j++)

			{
				if(array[pass] > array[j])
				{
					swap(array, pass, j);
					swapped = true;
					numSwaps++;
				}
			}
		pass++;
		}
		while(swapped && (pass < array.length - 1));

		System.out.print("The array was Selection Sorted after " + pass + " passes and " + numSwaps + " swaps.\n\n");
	}

//PART 5
	public static void swap(int[] array, int low, int high)
	{
		int temp;
		temp = array[low];
		array[low] = array[high];
		array[high] = temp;
	}

//PART 6
	public static void message(String arrayName, String sortType, String aftOrBef)
	{
			String lazy;

			if(sortType == "ss")
				lazy = "Selection Sort";

			else if(sortType == "bs")
				lazy = "Bubble Sort";

				else
					lazy = sortType;

			String veryLazy;

			if(aftOrBef == "b")
				veryLazy = "Before";

			else if(aftOrBef == "a")
				veryLazy = "After";

				else
					veryLazy = aftOrBef;

			System.out.print("The elements of the array " + arrayName + " " + veryLazy
								+ "\nsorting by " + lazy + " are as follows:");

			System.out.println();
	}
}





















