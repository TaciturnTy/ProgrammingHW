/*  Tyler Paulley  */
/*    9/6/2016     */

#include "stdafx.h"
#include <iostream>
using namespace std;

int fib(int n)
{
	if (n == 0)
		return 0;
	if (n == 1)
		return 1;
	return fib(n - 1) + fib(n - 2);
}

int main()
{
	int length;
	cout << "Please input the length of the fibonacci sequence: ";
	cin >> length;

	for(int i = 0; i < length; i++)
	cout << fib(i) << endl;

    return 0;
}