//Accept the price from user. Ask the user if he is a student (user may say y or n). If he is a student and he has purchased more
//than 500 than discount is 20% otherwise discount is 10%.But if he is not a student then if he has purchased more than 600
//discount is 15% otherwise there is not discount.
#include <stdio.h>
int main()
{
	int price, discount, finalprice;
	printf("Enter the price ");
	scanf("%d", &price);
	
	char isstudent;

	printf("are you student?(n/y) : ");
	
	
		scanf(" %c", &isstudent);
	if(isstudent=='y' )
	{
		if(price>500)
		{
			discount = price*20/100;
		}
		else
		{
			discount = price*10/100;
		}
		finalprice = price - discount;
    	printf("the final price is %d" , finalprice);
	}
	else if(isstudent=='n')
	{
		if(price>600)
		{
			discount = price*15/100;
		}
		else 
		{
			discount = 0;
		}
		finalprice = price - discount;
	    printf("the final price is %d" , finalprice);
	}
	else
	printf("invalid input");

	return 0;
}
