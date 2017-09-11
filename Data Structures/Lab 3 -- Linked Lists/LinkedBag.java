/**
A class of bags whose entries are stored in a chain of linked nodes.
The bag is never full.
@author Tyler Paulley
 *
 * The toString method is overwritten to give a nice display of the items in
 * the bag in this format Bag{Size:# <1> <2> <3> <4> }
 * //- * @version 7.0  ||  10/15/14
 */

import java.util.Random;

public class LinkedBag<T> implements BagInterface<T>
{
    private Node firstNode; // reference to first node
    private int numberOfEntries;

    public LinkedBag()
    {
        firstNode = null;
        numberOfEntries = 0;
    } // end default constructor


    /** Sees whether this bag is empty.
    @return true if the bag is empty, or false if not */
    public boolean isEmpty()
    {
        return numberOfEntries == 0;
    } // end isEmpty


    /** Gets the current number of entries in this bag.
    @return the integer number of entries currently in the bag */
    public int getCurrentSize()
    {
        return numberOfEntries;
    } // end getCurrentSize


    /** Sees whether this bag is full.
    @return always returns false (linked bags are never full) */
    public boolean isFull()
    {
        return false;
    } // end isFull


    /** Adds a new entry to this bag.
    @param newEntry the object to be added as a new entry
    @return true */
    public boolean add(T newEntry) // OutOfMemoryError possible
    {
        // add to beginning of chain:
        Node newNode = new Node(newEntry);
        newNode.next = firstNode; // make new node reference rest of chain
        // (firstNode is null if chain is empty)
        firstNode = newNode; // new node is at beginning of chain
        numberOfEntries++;
        return true;
    } // end add


    /** Retrieves all entries that are in this bag.
    @return a newly allocated array of all the entries in the bag */
    public T[] toArray()
    {
        // the cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries]; // unchecked cast
        int index = 0;
        Node currentNode = firstNode;
        while ((index < numberOfEntries) && (currentNode != null)) {
            result[index] = currentNode.data;
            index++;
            currentNode = currentNode.next;
        } // end while
        return result;
    } // end toArray


    /** Counts the number of times a given entry appears in this bag.
    @param anEntry the entry to be counted
    @return the number of times anEntry appears in the bag */
    public int getFrequencyOf(T anEntry)
    {
        int frequency = 0;
        int counter = 0;
        Node currentNode = firstNode;
        while ((counter < numberOfEntries) && (currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                frequency++;
            }
            counter++;
            currentNode = currentNode.next;
        } // end while
        return frequency;
    } // end getFrequencyOf


    public boolean contains(T anEntry)
    {
        boolean found = false;
        Node currentNode = firstNode;
        while (!found && (currentNode != null))
        {
            if (anEntry.equals(currentNode.data))
            	found = true;

            else
            	currentNode = currentNode.next;
        } // end while
        return found;
    } // end contains


    /** Removes one occurrence of a given entry from this bag, if possible.
    @param anEntry the entry to be removed
    @return true if the removal was successful, or false otherwise */
    public boolean remove(T anEntry)
    {
        boolean result = false;
        Node nodeN = getReferenceTo(anEntry);
        if (nodeN != null)
        {
            nodeN.data = firstNode.data; // replace located entry with entry
                // in first node
            remove(); // remove first node
            result = true;
        } // end if
        return result;
    } // end remove


	private class Node
	{
		private T data; // entry in bag
		private Node next; // link to next node

		private Node(T dataPortion)
		{this(dataPortion, null);}

		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;
		}
	}


