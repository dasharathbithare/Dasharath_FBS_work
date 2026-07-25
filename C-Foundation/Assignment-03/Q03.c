//Sum of numbers in given range. Find sum of numbers from start to end. Input: start = 1, end = 5
#include<stdio.h>
int main()
{
	int start = 1, end = 5;
	int sum = 0;
	for( int i = start; i <= end; i++)
	{
		sum =  sum + i;

	}
	printf(" sum = %d", sum);
	
	return 0;
}