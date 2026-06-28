//Q10: Write a C program to input marks of five subjects, find the total marks, and calculate the percentage.

#include <stdio.h>
int main ()
{
	int a = 69, b = 83, c = 91, d = 56, e = 36;
	int totalMarks = a+b+c+d+e;
	float percentage = (totalMarks/500.0)*100;
	
	printf("Total marks are %d and percentage is %f", totalMarks, percentage);
	return 0;
}