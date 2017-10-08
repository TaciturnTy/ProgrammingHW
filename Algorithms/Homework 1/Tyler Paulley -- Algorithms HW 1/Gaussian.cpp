/* Tyler Paulley */
/* 9/11/2016     */
/* Gaussian Elim */
/* C.S. 360      */


#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	int num; 						//Num of Equations
	int i;							//Num of Rows
	int j;							//Num of Columns
	int k;		
	cout.setf(ios::fixed); 	  		//Fixed number of decimal places
	cout.precision(2);        		//Two decimal places
	cout << "\nPlease enter the number of equations: ";
	cin >> num;                		
	float m[num][num + 1], x[num];       
	
	//Build the matrix
	cout << "\nPlease enter the matrix elements:\n";
	for (i = 0; i < num; i++)
	{
		for (j = 0; j <= num; j++)
		{
			cin >> m[i][j];    	
		}
	}
			
	//Row Swap
	for (i = 0; i < num; i++)      
	{   
		for (k = i + 1; k < num; k++)
		{
			if (m[i][i] < m[k][i])
			{
				for (j = 0; j <= num; j++)
				{
					double temp = m[i][j];
					m[i][j] = m[k][j];
					m[k][j] = temp;
				}
			}
		}
	}
	
	//Print after Row Swap
	cout << "\nHere is the Matrix after row swapping:\n";
	for (i = 0; i < num; i++)			
	{
		for (j = 0; j <= num; j++)
		{
			cout << m[i][j] << setw(10);
		}
		cout << "\n";
	}
	
	//Gaussian Elimination
	for (i = 0; i < num - 1; i++)
	{  
		for (k = i + 1; k < num; k++)
		{
			double t = m[k][i] / m[i][i];
			for (j = 0; j <= num; j++)
			{
				m[k][j] = m[k][j] - t * m[i][j];
			}
		}
	}

	//Print after Gaussian
	cout << "\nHere is the Matrix after Gaussian Elimination:\n";
	for (i = 0; i < num; i++)            
	{
		for (j = 0; j <= num; j++)
		{
			cout << m[i][j] << setw(10);
		}
		cout << "\n";
	}
	
	//Solve for Variables
	for (i = num - 1; i >= 0; i--)                
	{                       
		x[i] = m[i][num];                
		for (j = 0; j < num; j++)
		{
			if (j != i)
			{
				x[i] = x[i] - m[i][j] * x[j];
			}
		}
		x[i] = x[i] / m[i][i];           
	}
	
	//Print Variable Values
	cout << "\nThe variable values are:\n";
	for (i = 0; i < num; i++)
	{
		cout << x[i] << endl;
	}
	return 0;
}
