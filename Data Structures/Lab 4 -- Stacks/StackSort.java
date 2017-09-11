
import java.io.*;
import java.util.*;

/**
 * StackSort is a program that will use two stacks to sort an array of integer values.
 *
 * @author Tyler Paulley
 * @version 7.0 || 10/24/14
 */
public class StackSort
{
    public static void main(String args[])
    {
        int data[] = null;
        int result[] = null;

        Scanner input;
        input = new Scanner(System.in);

        System.out.println("This program sorts an array of integer values.");


        // Create an empty array of integers
        data = createArray(0, 1, 1);
        System.out.println("Original array is: " + representationOfArray(data));
        result = doStackSort(data);
        System.out.println("Sorted array is: " + representationOfArray(result));
        System.out.println();

        // Create an array with one integer
        data = createArray(1, 0, 9);
        System.out.println("Original array is: " + representationOfArray(data));
        result = doStackSort(data);
        System.out.println("Sorted array is: " + representationOfArray(result));
        System.out.println();

        // Create an array with two integers
        data = createArray(2, 0, 9);
        System.out.println("Original array is: " + representationOfArray(data));
        result = doStackSort(data);
        System.out.println("Sorted array is: " + representationOfArray(result));
        System.out.println();

        // Create an array with 10 integers
        data = createArray(10, 0, 9999);
        System.out.println("Original array is: " + representationOfArray(data));
        result = doStackSort(data);
        System.out.println("Sorted array is: " + representationOfArray(result));
        System.out.println();

        // Create an array with 20 integers
        data = createArray(20, 0, 9);
        System.out.println("Original array is: " + representationOfArray(data));
        result = doStackSort(data);
        System.out.println("Sorted array is: " + representationOfArray(result));
        System.out.println();

        System.out.println("Please enter the number of values to sort");
        int size = getInt("   It should be an integer value greater than or equal to 1.");
        // Create an array of the given size

        data = createArray(size, 0, 99);
        System.out.println("Original array is: " + representationOfArray(data));
        result = doStackSort(data);
        System.out.println("Sorted array is: " + representationOfArray(result));
        System.out.println();


    }


    /**
     * Use two stacks to sort the data in an array
     *
     * @param data an array of integer values to be sorted
     * @return     an array of sorted integers
     */
    private static int[] doStackSort(int data[])
    {
    	int result[] = new int[data.length];

		StackInterface<Integer> lowerValues = new VectorStack<Integer>();
		StackInterface<Integer> upperValues = new VectorStack<Integer>();

		int value;

		for(int i = 0; i < data.length; i++)
		{
			value = data[i];

			if(((!lowerValues.isEmpty()) && (lowerValues.peek() > value)) || ((!upperValues.isEmpty()) && (upperValues.peek() < value)))
			{
				if((!lowerValues.isEmpty()) && (lowerValues.peek() > value))
				{
					while((!lowerValues.isEmpty()) && (lowerValues.peek() > value))
					{
						upperValues.push(lowerValues.pop());
					}
					lowerValues.push(value);
				}

				if((!upperValues.isEmpty()) && (upperValues.peek() < value))
				{
					while((!upperValues.isEmpty()) && (upperValues.peek() < value))
					{
						lowerValues.push(upperValues.pop());
					}
					upperValues.push(value);
				}
			}
			else
				upperValues.push(value);
		}

		while(!lowerValues.isEmpty())
		{
			upperValues.push(lowerValues.pop());
		}

		value = 0;
		while((!upperValues.isEmpty()) && (value < data.length))
		{
			result[value] = upperValues.pop();
			value++;
		}
        return result;
    }

    /**
     * load an array with data values
     *
     * @param size number of data values to generate and place in the array
     * @param min minimum value to generate
     * @param max maximum value to generate
     * @return     an array of randomly generated integers
     */
    private static int[] createArray(int size, int min, int max)
    {
        Random generator = new Random();

        // if we get a negative size, just make the size 1
        if (size < 0) {
            size = 1;
        }
        // we need max > min for the random number generator to be happy

        if (max <= min) {
            max = min + 1;
        }

        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = min + generator.nextInt(max - min);
        }

        return data;
    }

    /**
     * Create a string with the data values from an array
     *
     * @param data an array of integer values
     * @return a string representation of the array
     */
    private static String representationOfArray(int data[])
    {
        String result = new String("< ");
        for (int i = 0; i < data.length; i++)
        {
            result += data[i] + " ";
        }
        result += ">";

        return result;
    }

    /**
     * Get an integer value
     *
     * @return     an integer
     */
    private static int getInt(String rangePrompt)
    {
        Scanner input;
        int result = 10;        //default value is 10
        try
        {
            input = new Scanner(System.in);
            System.out.println(rangePrompt);
            result = input.nextInt();

        }
        catch (NumberFormatException e)
        {
            System.out.println("Could not convert input to an integer");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }
        catch (Exception e)
        {
            System.out.println("There was an error with System.in");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }
        return result;

    }
}
