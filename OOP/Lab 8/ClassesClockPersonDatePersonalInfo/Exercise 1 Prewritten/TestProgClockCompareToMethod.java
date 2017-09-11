
public class TestProgClockCompareToMethod
{
    public static void main(String[] args)
    {
        Clock myClock = new Clock(3, 8, 22);         //Line 1
        Clock yourClock = new Clock(13, 5, 18);      //Line 2
        Clock tempClock = new Clock(3, 8, 22);       //Line 3

        System.out.println("Line 4: myClock: "
                          + myClock);                //Line 4
        System.out.println("Line 5: yourClock: "
                          + yourClock);              //Line 5
        System.out.println("Line 6: tempClock: "
                          + tempClock);              //Line 6

        if (myClock.compareTo(yourClock) == 0)       //Line 7
            System.out.println("Line 8: the time "
                             + "of myClock is "
                             + "the same as the "
                             + "time of "
                             + "yourClock.");        //Line 8
        else if (myClock.compareTo(yourClock) < 0)   //Line 9
             System.out.println("Line 10: the time "
                             + "of myClock is "
                             + "less than the "
                             + "time of "
                             + "yourClock.");        //Line 10
        else                                         //Line 11
             System.out.println("Line 12: the time "
                             + "of myClock is "
                             + "greater than the "
                             + "time of "
                             + "yourClock.");        //Line 12

        if (myClock.compareTo(tempClock) == 0)       //Line 13
            System.out.println("Line 14: the time "
                             + "of myClock is "
                             + "the same as the "
                             + "time of "
                             + "tempClock.");        //Line 14
        else if (myClock.compareTo(tempClock) < 0)   //Line 15
             System.out.println("Line 16: the time "
                             + "of myClock is "
                             + "less than the "
                             + "time of "
                             + "tempClock.");        //Line 16
        else                                         //Line 17
             System.out.println("Line 18: the time "
                             + "of myClock is "
                             + "greater than the "
                             + "time of "
                             + "tempClock.");        //Line 18
    }
}

