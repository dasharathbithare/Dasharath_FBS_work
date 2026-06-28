//Q3: Write a C program to convert temperature from celcius to fahrenheit using the formula: F = (C*9/5)+32

#include <stdio.h>
int main ()
{
	float c = 27.0;
	float f = (c*9/5)+32;
	printf ("The temperature from celcius to fahrenheit is %f", f);
	return 0;
}