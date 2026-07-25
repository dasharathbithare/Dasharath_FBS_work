//Check the given number is Armstrong number or not. Input: n = 153 Output: Armstrong
#include<stdio.h>
int main ()
{
	int n = 153;
	int digit, sum = 0;
    int org = n;
	while(n!=0)
	{
		digit = n%10;
		sum = sum + (digit * digit * digit);
		n = n / 10;
		
	}
	if(sum == org)
	printf("number is armstrong");
	else 
	printf("number is not armstrong");
	return 0;
}