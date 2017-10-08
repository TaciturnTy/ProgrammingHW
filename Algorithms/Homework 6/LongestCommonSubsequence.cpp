/*
Tyler Paulley
11/22/2016
Longest Common Subsequence
Algorithms C.S. 330
*/

#include<stdio.h>
#include<string.h>
#include<string>

int length1, length2, x[20][20];
char seq1[20], seq2[20], y[20][20];
 
void LongestCommonSubsequence()
{
    length1 = strlen(seq1);
    length2 = strlen(seq2);
    
    for(int i = 0; i <= length1; i++)
    {
    	x[i][0] = 0;
    }
    
    for(int i = 0; i <= length2; i++)
    {
		x[0][i] = 0;
	}         
	                
    for(int i = 1; i <= length1; i++)
        for(int j = 1; j <= length2; j++)
        {
            if(seq1[i - 1] == seq2[j - 1])
            {
                x[i][j] = x[i - 1][j - 1] + 1;
                y[i][j] = 'c';
            }
            else if(x[i - 1][j] >= x[i][j - 1])
            {
                x[i][j] = x[i - 1][j];
                y[i][j] = 'u';
            }
            else
            {
                x[i][j] = x[i][j - 1];
                y[i][j] = 'l';
            }
        }
}
  
void print(int len1, int len2)
{
    if(len1 == 0 || len2 == 0)
    {
        return;
    }
    
    if(y[len1][len2] == 'c')
    {
        print(len1 - 1, len2 - 1);
        printf("%c", seq1[len1 - 1]);
    }
	else if(y[len1][len2] == 'u')
	{
        print(len1 - 1, len2);
    }
    else
	{
        print(len1, len2 - 1);
    }
}

int main()
{
    printf("Please enter the first sequence: ");
    scanf("%s", seq1);
    
    printf("Please enter the second sequence: ");
    scanf("%s", seq2);
    
    printf("\nThe longest common subsequence found was: ");
    LongestCommonSubsequence();
    print(length1, length2);
    
    getchar();
    return 0;
}
