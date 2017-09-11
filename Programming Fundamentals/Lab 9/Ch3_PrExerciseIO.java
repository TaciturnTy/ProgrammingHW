/*
Tyler Paulley
Lab Assignment #9
Nov. 14th, 2013
Ch3_PrExerciseIO.java
Chap. 3, Page 172
*/

import javax.swing.*;
import java.io.*;
import java.util.*;
public class Ch3_PrExerciseIO
{
	public static void main(String[] args)
					throws FileNotFoundException
	{
	
		Scanner inFile = new Scanner(new FileReader("inData.txt"));

		String output = "";

			//READING FROM LINE ONE, RECTANGLE

		double length = inFile.nextDouble();
		double width = inFile.nextDouble(); 
		double areaRec = length * width;
		double parameterRec = length * 2 + width * 2;


			//READING FROM LINE TWO, CIRLCE

		double radius = inFile.nextDouble();
		double areaCir = Math.PI * Math.pow(radius, 2);
		double circumCir = 2 * Math.PI * radius;


			//READING FROM LINE THREE, NAME AND AGE

		String nameF = inFile.next();
		String nameL = inFile.next();
		int age = inFile.nextInt();


			//READING FROM LINE FOUR, BALANCE

		double begBal = inFile.nextDouble();
		double intRate = inFile.nextDouble();
		double afterYearInt;
		double afterMonthInt;
		double difference;


			//READING FROM LINE FIVE, CHAR

		char letter = inFile.next().charAt(0);
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

		output += String.format("Name: %s %s, age: %d %n", nameF, nameL, age);
		output += String.format("Beginning balance = $%.2f, interest rate = %.2f%n", begBal, intRate);
		
		intRate =  intRate / 100 + 1;
		afterYearInt = begBal * intRate;
		difference = (afterYearInt - begBal) / 12;
		afterMonthInt = begBal + difference;

		output += String.format("Balance at the end of the month = $%.2f%n%n", afterMonthInt);


			//FORMATTING LINE 8 OF OUTPUT

		output += String.format("The character that comes after %c in the ASCII set is %c", letter, letterNext);

		JOptionPane.showMessageDialog(null, output, "File Data", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		inFile.close();
	}
}


















		