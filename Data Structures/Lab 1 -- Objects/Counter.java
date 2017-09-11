
/**
 * The counter class implements a counter that will roll over to the initial
 * value when it hits the maximum value.
 *
 * @author Tyler Paulley
 * @version 7.0
 */
public class Counter
{
    private int minimum;
    private int maximum;
    private int position;
    private boolean rolled;


    /**
     * The default constructor for objects of class Counter.  Minimum is 0 and the maximum
     * is the largest possible integer.
     */
    public Counter()
    {
        minimum = 0;
        maximum = Integer.MAX_VALUE;
        position = minimum;
    }


    /**
     * The alternate constructor for objects of class Counter.  The minimum and maximum values are given as parameters.
     * The counter starts at the minimum value.
     * @param min The minimum value that the counter can have
     * @param max The maximum value that the counter can have
     * */
    public Counter(int min, int max)
    {
		if(min < max)
		{
        	minimum = min;
        	maximum = max;
        	position = minimum;
		}
		else throw new CounterInitializationException("Exception Thrown: The minimum is not less than the maximum.");
    }


    /**
     * Determine if two counters are in the same state
     *
     * @param otherObject the object to test against for equality
     * @return true if the objects are in the same state
     */
    public boolean equals(Object otherObject)
    {
        boolean result = true;

        if (otherObject instanceof Counter)
        {
			Counter otherCounter = (Counter) otherObject;

            if((otherCounter.minimum != this.minimum) || (otherCounter.maximum != this.maximum) || (otherCounter.position != this.position))
            	result = false;
        }
        return result;
    }


    /**
     * Increases the counter by one
     */
    public void increase()
    {
        position++;
        rolled = false;
		rolledOver();
    }


     /**
     * Decreases the counter by one
     */
    public void decrease()
    {
        position--;
        rolled = false;
		rolledOver();
    }


    /**
     * Get the value of the counter
     *
     * @return the current value of the counter
     */
    public int value()
    {
        return this.position;
    }


    /**
     * Accessor that allows the client to determine if the counter
     * rolled over on the last count and to perform the rollover.
     *
     * @return true if the counter rolled over
     */
    public boolean rolledOver()
    {
        if(minimum > position)
        {
			position = maximum;
			rolled = true;
		}

		else if	(maximum < position)
		{
			position = minimum;
			rolled = true;
		}

		return rolled;
    }


    /**
     * Override the toString method to provide a more informative
     * description of the counter
     *
     * @return a descriptive string about the object
     */
    public String toString()
    {
        String counter = "";

        counter += "Min: " + this.minimum + "; Max: " + this.maximum
        		+ "; Position: " + this.position + "; Rolled? " + this.rolled;

        return counter;
    }
}
