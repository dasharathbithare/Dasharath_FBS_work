//Accept two numbers from user and an operator (+,-,*,/,%) based on that perform the desired operations.

#include <stdio.h>

int main ()
{
	int num1 ,num2, result;
	char op;
	
	printf("enter the first numbers ");
	scanf("%d", &num1);
	
	printf("enter the second numbers ");
	scanf("%d", &num2);
	
	printf("enter the operator(+,-,*,/,%) ");
	
	fflush(stdin);
	scanf("%c", &op);
	
	printf("Result = %d", result);
	
	if(op=='+')
	{
		result = num1 + num2;
		printf("%d", result);
	}
	else if(op=='-')
	{
		result = num1 - num2;
		printf("%d", result);
	}
	else if(op=='*')
	{
		result = num1 * num2;
		printf("%d", result);
	}
	else if(op=='/')
	{
		if(num2!=0)
		{
			result = num1 / num2;
			printf("%d", result);
		}
		else printf("the number is not divisible by 0");
	}
	else if(op=='%')
	{
		result = num1 % num2;
		printf("%d", result);
	}
	else 
	printf("invalid input");
	
	return 0;
}