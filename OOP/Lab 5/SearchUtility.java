/*
Tyler Paulley
Lab Assignment #5
Exercise 1
SearchUtility.java
March 4th, 2014
*/


import java.util.Random;
public class SearchUtility
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

//PART 4
	public static void message(String searchType, int key, int location)
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

//PART 5
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
}