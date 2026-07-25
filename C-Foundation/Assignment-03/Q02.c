//Print table for given number. Input: n = 5 Output: 5 10 15 20 25 30 35 40 45 50
#include<stdio.h>
int main()
{
	int n = 5;
	for(n = 5; n<=50; n=n+5)
	{
		printf("%d ", n);
	}
	return 0;
}