//Write a program to check given 3 digit number is palindrome or not.

#include <stdio.h>
int main ()
{
	int num = 121;
	int firstnum = num/100;
	int lastnum = num%10;
	
	if(firstnum==lastnum)
	{
		printf("The number is palindrome");
	}
	
	else
	printf("The number is not palindrome");
	
	return 0;
}