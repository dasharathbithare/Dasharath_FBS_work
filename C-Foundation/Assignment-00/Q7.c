//Q7: Write a C program to convert given minutes into hours and remaining minutes.

#include <stdio.h>
int main ()
{
	int minutes = 125;
	int hours = minutes/60;
	int remainingMinutes = minutes%60;
	
	printf("Hours are %d and Remaining minutes are %d", hours, remainingMinutes);
	
	return 0;              
	
}