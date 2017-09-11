
//THIS PROGRAM HAS BEEN CHECKED AND WORKS!
//   3/23/14

public class reverseNumber
{
	public static void main(String[] args)
	{
		int number1 = 1234;
		int number2 = 0;
		int number3 = 8;

		System.out.print(reverse(number1));
		System.out.println();
		System.out.print(reverse(number2));
		System.out.println();
		System.out.print(reverse(number3));
		System.out.println();

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
}