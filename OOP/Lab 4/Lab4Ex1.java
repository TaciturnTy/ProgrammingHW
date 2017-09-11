/*
Tyler Paulley
Lab4Ex1.java
Lab Assignment #4
February 24th, 2014
*/

import java.util.Random;
import java.util.Scanner;
public class Lab4Ex1
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args)
	{

//PART 1
		int size,
			start,
			range;

		System.out.print("Please enter the size of the integer arrays: ");
		size = keyboard.nextInt();

		System.out.print("\nPlease enter the start of the integer arrays: ");
		start = keyboard.nextInt();

		System.out.print("\nPlease enter the range of the integer arrays: ");
		range = keyboard.nextInt();

//PART 2
		int[] arrayA,
			  arrayB,
			  arrayC,
			  arrayD,
			  arrayE;

		arrayA = new int[size];
		arrayB = arrayA;
		arrayC = new int[size];
		arrayD = new int[size];
		arrayE = new int[size];

//PART 3
		randomArray(arrayA, start, range);

//PART 4
		System.out.print("\nThe integers of arrayA are: ");
		printArray(arrayA);

//PART 5
		System.out.print("The integers of arrayB are: ");
		printArray(arrayB);

//PART 6
		System.out.print("The result of (arrayB == arrayA) is: " + shallow(arrayA, arrayB));

//PART 7
		arrayC = (int[])arrayA.clone();

//PART 8
		System.out.print("\n\nThe integers of arrayC are: ");
		printArray(arrayC);

		System.out.print("The result of (arrayC == arrayA) is: " + shallow(arrayC, arrayA));

//PART 9
		randomArray(arrayD, start, range);
		System.out.print("\n\nThe integers of arrayD are: ");
		printArray(arrayD);

//PART 10
		System.arraycopy(arrayD, 0, arrayE, 0, size);

//PART 11
		System.out.print("The elements of arrayE are: ");
		printArray(arrayE);
		System.out.print("The result of (arrayE == arrayD) is: " + shallow(arrayE, arrayD));

//PART 12
		System.out.print("\n\nThe result of equals(arrayD, arrayE) is: " + equals(arrayD, arrayE));
		System.out.println();
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

//PART 15 (and more!)
	public static String shallow(int[] array1, int[] array2)
	{
		if(array1 == array2)
			return "True";

		else
			return "False";
	}

	public static String equals(int[] array1, int[] array2)
	{
		if(array1.length != array2.length)
			return "False";

		for(int i = 0; i < array1.length; i++)
		{
			int differences = 0;

			if(array1[i] == array2[i])
				differences = 0;
			else
				differences += 1;

			if(differences > 0)
				return "False";
		}
		return "True";
	}
}

