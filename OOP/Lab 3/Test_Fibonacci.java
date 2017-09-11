/*
Tyler Paulley
The Object-Oriented Paradigm
Lab Assignment 3
February 2nd, 2013
Question 3: Test_Fibonacci.java
*/

public class Test_Fibonacci
{
	public static void main (String[] args)
	{
		Fibonacci fib1 = new Fibonacci();
		Fibonacci fib2 = new Fibonacci(6, 1, 2);
		Fibonacci fib3 = new Fibonacci(7, .57, 2.55);

		fib1.setFib(3, 1, 2);

		System.out.println("The number of iterations of fib1 is: " + fib1.getI() + ".");
		System.out.println("The first value of fib1 is: " + fib1.getF() + ".");
		System.out.println("The second value of fib1 is: " + fib1.getS() + ".");

		int i = fib1.getI();
		double f = fib1.getF();
		double s = fib1.getS();

		System.out.printf("The value of fib1's 4th term is  = %.2f%n", fib1.findValue(i, f, s));

		System.out.printf("The value of fib2's 6th term is = %.2f%n", fib2.findValue(fib2.getI(), fib2.getF(), fib2.getS()));

		System.out.printf("The value of fib3's 7th term is = %.2f%n", fib3.findValue(fib3.getI(), fib3.getF(), fib3.getS()));

		fib1.fibSequence(fib1.getI(), fib1.getF(), fib1.getS());
	}
}


