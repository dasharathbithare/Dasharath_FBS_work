//Ask the user to enter marks . then show the result based on these rules:

#include <stdio.h>

void main ()
{
	int marks;
	printf("Enter the marks ");
	scanf("%d", &marks);
	
	if(marks>=75)
	{
		printf("Disctintion");
	}
	else if(marks>=65)
	{
		printf("First class");
	}
	else if(marks>=55)
	{
		printf("Second class");	
	}
	else if(marks>=40)
	{
		printf("Pass Class");
	}
	else
	printf("Fail");
	
	return 0;
	
	
}