//class Clock

public class Clock implements Cloneable, Comparable
{
    private int hr;  //store hours
    private int min; //store minutes
    private int sec; //store seconds

        //Default constructor
        //Postcondition: hr = 0; min = 0; sec = 0
    public Clock()		//CHECKED
    {
        setTime(0, 0, 0);
    }

        //Constructor with parameters
        //The time is set according to the parameters
        //Postcondition: hr = hours; min = minutes; sec = seconds
    public Clock(int hours, int minutes, int seconds)		//CHECKED
    {
        setTime(hours, minutes, seconds);
    }

        //Copy constructor
        //The time is set according to the time of otherClock
        //Postcondition: hr = otherClock.hr;
        //               min = otherClock.min;
        //               sec = otherClock.sec
    public Clock(Clock otherClock)			//CHECKED
    {
        setTime(otherClock.hr, otherClock.min, otherClock.sec);
    }

        //Method clone
        //Postcondition: Returns a reference of the copy of
        //               object's data.
    public Object clone()			//CHECKED
    {
        try
        {
            return super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            return null;
        }
    }

        //Method to set the time
        //The time is set according to the parameters
        //Postcondition: hr = hours; min = minutes;
        //               sec = seconds
    public void setTime(int hours, int minutes, int seconds)		//CHECKED
    {
        if (0 <= hours && hours < 24)
            hr = hours;
        else
            hr = 0;

        if (0 <= minutes && minutes < 60)
            min = minutes;
        else
            min = 0;

        if (0 <= seconds && seconds < 60)
            sec = seconds;
        else
            sec = 0;
    }

        //Method to return the hours
        //Postcondition: The value of hr is returned.
    public int getHours()
    {
        return hr;
    }

        //Method to return the minutes
        //Postcondition: The value of min is returned.
    public int getMinutes()
    {
        return min;
    }

        //Method to return the seconds
        //Postcondition: The value of sec is returned.
    public int getSeconds()
    {
        return sec;
    }

        //Method to increment the time by one second
        //Postcondition: The time is incremented by one second.
        //If the before-increment time is 23:59:59, the time
        //is reset to 00:00:00.
    public void incrementSeconds()
    {
        sec++;

         if (sec > 59)
         {
             sec = 0;
             incrementMinutes(); //increment minutes
         }
    }

        //Method to increment the time by one minute
        //Postcondition: The time is incremented by one minute.
        //If the before-increment time is 23:59:53, the time
        //is reset to 00:00:53.
    public void incrementMinutes()
    {
        min++;

        if (min > 59)
        {
            min = 0;
            incrementHours(); //increment hours
        }
    }

        //Method to increment the time by one hour
        //Postcondition: The time is incremented by one hour.
        //If the before-increment time is 23:45:53, the time
        //is reset to 00:45:53.
    public void incrementHours()
    {
        hr++;

        if (hr > 23)
           hr = 0;
    }

          //Method to compare the two times
          //Postcondition: Returns true if this time is equal to
          //               otherClock; otherwise returns false
    public boolean equals(Object otherClock)	//CHECKED
    {
        Clock temp = (Clock) otherClock;

        return (hr == temp.hr
                && min == temp.min
                && sec == temp.sec);
    }

        //Method to compare to two times.
        //Postconditition: Returns a negative value if the
        //                 time of this clock is less than
        //                 the time of otheClock; zero if
        //                 the time of this object is the
        //                 same as the time of otherClock;
        //                 returns a positive value if the
        //                 time of this clock is greater
        //                 than the time of otheClock
    public int compareTo(Object otherClock)			//CHECKED
    {
        Clock temp = (Clock) otherClock;

        int hrDiff = hr - temp.hr;

        if (hrDiff != 0)
            return hrDiff;

        int minDiff = min - temp.min;

        if (minDiff != 0)
            return minDiff;

        return sec - temp.sec;
    }

    public String toString()  //CHECKED
    {
        String str = "";

        if (hr < 10)
             str = "0";
        str = str + hr + ":";

        if (min < 10)
             str = str + "0" ;
        str = str + min + ":";

        if (sec < 10)
             str = str + "0";
        str = str + sec;

        return str;
    }
}
