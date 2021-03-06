/* Tyler Paulley */
/* 9/17/2016     */
/* Homework 2    */
/* C.S. 360      */

#include "stdafx.h"
#include <iostream>
#include <array>
using namespace std;

//Computing a to power n (a > 0, n is a nonnegative integer) 
float nPower(float a, int n)
{
	float product = a;
	for (int i = 0; i < n - 1; i++)
	{
		product *= a;
	}
	return product;
}

//Computing n! 
int factorial(int n)
{
	int product = n;
	for (int i = 0; i < n - 1; i++)
	{
		product *= ((n - 1) - i);
	}
	return product;
}

//Multiplying two matrices 
void matrixMultiply()
{
	int a[6][6], b[6][6], c[6][6], aRow, aCol, bRow, bCol, i, j, k;
	cout << "\nPlease enter the rows and columns of the first matrix: ";
	cin >> aRow >> aCol;
	cout << "\nPlease enter the rows and columns of the second matrix: ";
	cin >> bRow >> bCol;

	if (aCol == bRow)
	{
		cout << "\nEnter the first matrix: \n";
		for (i = 0; i < aRow; ++i)
			for (j = 0; j < aCol; ++j)
				cin >> a[i][j];

		cout << "\nEnter the second matrix: \n";
		for (i = 0; i < bRow; ++i)
			for (j = 0; j < bCol; ++j)
				cin >> b[i][j];

		cout << "\nAfter Matrix Multiplication: \n";
		for (i = 0; i < aRow; ++i)
		{
			for (j = 0; j < bCol; ++j)
			{
				c[i][j] = 0;
				for (k = 0; k < aCol; ++k)
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				cout << c[i][j] << " ";
			}
			cout << "\n";
		}
	}
	else
		cout << "\nIncorrect Sizes. Multiplication Cannot be Done.";
}

//Searching for a key of a given value in a list
void search(int key)
{
	bool found = false;
	int list[20] = { 1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10 };

	int length = sizeof(list) / sizeof(int);

	for (int i = 0; i < length; i++)
	{
		if (key == list[i])
		{
			cout << "\n" << key << " found at array location " << i << ".";
			found = true;
		}
	}
	if (!found)
	{
		cout << "\n" << key << " not found in array.\n\n";
	}
}

int main()
{
	float base;
	int power;
	float result;

	cout << "\nPlease input the base: ";
	cin >> base;
	cout << "\nPlease input the power: ";
	cin >> power;
	result = nPower(base, power);
	cout << "\nThe result is: " << result << "\n\n";

	int num;
	cout << "\nPlease input the number to factorial: ";
	cin >> num;
	num = factorial(num);
	cout << "\nThe result is: " << num << "\n\n";

	matrixMultiply();

	cout << "\n";
	search(4);
	search(11);

	return 0;
}



