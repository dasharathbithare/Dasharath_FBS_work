//Q4: Write a C program to swap two numbers using a temporary third variable.

#include <stdio.h>
int main ()
{
	int a = 15, b = 20;
	
	int temp = a;
	a = b;
	b = temp;
	
	printf("After swapping value of a = %d\n",a);
	printf("After swapping Value of b = %d\n", b);
	
	return 0;
	
}