/*
Tyler Paulley
Lab Assignment 7
Day.java
Chapter 8 pg.547
Nov. 8th, 2013
*/

public class Day extends Object
{
	private int dayNum;
	private String day;
	
	public Day()
	{
		dayNum = 0;
		day = "Sun";
	}
	
	public Day(String dayName)
	{
		if(dayName.compareTo("Sun") == 0)
			{dayNum = 0; day = "Sun";}

		else if(dayName.compareTo("Mon") == 0)
			      {dayNum = 1; day = "Mon";}

		     else if(dayName.compareTo("Tue") == 0)
			           {dayNum = 2; day = "Tue";}

			  else if(dayName.compareTo("Wed") == 0)
			                {dayNum = 3; day = "Wed";}

			       else if(dayName.compareTo("Thu") == 0)
			                     {dayNum = 4; day = "Thu";}

				    else if(dayName.compareTo("Fri") == 0)
			                	  {dayNum = 5; day = "Fri";}

				    	 else if(dayName.compareTo("Sat") == 0)
			                	       {dayNum = 6; day = "Sat";}
	}

	public void setDay(String d)
	{			
		if(d.compareTo("Sun") == 0)
			{dayNum = 0; day = "Sun";}

		else if(d.compareTo("Mon") == 0)
			      {dayNum = 1; day = "Mon";}

		     else if(d.compareTo("Tue") == 0)
			           {dayNum = 2; day = "Tue";}

			  else if(d.compareTo("Wed") == 0)
			                {dayNum = 3; day = "Wed";}

			       else if(d.compareTo("Thu") == 0)
			                     {dayNum = 4; day = "Thur";}

				    else if(d.compareTo("Fri") == 0)
			                	  {dayNum = 5; day = "Fri";}

				    	 else if(d.compareTo("Sat") == 0)
			                	       {dayNum = 6; day = "Sat";}
	}
	
	public String getDay()
	{
		if(dayNum == 0)
		{day = "Sun";}

		else if(dayNum == 1)
		     {day = "Mon";}
		
		     else if(dayNum == 2)
		          {day = "Tue";}
		     	  
     			  else if(dayNum == 3)
		               {day = "Wed";}
		
		     	       else if(dayNum == 4)
		          	    {day = "Thu";}
		          			 
				    else if(dayNum == 5)
		                	 {day = "Fri";}
		
		     	       		 else if(dayNum == 6)
		          	    	      {day = "Sat";}
		return day;
	}

	public String nextDay()
	{
		if(day.compareTo("Sun") == 0)
			{dayNum = 1; day = "Mon";}

		else if(day.compareTo("Mon") == 0)
			      {dayNum = 2; day = "Tue";}

		     else if(day.compareTo("Tue") == 0)
			           {dayNum = 3; day = "Wed";}

			  else if(day.compareTo("Wed") == 0)
			                {dayNum = 4; day = "Thu";}

			       else if(day.compareTo("Thu") == 0)
			                     {dayNum = 5; day = "Fri";}

				    else if(day.compareTo("Fri") == 0)
			                	  {dayNum = 6; day = "Sat";}

				    	 else if(day.compareTo("Sat") == 0)
			                	       {dayNum = 0; day = "Sun";}
		return day;
	}

	public String prevDay()
	{
		if(day.compareTo("Sun") == 0)
			{dayNum = 6; day = "Sat";}

		else if(day.compareTo("Mon") == 0)
			      {dayNum = 0; day = "Sun";}

		     else if(day.compareTo("Tue") == 0)
			           {dayNum = 1; day = "Mon";}

			  else if(day.compareTo("Wed") == 0)
			                {dayNum = 2; day = "Tue";}

			       else if(day.compareTo("Thu") == 0)
			                     {dayNum = 3; day = "Wed";}

				    else if(day.compareTo("Fri") == 0)
			                	  {dayNum = 4; day = "Thu";}

				    	 else if(day.compareTo("Sat") == 0)
			                	       {dayNum = 5; day = "Fri";}
		return day;
	}

	public String calcDay(int addOrSub)
	{
		dayNum += addOrSub;
		dayNum %= 7;

		if(dayNum == 0)
		{day = "Sun";}

		else if(dayNum == 1)
		     {day = "Mon";}
		
		     else if(dayNum == 2)
		          {day = "Tue";}
		     	  
     			  else if(dayNum == 3)
		               {day = "Wed";}
		
		     	       else if(dayNum == 4)
		          	    {day = "Thu";}
		          			 
				    else if(dayNum == 5)
		                	 {day = "Fri";}
		
		     	       		 else if(dayNum == 6)
		          	    	      {day = "Sat";}
		return day;
	}

	public void print()
	{
		String output = "";
		output += "\nThe current day is: " + day + ".";
		System.out.println(output);
	}
}
