/*
Tyler Paulley
Lab Assignment #5
Exercise 1
TestSearchUtility.java
March 4th, 2014
*/

import java.util.Arrays;
import java.util.Scanner;

public class TestSearchUtility extends SearchUtility
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{

//PART 1
		int size,
			start,
			range;

		System.out.print("Please enter the size of the integer array: ");
		size = console.nextInt();

		System.out.print("\nPlease enter the start of the integer array: ");
		start = console.nextInt();

		System.out.print("\nPlease enter the range of the integer array: ");
		range = console.nextInt();

//PART 2
		int[] arrayA = new int[size];

		randomArray(arrayA, start, range);

//PART 3
		System.out.print("\nThe UNSORTED integers of arrayA are: ");
		printArray(arrayA);

//PART 4
		Arrays.sort(arrayA);

//PART 5
		System.out.print("\nThe SORTED integers of arrayA are: ");
		printArray(arrayA);

//PART 6
		int key;

		System.out.print("Please enter the key for the Sequential Search of arrayA: ");
		key = console.nextInt();

		int location = sequentialSearch(arrayA, key);
		message("ss", key, location);
		System.out.println();

//PART 7
		System.out.print("Please enter the key for the Sequential Search of arrayA: ");
		key = console.nextInt();

		location = sequentialSearch(arrayA, key);
		message("ss", key, location);
		System.out.println("\n");


//PART 8
		System.out.print("Please enter the key for the Binary Search of arrayA: ");
		key = console.nextInt();

		location = binarySearch(arrayA, key);
		message("bs", key, location);
		System.out.println();


		System.out.print("Please enter the key for the Binary Search of arrayA: ");
		key = console.nextInt();

		location = binarySearch(arrayA, key);
		message("bs", key, location);
		System.out.println();
	}
}










