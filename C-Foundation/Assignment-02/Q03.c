//Write a program to find greatest of three numbers using nested if else.


#include<stdio.h>
int main()
{
	int num1, num2, num3;
	
	printf("Enter the first input = ");
	scanf("%d", &num1);
	
	printf("Enter the second input = ");
	scanf("%d", &num2);
	
	printf("Enter the third input = ");
	scanf("%d", &num3);
	
	printf("Greatest number is =  ");

	
	if(num1>num2)
	{
		if(num1>num3)
		{
			printf("%d", num1);
		}
		else 
		{
			printf("%d", num3);
		}
	}
	else if(num2>num3)
	{
		printf("%d", num2);
	}
	else
	{
		printf("%d", num3);
	}
	
	
	return 0;
}