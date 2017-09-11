
//THIS PROGRAM HAS BEEN CHECKED AND WORKS!
//	3/23/14

import static java.lang.Math.*;
public class ConvertToTen
{
	public static void main(String[] args)
	{
		double number1 = 5435;
		int base1 = 8;

		double number2 = 0;
		int base2 = 3;

		double number3 = 100;
		int base3 = 0;

		System.out.print(convertToTen(number1, base1));
		System.out.println();
		System.out.print(convertToTen(number2, base2));
		System.out.println();
		System.out.print(convertToTen(number3, base3));
		System.out.println();
	}

	public static double convertToTen(double number, int base)
	{
		double numInTen = 0;
		double numMod10;
		int power = 0;

		if(number == 0)
			return 0;

		if(base == 0)
			return 1;

		else
		{
			while(number > 0)
			{
				numMod10 = number % 10;
				number = (number - numMod10) / 10;
				numInTen += numMod10 * pow(base, power);
				power++;
			}
		return numInTen;
		}
	}
}