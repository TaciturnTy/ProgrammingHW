
//THIS PROGRAM HAS BEEN TESTED AND WORKS!
//    3/23/14

import static java.lang.Math.*;
public class toNewBase
{
	public static void main(String[] args)
	{
		int number1 = 5435;
		int base1 = 8;
		int newBase1 = 4;

		int number2 = 0;
		int base2 = 3;
		int newBase2 = 5;

		int number3 = 1001;
		int base3 = 2;
		int newBase3 = 10;

		System.out.print(baseChange(number1, base1, newBase1));
		System.out.println();
		System.out.print(baseChange(number2, base2, newBase2));
		System.out.println();
		System.out.print(baseChange(number3, base3, newBase3));
		System.out.println();
	}

	public static int baseChange(int number, int base, int newBase)
	{
		int numTen = convertToTen(number, base);
		int tempFact;
		String output = "";

		if(newBase == 10)
			return numTen;

		if(newBase == 0 || numTen == 0)
			return 0;

		while(numTen > 0)
		{
			output += numTen % newBase;
			numTen = numTen / newBase;
		}
		int newOutput = Integer.parseInt(output);
		newOutput = reverse(newOutput);
		return newOutput;
	}

	public static int reverse(int Number)
	{
		int numberReversed = 0;
		int tempNumber = Number;
		int digitHolder;

			if(Number < 10)
			return Number;

		while(tempNumber != 0)
		{
			digitHolder = tempNumber % 10;
			numberReversed = numberReversed * 10 + digitHolder;
			tempNumber /= 10;
		}
		return numberReversed;
	}

	public static int convertToTen(int number, int base)
	{
		int numInTen = 0;
		int numMod10;
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
