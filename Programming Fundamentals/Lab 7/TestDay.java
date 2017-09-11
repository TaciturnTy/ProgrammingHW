/*
Tyler Paulley
Lab Assignment 7
TestDay.java
Nov. 7th, 2013
*/

public class TestDay extends Object
{
	public static void main (String[]args)
	{
	
//TESTING BOTH THE CONSTRUCTORS AND THE METHOD print	
		Day weekStart = new Day();
		weekStart.print();

		Day today = new Day("Wed");
		today.print();

		System.out.println();


//TESTING THE METHOD setDay AND getDay FOR OBJECTS FROM BOTH CONSTRUCTORS
		weekStart.setDay("Tue");

		System.out.println("The value of \"weekStart\" from the default constructor has "
				 + "\nbeen changed from Sun to " + weekStart.getDay());

		today.setDay("Thu");
		
		System.out.println("The value of \"today\" from the constructor with a parameter has "
				 + "\nbeen changed from Sun to " + today.getDay());

		System.out.println();


//TESTING THE METHODS nextDay AND getDay FOR OBJECTS FROM BOTH CONSTRUCTORS
		weekStart.nextDay();
		
		System.out.println("The value of \"weekStart\" has been moved forward one day"
				 + "\nfrom Tue to " + weekStart.getDay());

		today.nextDay();
	
		System.out.println("The value of \"today\" has been moved forward one day"
				 + "\nfrom Thu to " + today.getDay());

		System.out.println();


//TESTING THE METHODS prevDay AND getDay FOR OBJECTS FROM BOTH CONSTRUCTORS
		weekStart.prevDay();
		
		System.out.println("The value of \"weekStart\" has been moved back one day"
				 + "\nfrom Wed to " + weekStart.getDay());

		today.prevDay();
	
		System.out.println("The value of \"today\" has been moved back one day"
				 + "\nfrom Fri to " + today.getDay());

		System.out.println();


//TESTING THE METHOD calcDay FOR OBJECTS FROM BOTH CONSTRUCTORS
		weekStart.calcDay(-2);

		System.out.println("The value of \"weekStart\" has been moved back 2 days"
				 + "\nfrom Tue to " + weekStart.getDay());

		today.calcDay(3);
	
		System.out.println("The value of \"today\" has been moved forward 3 days"
				 + "\nfrom Thu to " + today.getDay());

/*
EVERYTHING IN THE CLASS DAY WAS CHECKED: THE TWO CONSTRUCTORS, print, getDay, setDay,
nextDay, prevDay, AND calcDay.
*/

	}
}

		