/*
Tyler Paulley
Lab Assignment 2
Exercise 3
Sept. 25th, 2013
Page 175
*/

import java.io.*;
import java.util.Scanner;
public class Exercise_3
{
	static Scanner console = new Scanner (System.in);

		static final double Federal_Income_Tax_Rate= 0.15;
		static final double State_Tax_Rate= 0.035;
		static final double Social_Security_Tax_Rate= 0.0575;
		static final double Medicare_Medicaid_Tax_Rate= 0.0275;
		static final double Pension_Plan_Rate= 0.05;
		static final double Health_Insurance_Rate= 75.0;

	public static void main (String[] args)
				throws FileNotFoundException
	{
		String name;
		final double grossAmount;
	
		System.out.print("What is the employee's name?");
			name = console.nextLine();
		System.out.print("What is their gross amount?");
			grossAmount = console.nextDouble();

		double federalTax= Federal_Income_Tax_Rate * grossAmount;
		double stateTax= State_Tax_Rate * grossAmount;
		double socialSecurityTax= Social_Security_Tax_Rate * grossAmount;
		double medicareMedicaidTax= Medicare_Medicaid_Tax_Rate * grossAmount;
		double pensionPlanTax= Pension_Plan_Rate * grossAmount;
		double healthInsuranceTax= 75;
		double deductions= federalTax + stateTax + socialSecurityTax + medicareMedicaidTax
			    + pensionPlanTax + healthInsuranceTax;
		double netPay= grossAmount - deductions;

		PrintWriter outFile = new PrintWriter ("Exercise_3_Output.txt");
		
		outFile.println(name);
		outFile.printf("Gross Amount:          $%9.2f%n", grossAmount);
		outFile.printf("Federal Tax:           $%9.2f%n", federalTax);
		outFile.printf("State Tax:             $%9.2f%n", stateTax);
		outFile.printf("Social Security Tax:   $%9.2f%n", socialSecurityTax);
		outFile.printf("Medicare/Medicaid Tax: $%9.2f%n", medicareMedicaidTax);
		outFile.printf("Pension Plan:          $%9.2f%n", pensionPlanTax);
		outFile.printf("Health Insurance:      $%9.2f%n", healthInsuranceTax);
		outFile.printf("Net Pay:               $%9.2f%n", netPay);
		
		outFile.close();
	}

}

		