// Locates a given entry within this bag.
// Returns a reference to the node containing the entry, if located,
// or null otherwise.
    private Node getReferenceTo(T anEntry)
    {
        boolean found = false;
        Node currentNode = firstNode;
        while (!found && (currentNode != null))
        {
            if (anEntry.equals(currentNode.data))
                found = true;
            else
            	currentNode = currentNode.next;
        } // end while
        return currentNode;
    } // end getReferenceTo


    public void clear()
    {
        while (!isEmpty())
        	remove();
    } // end clear


    /** Removes one unspecified entry from this bag, if possible.
    @return either the removed entry, if the removal was successful,
    or null otherwise */
    public T remove()
    {
		Random r = new Random();
		T result = null;
		Node searchingNode = firstNode;

		if(numberOfEntries == 0)
			return result;

		int randomNum = r.nextInt(numberOfEntries);//WHY DOES THIS HAVE TO GO HERE?

		if(randomNum == 0)
		{
			result = this.firstNode.data;
			this.firstNode = this.firstNode.next;
			numberOfEntries--;
		}
		else
		{
			searchingNode = firstNode;
			for(int i = 1; i < randomNum; i++)
				searchingNode = searchingNode.next;

			result = searchingNode.next.data;
			searchingNode.next = searchingNode.next.next;
			numberOfEntries--;
		}

  /*    if (firstNode != null)
        {
            result = firstNode.data;
            firstNode = firstNode.next; // remove first node from chain
            numberOfEntries--;
        } // end if
  */

        return result;
    } // end remove


    /** Override the equals method so that we can tell if two bags contain the same items
     * the contents in the bag.
     * @return a string representation of the contents of the bag */
    public String toString()
    {

        String result = "Bag{Size:" + numberOfEntries + " ";

        Node scout = firstNode;

        for (int index = 0; index < numberOfEntries; index++)
        {
            result += "<" + scout.data + "> ";
            scout = scout.next;
        } // end for

        result += "}";
        return result;
    } // end toArray


    /*********************************************************************
     *
     * METHODS TO BE COMPLETED
     *

     *
     *     ***********************************************************************/
    /** Check to see if two bags are equals.
     * @param aBag another object to check this bag against
     * @return true the two bags contain the same objects with the same frequencies
     */
    public boolean equals(LinkedBag<T> aBag)
    {
        boolean result = false; // result of comparison of bags
        Node thisNode = firstNode;

		if(this.numberOfEntries != aBag.numberOfEntries)
			result = false;
		else if(this.isEmpty() && aBag.isEmpty())
			result = true;
		else

        	for(int i = 0; i < this.numberOfEntries; i++)

        		if(getFrequencyOf(thisNode.data) == aBag.getFrequencyOf(thisNode.data))
        		{
					result = true;
					thisNode = thisNode.next;
				}
        		else
        			result = false;

        return result;
    }  // end equals


    /** Duplicate all the items in a bag.
     * @return true if the duplication is possible
     */
    public boolean duplicateAll()
    {
        boolean success = true; // should always return true

/* AN IMPLEMENTATION USING ARRAYS
		T[] copyArray = this.toArray();

        for(int i = 0; i < copyArray.length; i++)
        {
			Node newNode = new Node(copyArray[i]);
			newNode.next = firstNode;
			firstNode = newNode;
			numberOfEntries++;
		}
*/

		int originalSize = numberOfEntries;
		Node currentNode = firstNode;
		for(int i = 0; i < originalSize; i++)
		{
			Node newNode = new Node(currentNode.data);
			newNode.next = firstNode;
			firstNode = newNode;
			currentNode = currentNode.next;
			numberOfEntries++;
		}
        return success;
    }  // end duplicateAll


    /** Remove all duplicate items from a bag
     */
    public void removeDuplicates()
    {

		T[] copyArray = this.toArray();
		for(int i = 0; i < copyArray.length; i++)
			while(this.getFrequencyOf(copyArray[i]) > 1)
				this.remove(firstNode.data);


//TRYING TO IMPLEMENT THROUGH A SECOND LIST
/*		LinkedBag valueList = new LinkedBag();
		int variable = numberOfEntries;

		for(int i = 0; i < variable; i++)
			if(valueList.getFrequencyOf(firstNode.data) == 0)
				valueList.add(firstNode.data);

			else
				while(this.getFrequencyOf(firstNode.data) > 1)
				{
					remove(firstNode.data);
					numberOfEntries--;
				}
*/

    }  // end removeDuplicates
}
