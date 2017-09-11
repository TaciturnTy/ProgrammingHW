/*
Tyler Paulley
Lab Assignment 2
Exercise 2
Sept. 24, 2013
Page 110
*/

import java.util.Scanner;
import java.lang.Math.*;
public class Exercise_2
{
	static Scanner console = new Scanner (System.in);
	public static void main (String[] args)
	{
		double PayRate;
		double HoursPerWeek;

		System.out.print("Please enter your pay rate per hour: ");
			PayRate= console.nextDouble();
		System.out.print("Please enter the hours worked per week: ");
			HoursPerWeek= console.nextDouble();

		double TotalHours= HoursPerWeek * 5;
		double TotalIncome= PayRate * TotalHours;
		double TotalTax= 0.86;
		double IncomeAfterTax=TotalTax * TotalIncome;
		double NewClothes= 0.10;
		double MoneySpentOnClothes= NewClothes * IncomeAfterTax;
		double SchoolSupplies= 0.01;
		double MoneyOnSchoolSupplies= SchoolSupplies * IncomeAfterTax;
		double SavingsBonds= 0.25;
		double MoneyAfterTaxClothesAndSupplies= IncomeAfterTax * 0.89;
		double MoneyOnBonds= SavingsBonds * MoneyAfterTaxClothesAndSupplies;
		double AdditionalBonds= MoneyOnBonds * 0.50;
		
		
//Part A
		System.out.println("\nYou worked a total of " + TotalHours + " hours and your " +	
				   "total income is " + TotalIncome);
		System.out.print("\nYour income after taxes is: " + IncomeAfterTax);
//Part B
		System.out.println();
		System.out.print("\nThe money you spent on clothes and other accessories was: " 
				+ MoneySpentOnClothes);
//Part C
		System.out.println();
		System.out.print("\nThe money you spent on school supplies was: "
				+ MoneyOnSchoolSupplies);
//Part D
		System.out.println();
		System.out.print("\nThe money you spent on savings bonds was: "
				+ MoneyOnBonds);
//Part E
		System.out.println();
		System.out.print("\nThe money your parents spent on bonds was: "
				+ AdditionalBonds);

	}
}