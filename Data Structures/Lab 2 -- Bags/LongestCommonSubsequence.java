
import java.io.*;
import java.util.*;

/**
 * LongestCommonSubsequence is a program that will determine the longest string that is
 * a subsequence of two input strings. This program applies a brute force solution technique.
 *
 * @author Tyler Paulley
 * @version 7.0  ||  9/11/14
 */
public class LongestCommonSubsequence
{

    public static void main(String args[])
    {
        BagInterface<String> toCheckContainer = new ArrayBag<String>();
        Scanner input = new Scanner(System.in);
		String bestSubsequence = new String("");
		boolean subseqCheck = false;

        System.out.println("This program determines the longest string that is a subsequence"
        				 + "\nof two input strings.\n");


        System.out.println("ENTERING VALUES_________________________________________________________________");
        System.out.println("Please enter the first string:");
        String first = input.next();

		System.out.println("Please enter the second string:");
        String second = input.next();

		toCheckContainer.add(first);


		System.out.println("\n\nCOMPARISONS AND WORK____________________________________________________________");
		while(!toCheckContainer.isEmpty())
		{
       		System.out.println("The strings to check are: " + toCheckContainer + " against the string \"" + second + "\".");
       		String removed = toCheckContainer.remove();
       		subseqCheck = isSubsequence(removed, second);

       		if(subseqCheck)
       			System.out.println("\n\"" + removed + "\" IS a subsequence of \"" + second + "\".");
       		else
       			System.out.println("\n\"" + removed + "\" IS NOT a subsequence of \"" + second + "\".");

			if(bestSubsequence.length() < removed.length())
       			if(isSubsequence(removed, second))
       				bestSubsequence = removed;

       			else if(removed.length() >= bestSubsequence.length() + 2)
       				for(int i = 0; i < removed.length(); i++)
       					if(second.indexOf(removed.charAt(i)) == -1)
       					{
       						removed = nullifyAt(i, removed);
       						toCheckContainer.add(removed);
						}
		}
		System.out.println();


		System.out.println("\nCONCLUSION______________________________________________________________________");
		if(bestSubsequence.equals(""))
			System.out.println("\tCould NOT find a subsequence.\n");
		else
			System.out.println("\tA subsequence was found.\n");

        System.out.println("\tFound \"" + bestSubsequence + "\" for the longest common subsequence.\n");
    }


    /**
     * Determine if one string is a subsequence of the other
     *
     * @param check see if this is a subsequence of the other argument
     * @param other the string to check against.
     * @return a boolean if check is a subsequence of other
     */
    public static boolean isSubsequence(String check, String against)
    {
        boolean result = false;
		String substring = "";
		int i = 0;
		int j = 0;

		if(check.length() > against.length())
			return false;

		while( i < check.length())
			while( j < against.length())
				if(against.indexOf(check.charAt(i), j) > -1)
				{
					substring += check.charAt(i);
					j++;
					i++;
					if(j > check.length() - 1)
						j = against.length();
				}
				else
					return false;

		if(substring.equals(check))
			result = true;
		else
			result = false;

		return result;
    }


	/**
	* Remove a given index of a given string and return the new string
	*
	* @param position remove this index of the String
	* @param str the string to remove an index from
	* @return a String without the given index
	*/
    public static String nullifyAt(int position, String str)
	{
		if(position == 0)
			return str.substring(1, str.length());

		if((position > 0) && (position < str.length()))
			return str.substring(0, position) + str.substring(position + 1, str.length());

		else if(position == str.length())
			return str.substring(0, str.length());

		return null;
	}
}

