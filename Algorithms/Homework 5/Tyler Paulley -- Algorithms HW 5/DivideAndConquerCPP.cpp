/*
Tyler Paulley
11/14/2016
Divide and Conquer for Finding Min and Max
Homework #5
*/

#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>

void SearchMinMax(int a[], int *minimum, int *maximum, int left, int right)
{
	int min, max, mid, min1, max1;

	if (left == right) 
	{
		min = a[left];
		max = a[left];
	}

	else if ((right - left) == 1)
	{
		if (a[left] <= a[right])
		{
			min = a[left];
			max = a[right];
		}
		else
		{
			min = a[right];
			max = a[left];
		}
	}

	else 
	{
		mid = (left + right) / 2;
		SearchMinMax(a, &min, &max, left, mid);
		SearchMinMax(a, &min1, &max1, mid + 1, right);

		if (max1 > max)
			max = max1;
		if (min1 < min)
			min = min1;

	}
	*minimum = min;
	*maximum = max;

	printf("Minimum: %d\tMaximum: %d\n", min, max);
}

int main()
{
	int array [10] = {41, 3, 8, 10, 1, 3, 54, 23, 41, 18 };
	
	printf("The Starting Array is...\n");
	for (int i = 0; i < 10; i++)
	{
		printf("%d ", array[i]);
	}
	printf("\n\n");

	SearchMinMax(array, &array[0], &array[0], 0, 9);
	printf("These last values are the min and max.\n\n");

	system("pause");
    return 0;
}

