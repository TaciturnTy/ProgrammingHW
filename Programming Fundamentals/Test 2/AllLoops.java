/*
Tyler Paulley
Oct. 23, 2013
AllLoops.java
Test 2

This is a program written to demonstrate the use of a for, while, and a do-while, loop
for the same problem.

The problem will to be to print the results of 2 * x for five loops when x starts as 1.
*/

public class AllLoops
{
	public static void main(String[] args)
	{
		int i, j, k;
		int x =1 , y = 1, z = 1;
//FOR LOOP	
		for(i = 5; i > 0 ; i--)
		{
			x = 2 * x;
			System.out.print(x + " ");
		}

//WHILE LOOP
		System.out.println();

		j = 5;

		while(j !=0)
		{
			y = 2 * y;
			System.out.print(y + " ");
			j--;
		}

//DO-WHILE LOOP
		System.out.println();

		k = 5;

		do
		{
			z = 2 * z;
			System.out.print(z + " ");
			k--;
		}
		while(k != 0);
	}
}

			


		