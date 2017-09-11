/*
Tyler Paulley
April 2nd, 2014
Lab Assignment 8
Exercise #1
*/

public class TestClock
{
    public static void main(String[] args)
    {

        Clock myClock = new Clock(3, 8, 22);
        Clock yourClock = new Clock(13, 5, 18);
        Clock tempClock = new Clock(3, 8, 22);

        System.out.println("Line 4: myClock: "
                          + myClock);
        System.out.println("Line 5: yourClock: "
                          + yourClock);
        System.out.println("Line 6: tempClock: "
                          + tempClock);

        if (myClock.compareTo(yourClock) == 0)
            System.out.println("Line 8: the time "
                             + "of myClock is "
                             + "the same as the "
                             + "time of "
                             + "yourClock.");
        else if (myClock.compareTo(yourClock) < 0)
             System.out.println("Line 10: the time "
                             + "of myClock is "
                             + "less than the "
                             + "time of "
                             + "yourClock.");
        else
             System.out.println("Line 12: the time "
                             + "of myClock is "
                             + "greater than the "
                             + "time of "
                             + "yourClock.");

        if (myClock.compareTo(tempClock) == 0)
            System.out.println("Line 14: the time "
                             + "of myClock is "
                             + "the same as the "
                             + "time of "
                             + "tempClock.");
        else if (myClock.compareTo(tempClock) < 0)
             System.out.println("Line 16: the time "
                             + "of myClock is "
                             + "less than the "
                             + "time of "
                             + "tempClock.");
        else
             System.out.println("Line 18: the time "
                             + "of myClock is "
                             + "greater than the "
                             + "time of "
                             + "tempClock.");


    	System.out.println();

        Clock myClock2 = new Clock(5, 4, 30);

        System.out.println("Line 2: myClock2: "
                           + myClock2);

        Clock tempClock2 = (Clock) myClock2.clone();

        System.out.println("Line 4: tempClock: "
                                 + tempClock2);

        if (myClock2 == tempClock2)
            System.out.println("Line 6: myClock2 "
                             + "and tempClock2 "
                             + "refer to the "
                             + "same object.");
        else
            System.out.println("Line 8: myClock2 "
                             + "and tempClock2 do "
                             + "not refer to the "
                             + "same object.");

        myClock2.setTime(12, 28, 33);

        System.out.println("Line 10: After "
                         + "changing the time, "
                         + "myClock2: "
                         + myClock2);

        System.out.println("Line 11: tempClock: "
                          + tempClock2);

//TESTING THE INCREMENT METHODS THE DEFAULT AND COPY CONSTRUCTOR,
//THE EQUALS, AND ACCESSOR METHODS

		System.out.println("\nThe increment, equals, and accessor methods and default and copy \n" +
						   "constructor weren't tested in the original class, we will test these now.");

		System.out.println();
		Clock clockOne = new Clock(2, 10, 20);
		Clock emptyClock = new Clock();
		Clock copyClock = new Clock(clockOne);
		System.out.println("Are clocks are equal? " + clockOne.equals(emptyClock)
						 + "\nShould be false");
		System.out.println("Is the clock and its copy equal now? "
						 + clockOne.equals(copyClock) + "\nShould be true.");


		System.out.println("\nHere is the clock " + clockOne);

		clockOne.incrementHours();
		clockOne.incrementSeconds();
		clockOne.incrementMinutes();

		System.out.println("The clock's hours incremented by one is: " + clockOne.getHours());
		System.out.println("The clock's minutes incremented by one is: " + clockOne.getMinutes());
		System.out.println("The clock's seconds incremented by one is: " + clockOne.getSeconds());
	}
}


