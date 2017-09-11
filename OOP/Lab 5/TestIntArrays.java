/*
Tyler Paulley
Lab Assignment #5
Exercise 3
TestIntArrays.java
March 11th, 2014
*/

import java.util.Arrays;
import java.util.Scanner;

public class TestIntArrays extends IntArrays
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

		randomIntArray(arrayA, start, range);

//PART 3
		messageSort("arrayA", "bs", "b");

//PART 4
		print(arrayA);

//PART 5
		bubbleSort(arrayA);

//PART 6
		messageSort("arrayA", "bs", "a");
		print(arrayA);

//PART 7
		System.out.print("The output of isSorted(arrayA) is: ");
		System.out.print(isSorted(arrayA));
		System.out.println("\n");

//PART 8
		int[] arrayB = new int[size];
		int[] arrayC = new int[size];

//PART 9
		randomIntArray(arrayB, start, range);
		randomIntArray(arrayC, start, range);

		messageSort("arrayB", "ss", "b");
		print(arrayB);

		System.out.println("The integers of array arrayC are:");
		print(arrayC);

//PART 10
		System.out.print("The output of isSorted(arrayB) is: ");
		System.out.print(isSorted(arrayB));
		System.out.println();

//PART 11
		selectionSort(arrayB);
		messageSort("arrayB", "ss", "a");
		print(arrayB);

//PART 12
		int[] arrayD = new int[size];
		copy(arrayA, arrayD);
		System.out.print("The integers of arrayD are as follows:");
		print(arrayD);

//PART 13
		System.out.print("Please enter the integer to fill arrayC: ");
		int filler = console.nextInt();
		fill(arrayC, filler);
		System.out.print("The integers of arrayC are as follows:");
		print(arrayC);

//PART 14
		int key;

		System.out.print("Please enter an existing key for the Sequential Search of arrayA: ");
		key = console.nextInt();

		int location = sequentialSearch(arrayA, key);
		messageSearch("ss", key, location);
		System.out.println();

//PART 15
		System.out.print("Please enter a non-existing key for the Sequential Search of arrayA: ");
		key = console.nextInt();

		location = sequentialSearch(arrayA, key);
		messageSearch("ss", key, location);
		System.out.println("\n");

//PART 16
		System.out.print("Please enter an existing key for the Binary Search of arrayA: ");
		key = console.nextInt();

		location = binarySearch(arrayA, key);
		messageSearch("bs", key, location);
		System.out.println();


		System.out.print("Please enter a non-existing key for the Binary Search of arrayA: ");
		key = console.nextInt();

		location = binarySearch(arrayA, key);
		messageSearch("bs", key, location);
		System.out.println();

//PART 17 (The method resized() wasn't asked to be tested,
//		  therefore it will be tested here.)

		int[] arrayE = resized(arrayA, size + 5);
		System.out.print("The value of arrayE adds five value spaces to arrayA and is as follows:");
		print(arrayE);
	}
}