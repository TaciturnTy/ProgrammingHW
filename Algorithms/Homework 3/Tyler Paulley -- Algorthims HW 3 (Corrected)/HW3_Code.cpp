/* Tyler Paulley */
/* 9/26/2016     */
/* Homework 3    */
/* C.S. 360      */

#include <iostream>
#include <process.h>
using namespace std;

int horner(int polynomial[], int length, int x)
{
    int value = polynomial[0]; 
 
    for(int i = 0; i < length - 1; i++)
    	value = value * x + polynomial[i + 1];
 
    return value;
}
 
int main()
{
	int length;	
	cout << "Please enter the number of coefficients: \n";
	cin >> length;
	
	int polynomial[length]; 
	cout << "\nPlease enter the values of the polynomial coefficients: \n";			
	
	for (int i = 0; i < length; i++)
	{
	    cin >> polynomial[i];
	}
	
	int x; 
	cout << "\nPlease enter the value of x: \n";	
	cin >> x;
		 	   
    //Divide number of bytes to determine length of array
    //int length = sizeof(polynomial) / sizeof(polynomial[0]); 
    cout << "\nThe value of the polynomial is " << horner(polynomial, length, x) << "\n\n";
    
	system("pause");
	return 0;
}


