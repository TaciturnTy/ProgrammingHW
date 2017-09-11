import java.util.Random;
/**
A class of bags whose entries are stored in a chain of linked nodes.
The bag is never full.
@author Frank M. Carrano
 *
 * The toString method is overwritten to give a nice display of the items in
 * the bag in this format Bag{Size:# <1> <2> <3> <4> }
 * //- * @version 3.0
 */
public class LinkedBag<T> implements BagInterface<T> {

    private Node firstNode; // reference to first node
    private int numberOfEntries;

    public LinkedBag() {
        firstNode = null;
        numberOfEntries = 0;
    } // end default constructor

    /** Sees whether this bag is empty.
    @return true if the bag is empty, or false if not */
    public boolean isEmpty() {
        return numberOfEntries == 0;
    } // end isEmpty

    /** Gets the current number of entries in this bag.
    @return the integer number of entries currently in the bag */
    public int getCurrentSize() {
        return numberOfEntries;
    } // end getCurrentSize

    /** Sees whether this bag is full.
    @return always returns false (linked bags are never full) */
    public boolean isFull() {
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
    public T[] toArray() {
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
    public int getFrequencyOf(T anEntry) {
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

    public boolean contains(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;
        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        } // end while
        return found;
    } // end contains

    /** Removes one occurrence of a given entry from this bag, if possible.
    @param anEntry the entry to be removed
    @return true if the removal was successful, or false otherwise */
    public boolean remove(T anEntry) {
        boolean result = false;
        Node nodeN = getReferenceTo(anEntry);
        if (nodeN != null) {
            nodeN.data = firstNode.data; // replace located entry with entry
                // in first node
            remove(); // remove first node
            result = true;
        } // end if
        return result;
    } // end remove

    // Locates a given entry within this bag.
// Returns a reference to the node containing the entry, if located,
// or null otherwise.
    private Node getReferenceTo(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;
        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        } // end while
        return currentNode;
    } // end getReferenceTo

    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    } // end clear

    private class Node {

        private T data; // entry in bag
        private Node next; // link to next node

        private Node(T dataPortion) {
            this(dataPortion, null);
        } // end constructor

        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        } // end constructor
    } // end Node

    /** Removes one unspecified entry from this bag, if possible.
    @return either the removed entry, if the removal was successful,
    or null otherwise */
    public T remove() {
		Random rand = new Random();
		 T result = null;
		 Node currNode = firstNode;


		if(numberOfEntries == 0)
			return result;
		int randNum = rand.nextInt(numberOfEntries) + 1;
		if(randNum == 1)
		{
			result = firstNode.data;
			firstNode = firstNode.next;
		}
		else
		{
			currNode = firstNode;
			for(int k = 1; k < randNum - 1; k++)
				currNode = currNode.next;
				result = currNode.next.data;
				currNode.next = currNode.next.next;
		}
			numberOfEntries--;
		/*if(firstNode == null)
			return result;

		else if(firstNode != null)
		{
			int randNum = rand.nextInt(numberOfEntries) + 1;
			if(randNum == 1)
			{
				result = firstNode.data;
				firstNode = firstNode.next;
				numberOfEntries--;
			}
			else
			{
				currNode = firstNode;
				for(int i = 1; i < randNum - 1; i++)
					currNode = currNode.next;
				result = currNode.next.data;
				currNode.next = currNode.next.next;
			}
				numberOfEntries--;
			}


			else if(randNum == numberOfEntries)
			{
				for(int i = 1; i <= numberOfEntries; i++)
				{
					currNode = firstNode.next;
					//currNode = currNode.next;
				}
				firstNode.next = currNode;
				currNode.next = firstNode.next;
				firstNode = firstNode.next;
				numberOfEntries --;
			}
			else
			{
				for(int j = 1; j <= randNum; j++)
				{
					//currNode = firstNode.next;
					currNode = currNode.next;
				}
				Node followingNode = getReferenceTo(currNode.data);
				followingNode.next = currNode.next;
				firstNode.next = currNode;
				currNode.next = firstNode.next;
				firstNode = firstNode.next;
				numberOfEntries--;
			}
		}*/
        return result;
    } // end remove

    /** Override the equals method so that we can tell if two bags contain the same items
     * the contents in the bag.
     * @return a string representation of the contents of the bag */
    public String toString() {

        String result = "Bag{Size:" + numberOfEntries + " ";

        Node scout = firstNode;

        for (int index = 0; index < numberOfEntries; index++) {
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
    public boolean equals(LinkedBag<T> aBag) {
        boolean result = false; // result of comparison of bags
        Node currNode1 = firstNode;
        Node currNode2 = aBag.firstNode;

		if(aBag.getCurrentSize() != numberOfEntries)
			result = false;
		else if(aBag.isEmpty() && numberOfEntries == 0)
			result = true;
		else
				for(int i = 0; i <= numberOfEntries; i++)
					if(aBag.getFrequencyOf(currNode2.data) == getFrequencyOf(currNode1.data))
					{
						result = true;

					}
					else
						result = false;
        return result;
    }  // end equals

    /**Duplicate all the items in a bag.
     * @return true if the duplication is possible
     */
    public boolean duplicateAll() {
       boolean success = false; // should always return true
       /* Node currNode = firstNode;

        for(int i = 0; i < numberOfEntries; i++)
        {
        	add(currNode.data);
        	currNode = currNode.next;
        	numberOfEntries++;
		}

        // COMPLETE THIS METHOD*/

        return success;
    }  // end duplicateAll*/

    //Remove all duplicate items from a bag

    public void removeDuplicates() {

        for(int i = 0; i < numberOfEntries * numberOfEntries; i++)
        	{if(getFrequencyOf(firstNode.data) > 1)
        	{
        		remove(firstNode.data);

			}//numberOfEntries--;
			}
        	// COMPLETE THIS METHOD

        return;
    }  // end removeDuplicates
}
