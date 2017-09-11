/*
Tyler Paulley
Lab Assignment 7
TestPerson.java
Nov. 10th, 2013
*/

public class TestPerson
{
	public static void main(String[] args)
	{
		Person nameless = new Person();

		Person firstLast = new Person("Tyler", "Paulley");
		
		Person fullName = new Person("Tyler", "Nelson", "Paulley");

		firstLast.setFirst("John");
		firstLast.setMiddle("Jeffery");
		firstLast.setLast("Doe");

		nameless.setName("Tyler", "Nelson", "Paulley");

		System.out.println("The first name of \"" + nameless.toString()
				 + "\" is " + nameless.getFirst() + ".");

		System.out.println("The middle name of \"" + nameless.toString()
				 + "\" is " + nameless.getMiddle() + ".");
		
		System.out.println("The last name of \"" + nameless.toString()
				 + "\" is " + nameless.getLast() + ".");
		System.out.println();


//TESTING COMPARING FIRST, MIDDLE AND LAST
//THESE STATEMENTS SHOULD ALL BE UNEQUAL
		if(firstLast.compareFirst("Tyler"))
			System.out.println("The first name \"" + firstLast.getFirst() 
					 + "\" is equal to \"Tyler\"");
		else
			System.out.println("The first name \"" + firstLast.getFirst() 
					 + "\" is not equal to \"Tyler\"");

		if(firstLast.compareMiddle("Nelson"))
			System.out.println("The middle name \"" + firstLast.getMiddle() 
					 + "\" is equal to \"Nelson\"");
		else
			System.out.println("The middle name \"" + firstLast.getMiddle() 
					 + "\" is not equal to \"Nelson\"");

		if(firstLast.compareLast("Paulley"))
			System.out.println("The last name \"" + firstLast.getLast() 
					 + "\" is equal to \"Paulley\"");
		else
			System.out.println("The last name \"" + firstLast.getLast() 
					 + "\" is not equal to \"Paulley\"");


//THESE STATEMENTS SHOULD ALL BE EQUAL
		if(nameless.compareFirst("Tyler"))
			System.out.println("The first name \"" + nameless.getFirst() 
					 + "\" is equal to \"Tyler\"");
		else
			System.out.println("The first name \"" + nameless.getFirst() 
					 + "\" is not equal to \"Tyler\"");

		if(nameless.compareMiddle("Nelson"))
			System.out.println("The middle name \"" + nameless.getMiddle() 
					 + "\" is equal to \"Nelson\"");
		else
			System.out.println("The middle name \"" + nameless.getMiddle() 
					 + "\" is not equal to \"Nelson\"");

		if(nameless.compareLast("Paulley"))
			System.out.println("The last name \"" + nameless.getLast() 
					 + "\" is equal to \"Paulley\"");
		else
			System.out.println("The last name \"" + nameless.getLast() 
					 + "\" is not equal to \"Paulley\"");
		System.out.println();


		if(nameless.equals(firstLast))
			System.out.println("The name \"" + nameless.toString()
				       + "\" is equal to the name \"" + firstLast.toString() + "\"");
		else
			System.out.println("The name \"" + nameless.toString()
				       + "\" is not equal to the name \"" + firstLast.toString() + "\"");

		if(nameless.equals(fullName))
			System.out.println("The name \"" +  nameless.toString()
				       + "\" is equal to the name \"" + fullName.toString() + "\"");
		else
			System.out.println("The name \"" +  nameless.toString()
				       + "\" is not equal to the name \"" + fullName.toString() + "\"");		
		System.out.println();

		
		nameless.makeCopy(firstLast);

		System.out.println("The copy of the name \"" + nameless.toString() + "\" is equal to \""
				 + firstLast.toString() + "\".");

		Person Copy = new Person();
		Copy = nameless.getCopy();

		System.out.println("Copying the name \"" + nameless.toString() + "\" results in the name \"" 
				 + Copy.toString() + "\"");
	}
}
		






