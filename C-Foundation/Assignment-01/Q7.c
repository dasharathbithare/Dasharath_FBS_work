//calculate total salary based on basic salary. if basic<= 5000, then DA =10%, TA =20%, HRA =25%; otherwise DA=15%, TA=25%, HRA=30%.

#include <stdio.h>
int main()
{
	int basic = 5000;
	float da, ta, hra, total;
	
	if(basic<=5000)
	{
		da = basic*10.0/100;
		ta = basic*20.0/100;
		hra = basic*25.0/100;
	}
	else
	{
		da = basic*15.0/100;
		ta = basic*25.0/100;
		hra = basic*30.0/100;
	}
	
	total = basic +da+ta+hra;
	printf(" total salary = %.2f", total);
}