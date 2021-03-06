
public class Person implements Cloneable, Comparable
{
    private String firstName; //store the first name
    private String lastName;  //store the last name

       //Default constructor;
       //Initialize firstName and lastName to empty string
       //Postcondition: firstName = ""; lastName = "";
    public Person()
    {
        firstName = "";
        lastName = "";
    }

       //Constructor with parameters
       //Set firstName and lastName according to the parameters
       //Postcondition: firstName = first; lastName = last;
    public Person (String first, String last)
    {
        firstName = first;
        lastName = last;
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

       //Method to return the first name and last name
       //as a string in the form firstName lastName
    public String toString()
    {
        return (firstName + " " + lastName);
    }

       //Method to set firstName and lastName according to
       //the parameters
       //Postcondition: firstName = first; lastName = last;
    public void setName(String first, String last)
    {
         firstName = first;
         lastName = last;
    }

       //Method to return the firstName
       //Postcondition: the value of firstName is returned
    public String getFirstName()
    {
        return firstName;
    }

       //Method to return the lastName
       //Postcondition: the value of lastName is returned
    public String getLastName()
    {
        return lastName;
    }

    public boolean equals(Object otherPerson)
    {
        Person temp = (Person) otherPerson;

        return (firstName.equals(temp.firstName)
                && lastName.equals(temp.lastName));
    }

    public int compareTo(Object otherPerson)
    {
        Person temp = (Person) otherPerson;

        if (firstName.equals(temp.firstName)
            && lastName.equals(temp.lastName))
            return 0;
        else if ((lastName.compareTo(temp.lastName) < 0) ||
                 ((lastName.equals(temp.lastName) &&
                  (firstName.compareTo(temp.firstName) < 0))))
             return -1;
        else
             return 1;
    }
}
