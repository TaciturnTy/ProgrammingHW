/*
Tyler Paulley
April 2nd, 2014
Lab Assignment 8
Exercise #3
*/

import java.util.*;

public class TestProgDoubleList
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        UnorderedArrayList<Double> numList =
              new UnorderedArrayList<Double>(50);    //Line 1

        Double num;                                  //Line 2

        System.out.print("Line 3: Enter 8 "
                       + "numbers: ");               //Line 3

        for (int count = 0; count < 8; count++)      //Line 4
        {
            num = console.nextDouble();              //Line 5
            numList.insertEnd(num);                  //Line 6
        }

        System.out.println();                        //Line 7
        System.out.println("Line 8: The list you "
                       + "entered is: ");            //Line 8
        numList.print();                             //Line 9

        System.out.print("Line 10: Enter the num "
                       + "to be deleted: ");         //Line 10
        num = console.nextDouble();                  //Line 11
        System.out.println();                        //Line 12

        numList.remove(num);                         //Line 13
        System.out.println("Line 14: After removing "
                          + num
                          + " the list is:");        //Line 14
        numList.print();                             //Line 15

        System.out.print("Line 16: Enter the "
                       + "position of the num to "
                       + "be deleted: ");            //Line 16
        int position = console.nextInt();            //Line 17
        System.out.println();                        //Line 18

        numList.removeAt(position);                  //Line 19
        System.out.println("Line 20: After removing "
                         + "the element at the "
                         + "position " + position
                         + ", numList:");            //Line 20

        numList.print();                             //Line 21

        System.out.print("Line 22: Enter the "
                      +  "search item: ");           //Line 22

        num = console.nextDouble();                  //Line 23
        System.out.println();                        //Line 24

        if (numList.seqSearch(num) != -1)            //Line 25
            System.out.println("Line 26: Item "
                             + "found in the "
                             + "list");              //Line 26
        else                                         //Line 27
            System.out.println("Line 28: Item "
                             + "not in the list.");  //Line 28

//TESTING THE UNTESTED METHODS: insertAt, insertEnd and replaceAt
//FOR THIS, WE WILL CONTINUE USING THE SAME LIST AS IN THE ORIGINAL

		System.out.println("\nThe methods replaceAt, insertAt and insertEnd weren't tested in "
						 + "\nthe original class, we will test these now.\n");

		System.out.print("Please enter the position of the number to be replaced: ");
		int position2 = console.nextInt();

		System.out.print("Please enter the number to replace it with: ");
		double newDouble = console.nextDouble();
		System.out.println();

		numList.replaceAt(position2, newDouble);
		numList.print();

		System.out.print("Please enter an item to insert into the list: ");
		double addItem = console.nextDouble();

		System.out.print("Please enter where in the list to insert the item: ");
		int where = console.nextInt();
		System.out.println();

		numList.insertAt(where, addItem);
		numList.print();

		System.out.print("Please enter an item to insert at the end: ");
		double addItem2 = console.nextDouble();
		System.out.println();

		numList.insertEnd(addItem2);
		numList.print();
    }
}

