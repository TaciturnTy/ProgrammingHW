/*
Tyler Paulley
Lab Assignment #5
Exercise 3
IntArrays.java
March 11th, 2014
*/

import java.util.Arrays;
import java.util.Random;
public class IntArrays
{

//PART 1
	public static void randomIntArray(int[] array, int start, int range)
	{
		Random random = new Random();
		for(int i = 0; i < array.length; i++)
			array[i] = random.nextInt(range) + start;
	}

//PART 2
	public static void print(int[] array)
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
	public static boolean equals(int[] x, int[] y)
	{
		if(x.length != y.length)
		return false;

		for(int i = 0; i < x.length; i++)
			if(x[i] != y[i])
				return false;

		return true;
	}

//PART 4
	public static boolean isSorted(int[] array)
	{
		for(int i = 0; i < array.length - 1; i++)
			if(array[i + 1] < array[i])
				return false;

		return true;
	}

//PART 5
	public static void copy(int[] source, int[] destination)
	{
		for(int i = 0; i < source.length; i++)
			destination[i] = source[i];
	}

//PART 6
	public static void fill(int[] array, int value)
	{
		for(int i = 0; i < array.length; i++)
			array[i] = value;
	}

//PART 7
	public static int[] resized(int[] old, int length)
	{
		int[] returnedArray = new int[length];

		for(int i = 0; i < old.length; i++)
			returnedArray[i] = old[i];

		return returnedArray;
	}

//PART 8
	public static int sequentialSearch(int[] array, int key)
	{
		boolean found = false;
		int location = -1;
		for(int i = 0; i < array.length; i++)
			if(key == array[i])
			{
				location = i;
				return location;
			}
		return location;
	}

//PART 9
	public static void messageSearch(String searchType, int key, int location)
	{
		String lazy;

		if(searchType == "ss")
			lazy = "Sequential Search";

		else if(searchType == "bs")
			lazy = "Binary Search";

			else
				lazy = searchType;

		if(location > 0)
			System.out.print("The key " + key + " was found at the location " + location + " by " + lazy);
		else
			System.out.print("The key " + key + " wasn't found by " + lazy + " since the location is " + location);

		System.out.println();
	}

//PART 10
	public static int binarySearch(int[] array, int key)
	{
		int location = -1;
		int low = 0;
		int high = array.length - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(key == array[mid])
				return mid;

			if(key > array[mid])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return location;
	}

//PART 11
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

//PART 12
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

//PART 13
	public static void swap(int[] array, int low, int high)
	{
		int temp;
		temp = array[low];
		array[low] = array[high];
		array[high] = temp;
	}

//PART 14
	public static void messageSort(String arrayName, String sortType, String aftOrBef)
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