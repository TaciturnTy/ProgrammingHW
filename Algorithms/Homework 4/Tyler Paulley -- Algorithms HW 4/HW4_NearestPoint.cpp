#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <limits.h>
#include <iostream>
using namespace std;
int main() 
{
	int numOfPoints = 0;
	cout << "How many points: ";
	cin >> numOfPoints;
	int xCoordinates[numOfPoints];
	int yCoordinates[numOfPoints];
	int result = 0;
	//Compare the current value to the maximum possible int so that it will always be smaller
	int smallestValue = INT_MAX;
	int x1 = 0;
	int x2 = 0;
	int y1 = 0;
	int y2 = 0;
	int j = 1;
	
	for(int i = 0; i < numOfPoints; i++) 
	{
		printf("x[%d]: ", i);
		scanf("%d", &xCoordinates[i]);

		printf("y[%d]: ", i);
		scanf("%d", &yCoordinates[i]);
	}
	
	for(int i = 0; i < numOfPoints - 1; i++) 
	{
		do {
			//printf("i: %d, j: %d\n", i, j);
			
			//Not using sqrt to keep result as an int
			result = (pow(xCoordinates[i] - xCoordinates[j], 2)) + (pow(yCoordinates[i] - yCoordinates[j], 2));
			
			if(result < smallestValue) {
				smallestValue = result;
				x1 = xCoordinates[i];
				y1 = yCoordinates[i];
				x2 = xCoordinates[j];
				y2 = yCoordinates[j];
			}
			j++;
		}
		while(j < numOfPoints);
	}

	printf("The points (%d, %d) and (%d, %d) have the minimum distance of %f units.\n", x1, y1, x2, y2, sqrt(smallestValue));
	return 0;
}
