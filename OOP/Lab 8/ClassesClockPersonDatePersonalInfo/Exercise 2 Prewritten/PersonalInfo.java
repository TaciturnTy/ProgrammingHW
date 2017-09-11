
public class PersonalInfo implements Cloneable, Comparable
{
    private Person name;
    private Date bDay;
    private int personID;

        //Default constructor
        //Instance variables are set to the default values
        //Postcondition: firstName = ""; lastName = "";
        //               dMonth = 1; dDay = 1; dYear = 1900;
        //               personID = 0;
    public PersonalInfo()
    {
        name = new Person();
        bDay = new Date();
        personID = 0;
    }

        //Constructor with parameters
        //Instance variables are set according to the parameters
        //Postcondition: firstName = first; lastName = last;
        //               dMonth = month; dDay = day; dYear = year;
        //               personID = ID;
   	public PersonalInfo(String first, String last, int month,
                       int day, int year, int ID)
   	{
        name = new Person(first, last);
        bDay = new Date(month, day, year);
        personID = ID;
    }

       //Method clone
       //Postcondition: Returns a reference of the copy of
       //               object's data.
    public Object clone()
    {
        try
        {
            PersonalInfo copy = (PersonalInfo) super.clone();

            copy.bDay = (Date) bDay.clone();    //explicitly clone
                                                //the object bDay
            copy.name = (Person) name.clone();  //explicitly clone
                                                //the object name

            return copy;
        }
        catch (CloneNotSupportedException e)
        {
            return null;
        }
    }

        //Method to set the personal information
        //Instance variables are set according to the parameters
        //Postcondition: firstName = first; lastName = last;
        //               dMonth = month; dDay = day; dYear = year;
        //               personID = ID;
    public void setpersonalInfo(String first, String last, int month,
                               int day, int year, int ID)
    {
        name.setName(first,last);
        bDay.setDate(month,day,year);
        personID = ID;
    }

        //Method to return the string containing personal information
    public String toString()
    {
        return ("Name: " + name.toString() + "\n"
              + "Date of birth: " + bDay.toString() + "\n"
              + "Personal ID: " + personID);
    }

     public boolean equals(Object other)
     {
        PersonalInfo temp = (PersonalInfo) other;

         return (personID == temp.personID
                 && name.equals(temp.name)
                 && bDay.equals(temp.bDay));
     }

     public int compareTo(Object other)
     {
        PersonalInfo temp = (PersonalInfo) other;

        if (personID == temp.personID
            && name.equals(temp.name)
            && bDay.equals(temp.bDay))
            return 0;
        else if ((personID < temp.personID) ||
			     (personID == temp.personID
			      && name.compareTo(temp.name) < 0) ||
                 (personID == temp.personID
                  && name.equals(temp.name)
                  && bDay.compareTo(temp.bDay) < 0))
             return -1;
        else
             return 1;
    }
}
