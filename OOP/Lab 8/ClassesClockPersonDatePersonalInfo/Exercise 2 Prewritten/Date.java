
public class Date implements Cloneable, Comparable
{
    private int dMonth;    //variable to store the month
    private int dDay;      //variable to store the day
    private int dYear;     //variable to store the year

       //Default constructor
       //The instance variables dMonth, dDay, and dYear are
       //set to the default values.
       //Postcondition: dMonth = 1; dDay = 1; dYear = 1900;
    public Date()
    {
        dMonth = 1;
        dDay = 1;
        dYear = 1900;
    }

       //Constructor with parameters
       //The instance variables dMonth, dDay, and dYear are
       //set according to the parameters.
       //Postcondition: dMonth = month; dDay = day;
       //               dYear = year;
    public Date(int month, int day, int year)
    {
        dMonth = month;
        dDay = day;
        dYear = year;
    }

       //Method clone
       //Postcondition: Returns a reference of the copy of
       //               object's data.
    public Object clone()
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

       //Method to set the date
       //The instance variables dMonth, dDay, and dYear are
       //set according to the parameters.
       //Postcondition: dMonth = month; dDay = day;
       //               dYear = year;
    public void setDate(int month, int day, int year)
    {
        dMonth = month;
        dDay = day;
        dYear = year;
    }

       //Method to return the month
       //Postcondition: The value of dMonth is returned.
    public int getMonth()
    {
        return dMonth;
    }

       //Method to return the day
       //Postcondition: The value of dDay is returned.
    public int getDay()
    {
        return dDay;
    }

       //Method to return the year
       //Postcondition: The value of dYear is returned.
    public int getYear()
    {
        return dYear;
    }

       //Method to return the date in the form mm-dd-yyyy
    public String toString()
    {
        return (dMonth + "-" + dDay + "-" + dYear);
    }

    public boolean equals(Object otherDate)
    {
        Date temp = (Date) otherDate;

        return (dYear == temp.dYear
                && dMonth == temp.dMonth
                && dDay == temp.dDay);
    }

       //Method to compare to two times.
       //Postconditition: Returns a negative value if this
       //                 date is less than otherDate
       //                 zero if this date is the
       //                 same as otherDate; returns
       //                 a positive value if the
       //                 time date is greater than
       //                 otherDate.
    public int compareTo(Object otherDate)
    {
        Date temp = (Date) otherDate;

        int yrDiff = dYear - temp.dYear;

        if (yrDiff != 0)
            return yrDiff;

        int monthDiff = dMonth - temp.dMonth;

        if (monthDiff != 0)
            return monthDiff;

        return dDay - temp.dDay;
    }
}
