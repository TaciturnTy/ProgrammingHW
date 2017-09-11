
public class ClockCloneTestProg
{
    public static void main(String[] args)
    {
        Clock myClock = new Clock(5, 4, 30);        //Line 1

        System.out.println("Line 2: myClock: "
                           + myClock);              //Line 2

        Clock tempClock = (Clock) myClock.clone();  //Line 3

        System.out.println("Line 4: tempClock: "
                                 + tempClock);      //Line 4

        if (myClock == tempClock)                   //Line 5
            System.out.println("Line 6: myClock "
                             + "and tempClock "
                             + "refer to the "
                             + "same object.");     //Line 6
        else                                        //Line 7
            System.out.println("Line 8: myClock "
                             + "and tempClock do "
                             + "not refer to the "
                             + "same object.");     //Line 8

        myClock.setTime(12, 28, 33);                //Line 9

        System.out.println("Line 10: After "
                         + "changing the time, "
                         + "myClock: "
                         + myClock);                //Line 10

        System.out.println("Line 11: tempClock: "
                          + tempClock);             //Line 11
    }//end main
}


