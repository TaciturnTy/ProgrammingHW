/*
Tyler Paulley
TestUtility.java
Oct. 31, 2013
Lab Assignment 5
*/

public class TestUtility
{
	public static void main(String[]args)
	{
		
//TESTING Utility.isEven
		System.out.println("It is " + Utility.isEven(37) + " that 37 is even.");
		System.out.println("It is " + Utility.isEven(124) + " that 124 is even.");
		System.out.println();


//TESTING Utility.isOdd
		System.out.println("It is " + Utility.isOdd(34) + " that 34 is odd.");
		System.out.println("It is " + Utility.isOdd(39) + " that 39 is odd.");
		System.out.println();


//TESTING Utility.isPrime
		System.out.println("It is " + Utility.isPrime(2) + " that 2 is prime.");
		System.out.println("It is " + Utility.isPrime(3) + " that 3 is prime.");
		System.out.println("It is " + Utility.isPrime(24) + " that 24 is prime.");
		System.out.println("It is " + Utility.isPrime(37) + " that 37 is prime.");
		System.out.println();


//TESTING Utility.factorial
		int n = 6;
		System.out.println("The factorial of 6 is: " + Utility.factorial(n));
		long num = 40;
		System.out.println("The factorial of 40 is: " + Utility.factorial(num));
		double number = 60; 
		System.out.println("The factorial of 60 is: " + Utility.factorial(number));
		System.out.println();


//TESTING Utility.max
		System.out.println("The maximum of -1, 0, and 5 is " + Utility.max(-1, 0, 5) + ".");
		System.out.println("The maximum of -1, 5, and 0 is " + Utility.max(-1, 5, 0) + ".");
		System.out.println("The maximum of 5, -1, and 0 is " + Utility.max(5, -1, 0) + ".");

		System.out.println("The maximum of 8, 5, -1 and 0 is " + Utility.max(8, 5, -1, 0) + ".");
		System.out.println("The maximum of 5, 8, -1 and 0 is " + Utility.max(5, 8, -1, 0) + ".");
		System.out.println("The maximum of 5, -1, 8 and 0 is " + Utility.max(5, -1, 8, 0) + ".");
		System.out.println("The maximum of 5, -1, 0 and 8 is " + Utility.max(5, -1, 0, 8) + ".");
		
		System.out.println("The maximum of 4, 8, 5, -1, and 0 is " + Utility.max(4, 8, 5, -1, 0) + ".");
		System.out.println("The maximum of 8, 4, 5, -1, and 0 is " + Utility.max(8, 4, 5, -1, 0) + ".");
		System.out.println("The maximum of 8, 5, 4, -1, and 0 is " + Utility.max(8, 5, 4, -1, 0) + ".");
		System.out.println("The maximum of 8, 5, -1, 4, and 0 is " + Utility.max(8, 5, -1, 4, 0) + ".");
		System.out.println("The maximum of 8, 5, -1, 0, and 4 is " + Utility.max(8, 5, -1, 0, 4) + ".");
		System.out.println();

//TESTING Utility.min
		System.out.println("The minimum of -1, 0, and 5 is " + Utility.min(-1, 0, 5) + ".");
		System.out.println("The minimum of -1, 5, and 0 is " + Utility.min(-1, 5, 0) + ".");
		System.out.println("The minimum of 5, -1, and 0 is " + Utility.min(5, -1, 0) + ".");

		System.out.println("The minimum of 8, 5, -1 and 0 is " + Utility.min(8, 5, -1, 0) + ".");
		System.out.println("The minimum of 5, 8, -1 and 0 is " + Utility.min(5, 8, -1, 0) + ".");
		System.out.println("The minimum of 5, -1, 8 and 0 is " + Utility.min(5, -1, 8, 0) + ".");
		System.out.println("The minimum of 5, -1, 0 and 8 is " + Utility.min(5, -1, 0, 8) + ".");
		
		System.out.println("The minimum of 4, 8, 5, -1, and 0 is " + Utility.min(4, 8, 5, -1, 0) + ".");
		System.out.println("The minimum of 8, 4, 5, -1, and 0 is " + Utility.min(8, 4, 5, -1, 0) + ".");
		System.out.println("The minimum of 8, 5, 4, -1, and 0 is " + Utility.min(8, 5, 4, -1, 0) + ".");
		System.out.println("The minimum of 8, 5, -1, 4, and 0 is " + Utility.min(8, 5, -1, 4, 0) + ".");
		System.out.println("The minimum of 8, 5, -1, 0, and 4 is " + Utility.min(8, 5, -1, 0, 4) + ".");
		System.out.println();


//TESTING Utility.sumOfAS
		System.out.println("The sum of the series 1 + 2 + 3...50 is = " + Utility.sumOfAS(1, 50, 1) + ".");
		System.out.println("The sum of the series 1 + 3 + 5...50 is = " + Utility.sumOfAS(1, 50, 2) + ".");
		System.out.println("The sum of the series 2 + 3 + 4...50 is = " + Utility.sumOfAS(2, 50, 1) + ".");
		System.out.println("The sum of the series 1 + 2 + 3...49 is = " + Utility.sumOfAS(1, 49, 1) + ".");
	}
}















		