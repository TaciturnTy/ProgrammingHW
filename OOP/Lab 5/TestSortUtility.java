/*
Tyler Paulley
Lab Assignment #5
Exercise 2
TestSortUtility.java
March 7th, 2014
*/

import java.util.Arrays;
import java.util.Scanner;

public class TestSortUtility extends SortUtility
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
		System.out.println();

//PART 2
		int[] arrayA = new int[size];
		int[] arrayB = new int[size];

		randomArray(arrayA, start, range);
		randomArray(arrayB, start, range);

//PART 3
		message("arrayA", "bs", "b");
		printArray(arrayA);

//PART 4
		bubbleSort(arrayA);
		message("arrayA", "bs", "a");
		printArray(arrayA);

//PART 5
		message("arrayB", "ss", "b");
		printArray(arrayB);

//PART 6
		selectionSort(arrayB);
		message("arrayB", "ss", "a");
		printArray(arrayB);
	}
}