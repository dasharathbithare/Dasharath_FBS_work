//Check the given number is Perfect number or not.Input: n = 28 Output: Perfect
#include<stdio.h>
int main ()
{
	int n = 28;
	int i, sum = 0;
	for( i = 1; i<n; i++)
	{
		if(n%i==0)
		   sum = sum +i;	
	}
	if(sum == n)
	  printf("the number is perfect");
	else
	   printf("the number is not perfect");
	   
	   return 0;
}