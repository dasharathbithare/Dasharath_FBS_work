//Print a solid square pattern Input: n = 4 Output:

#include<stdio.h>
int main ()
{
	int n;
	printf("enter the size of square: ");
	scanf("%d", &n);
	
	for(int i=0; i<n; i++ )
	{
		for(int j=0; j<n; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}