/*
Tyler Paulley
Lab Assignment 7
Person.java
Nov. 10th, 2013
*/

public class Person
{
	private String first;
	private String middle;
	private String last;

	public Person()
	{
		first = "";
		middle = "";
		last = "";
	}

	public Person(String f, String l)
	{
		first = f;
		last = l;
	}
	
	public Person(String f, String m, String l)
	{
		first = f;
		middle = m;
		last = l;
	}

	public void setFirst(String f)
	{
		first = f;
	}
		
	public void setMiddle(String m)
	{
		middle = m;
	}

	public void setLast(String l)
	{
		last = l;
	}

	public void setName(String f, String m, String l)
	{
		first = f;
		middle = m;
		last = l;
	}

	public String getFirst()
	{
		return first;
	}

	public String getMiddle()
	{
		return middle;
	}

	public String getLast()
	{
		return last;
	}

	public boolean compareFirst(String f)
	{
		boolean equals = false;

		if(first.compareTo(f) == 0) 
			equals = true;
		
		return equals;
	}

	public boolean compareMiddle(String m)
	{
		boolean equals = false;

		if(middle.compareTo(m) == 0) 
			equals = true;
		
		return equals;
	}

	public boolean compareLast(String l)
	{
		boolean equals = false;

		if(last.compareTo(l) == 0) 
			equals = true;
		
		return equals;
	}

	public String toString()
	{
		String f = "";
		f += this.first;

		String m = "";
		m += this.middle;

		String l = "";
		l += this.last;

		String name = "";

		name += f + " " + m + " " + l;
		
		return name;
	}

	public boolean equals(Person P)
	{

		boolean equals = false;
		String firstPerson = this.toString();
		String secondPerson = P.toString();

		if(firstPerson.compareTo(secondPerson) == 0)
			equals = true;

		return equals;
	}

	public void makeCopy(Person p)
	{
		p.first = first;
		p.middle = middle;
		p.last = last;
	}	

	public Person getCopy()
	{
		Person temp = new Person();

		temp.first = this.first;
		temp.middle = this.middle;
		temp.last = this.last;
		
		return temp;
	}
}


	