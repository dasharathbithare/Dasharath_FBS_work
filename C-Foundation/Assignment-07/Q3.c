//3. Print perfect numbers in the given range 1 to n.
# include<stdio.h>
void Perfect(int *n)
{
	int  i, j, sum;
		
	for(i = 1; i <= *n; i++)
	{
		sum = 0;
		
		for(j = 1; j < i; j++)
		{
			if(i % j == 0)
			{
				sum = sum + j;
			}
		}
		
		if(sum == i)
		{
		  printf("%d ", i);	
		}
	}
}
void main()
{
	int n;
	int *ptr;
	ptr = &n;
	
	printf("Enter the Number:");
	scanf("%d",&n);
	
	Perfect(ptr);
	
}