
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
    }
}


