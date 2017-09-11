/*
Tyler Paulley
April 2nd, 2014
Lab Assignment 8
Exercise #2
*/

public class TestProgPersonalInfo
{
    public static void main(String[] args)
    {
        PersonalInfo student =
                  new PersonalInfo("William", "Jordan",
                                   8, 24, 1963,
                                   555238911);      //Line 1

        System.out.println("Line 2: student: "
                          + student);               //Line 2
        System.out.println();                       //Line 3

        PersonalInfo temp =
                    (PersonalInfo) student.clone(); //Line 4

        System.out.println("Line 5: temp: "
                          + temp);                  //Line 5
        System.out.println();                       //Line 6

        student.setpersonalInfo("Mary", "Smith",
                                11, 22, 1953,
                                888434343);         //Line 7

        System.out.println("Line 8: student: "
                          + student);               //Line 8
        System.out.println();                       //Line 9

        System.out.println("Line 10: temp: "
                          + temp);                  //Line 10

//TESTING THE MISSING METHODS COMPARETO, AND EQUALS
		System.out.println();

		System.out.println("The methods compareTo and equals weren't tested in "
						 + "\nthe original class, we will test these now.\n");
		PersonalInfo myself = new PersonalInfo("Tyler", "Paulley",
										        2, 13, 1995, 12341234);
		PersonalInfo somebody = new PersonalInfo();

		System.out.println("Testing equals, should be false: "
						  + myself.equals(somebody));
		System.out.println("Testing compareTo, should be 1: "
					      + myself.compareTo(somebody));

		somebody = (PersonalInfo) myself.clone();


		System.out.println("Testing equals, should be true: "
						  + myself.equals(somebody));
		System.out.println("Testing compareTo, should be 0: "
						  + myself.compareTo(somebody));
    }
}


