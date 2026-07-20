//Accept the age and check if the person is: Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)
#include <stdio.h>
int main ()
{
	int age;
	printf("Enter the age: ");
	scanf("%d", &age);
	if(age<0)
	{
	printf("Invalid input");
    }
	else if(age<12 )
	{
		printf("Child");
	}
	else if(age<=19)
	{
		printf("Teenager");
	}
	else if(age<=59)
	{
		printf("Adult");
	}
	else
	{
		printf("Senior");
	}
	return 0;
}