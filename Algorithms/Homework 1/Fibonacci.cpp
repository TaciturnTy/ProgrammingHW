#include <iostream>
using namespace std;

int fib(n)
{
	if (n == 0)
		return 0;
	if (n == 1)
		return 1;
	return fib(n - 1) + fib(n - 2)
}

void main()
{
	int length;
	cout << "Please input the length of the fibonacci sequence: ";
	cin >> length;

	cout << fib(length) << endl;
}




