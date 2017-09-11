/*
Tyler Paulley
Lab4Ex2.java
Lab Assignment #4
Februay 25th, 2014
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab4Ex2
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
//PART 1
		int size,
			start,
			range;

		System.out.print("Please enter the size of the integer arrays: ");
		size = console.nextInt();

		System.out.print("\nPlease enter the start of the integer arrays: ");
		start = console.nextInt();

		System.out.print("\nPlease enter the range of the integer arrays: ");
		range = console.nextInt();
		System.out.println();

//PART 2
		int[] arrayA = new int[size];
		randomArray(arrayA, start, range);

//PART 3
		System.out.print("The integers of the UNSORTED arrayA are:");
		printArray(arrayA);

//PART 4
		Arrays.sort(arrayA);

//PART 5
		System.out.print("The integers of the SORTED arrayA are:");
		printArray(arrayA);

//PART 6
		int[] arrayB = new int[size];
		int[] arrayC = new int[size];

//PART 7
		System.arraycopy(arrayA, 0, arrayB, 0, size);
		System.out.print("The integers of the SORTED arrayB are:");
		printArray(arrayB);

//PART 8
		System.out.print("The result of Arrays.equals(arrayA, arrayB) is: "
					   + Arrays.equals(arrayA, arrayB));

//PART 9
		int value;
		System.out.print("\n\nPlease enter value to fill arrayC: ");
		value = console.nextInt();

		Arrays.fill(arrayC, value);
		printArray(arrayC);

//PART 10
		int key;
		System.out.print("Please enter the key for the Sequential Search of arrayA: ");
		key = console.nextInt();
		int location = sequentialSearch(arrayA, key);
		message("ss", key, location);

//PART 11
		int key2;
		System.out.print("\nPlease enter another key for the Sequential Search of arrayA: ");
		key2 = console.nextInt();
		int location2 = sequentialSearch(arrayA, key2);
		message("ss", key2, location2);

//PART 12
		int location3 = Arrays.binarySearch(arrayA, key);
		message("bs", key, location3);

		int location4 = Arrays.binarySearch(arrayA, key2);
		message("bs", key2, location4);
	}

//PART 13
	public static void randomArray(int[] array, int start, int range)
	{
		Random random = new Random();
		for(int i = 0; i < array.length; i++)
		array[i] = random.nextInt(range) + start;
	}

//PART 14
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

//PART 15
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

//PART 16
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
}