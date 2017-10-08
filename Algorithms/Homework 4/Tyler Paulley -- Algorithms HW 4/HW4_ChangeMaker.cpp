/* Tyler Paulley */
/* 9/26/2016     */
/* Homework 3    */
/* C.S. 360      */

#include <iostream>
#include <stdlib.h> 
using namespace std;

//Using * makes it a pointer. Malloc is used to allocate memory on the heap. This data 
//is stored elsewhere so that it isn't deleted when the function ends. It can be used for returning arrays.
int* makeChange(int denominations[], int change)
{
	//Denominations is 8 bytes instead of 16 for some reason bc cpp is dumb
	//int length = sizeof(denominations) / sizeof(int);
	//use (int*) bc malloc returns a void pointer by default
	int* coins = (int*) malloc(sizeof(int) * 4);
	
	for(int i = 0; i < 4; i++) 
	{
		coins[i] = change / denominations[i];
		change = change % denominations[i];
	}
 	return coins;
}
 
int main()
{
	//Need to use malloc since denomination's data will be lost when sent to a different function
	//int length = sizeof(denominations) / sizeof(int);
	int denominations[] = {25, 10, 5, 1};

	int change;
	
	cout << "Please enter the amount of change in cents: \n";
	cin >> change;

	//Null is 0 for ints and chars (int num = 0), for floats 0.0, for arrays use NULL
	int* coins = NULL;
	//cout << sizeof(denominations) << " " << sizeof(int);

	coins = makeChange(denominations, change);		
	
	cout << "\nHere is your change...";
	for(int i = 0; i < 4; i++)
	{
		cout << "\nCoins worth " << denominations[i] << ": " << coins[i];	
	}
    cout << "\n";
	system("pause");
	//Give back the memory that was used for the array
	free(coins);
	return 0;
}


