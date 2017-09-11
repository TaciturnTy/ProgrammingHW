/*
Tyler Paulley
Lab Assignment #9
Nov. 14th, 2013
Ch3_PrExercise1.java
Chap. 3, Page 172
*/

import javax.swing.*;
public class Ch3_PrExercise1
{
	public static void main(String[] args)
	{
		String strLength;
		String strWidth;
		String strRadius;
		String strName;
		String strAge;
		String strBegBal;
		String strInt;
		String strLetter;
		double length;
		double width;
		double radius;
		double begBal;
		double monthlyInt;
		double intRate;
		int age;
		char letter;
		String output = "";

			//READING FOR RECTANGLE

		strLength = JOptionPane.showInputDialog("Please enter the rectangle's length: ");
			length = Double.parseDouble(strLength);
		strWidth = JOptionPane.showInputDialog("Please enter the rectangle's width: "); 
			width = Double.parseDouble(strWidth);

		double areaRec = length * width;
		double parameterRec = length * 2 + width * 2;


			//READING FOR CIRLCE

		strRadius = JOptionPane.showInputDialog("Please enter the circle's radius: ");
			radius = Double.parseDouble(strRadius);

		double areaCir = Math.PI * Math.pow(radius, 2);
		double circumCir = 2 * Math.PI * radius;


			//READING FOR NAME AND AGE

		strName = JOptionPane.showInputDialog("Please enter the full name: ");
		strAge = JOptionPane.showInputDialog("Please enter the age: ");
			age = Integer.parseInt(strAge);


			//READING FOR BALANCE AND INTEREST

		strBegBal = JOptionPane.showInputDialog("Please enter the starting balance: ");
			begBal = Double.parseDouble(strBegBal);

		strInt = JOptionPane.showInputDialog("Interest is entered as a decimal, e.g. 5.0 for 5% interest. Please enter the yearly interest rate: ");
			intRate = Double.parseDouble(strInt);
		
		double yearlyInt;
		double afterYearlyInt;
		double difference;
		double afterMonthInt;
	
		yearlyInt = intRate / 100 + 1;
		afterYearlyInt = begBal * yearlyInt;
		difference = (afterYearlyInt - begBal) / 12;
		afterMonthInt = begBal + difference;


			//READING FOR CHAR LETTER

		strLetter = JOptionPane.showInputDialog("Please enter the letter: ");
			letter = strLetter.charAt(0);
		char letterNext = letter;
		letterNext++;
		

			//FORMATTING LINES 1 AND 2 OF OUTPUT

		output += String.format("Rectangle:%n");
		output += String.format("Length = %.2f, width = %.2f, area = %.2f, parameter = %.2f%n%n"
							, length, width, areaRec, parameterRec);
		
			//FORMATTING LINES 3 AND 4 OF OUTPUT

		output += String.format("Circle:%n");
		output += String.format("Radius = %.2f, area = %.2f, circumference = %.2f%n%n"
							, radius, areaCir, circumCir);

			//FORMATTING LINES 5, 6 AND 7 OF OUTPUT

		output += String.format("Name: %s, age: %d %n", strName, age);
		output += String.format("Beginning balance = $%.2f, interest rate = %.2f%n", begBal, intRate);
		


		output += String.format("Balance at the end of the month = $%.2f%n%n", afterMonthInt);


			//FORMATTING LINE 8 OF OUTPUT

		output += String.format("The character that comes after %c in the ASCII set is %c", letter, letterNext);

		JOptionPane.showMessageDialog(null, output, "File Data", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}






		