
import java.io.*;
import java.util.*;

/**
 * Hydra is a program that will simulate the work done for a
 * computational task that can be broken down into smaller subtasks.
 *
 * @author Tyler Paulley
 * @version 7.0  ||  9/10/14
 */
public class Hydra {

    public static void main(String args[])
    {
        BagInterface<Integer> headBag = new ArrayBag<Integer>();
        BagInterface<String> workBag = new ArrayBag<String>();

        System.out.println("Please enter the size of the initial head.");
        int startingSize = getInt("   It should be an integer value greater than or equal to 1.");

		headBag.add(startingSize);

        System.out.println("The head bag is " + headBag);

        boolean noOverflow = true;

		while((headBag.getCurrentSize() >= 1) && noOverflow)
		{
        	noOverflow = simulationStep(headBag, workBag);
        	System.out.println(headBag);
		}

        if (noOverflow)
        {
            System.out.println("The number of chops required is " + workBag.getCurrentSize());
        }
        else
        {
            System.out.println("Computation ended early with a bag overflow");
        }

    }

    /**
     * Take one head from the headBag bag.  If it is a final head, we are done with it.
     * Otherwise put in two heads that are one smaller.
     * Always put a chop into the work bag.
     *
     * @param  headBag   a bag holding the headBag yet to be considered
     * @param  workBag   a bag of unit headBag
     *
     */
    public static boolean simulationStep(BagInterface<Integer> heads, BagInterface<String> work)
    {
		boolean result = true;
		int removedHead = heads.remove();

        if(removedHead >= 2)
       	{
			removedHead -= 1;

			if(!heads.isFull())
				heads.add(removedHead);
			else
				result = false;

			if(!heads.isFull())
				heads.add(removedHead);
			else
				result = false;

			if(!work.isFull())
				work.add("chop");
			else
				result = false;

		}
		else
			if(!work.isFull())
				work.add("chop");
			else
				result = false;

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
        try {
            input = new Scanner(System.in);
            System.out.println(rangePrompt);
            result = input.nextInt();

        } catch (NumberFormatException e) {
            System.out.println("Could not convert input to an integer");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        } catch (Exception e) {
            System.out.println("There was an error with System.in");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }
        return result;

    }
}
