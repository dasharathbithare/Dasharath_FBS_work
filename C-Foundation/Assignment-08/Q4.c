//4. Find odd and even among the numbers.
# include<stdio.h>
void main()
{
	int arr[5], i;
	
	printf("Enter the Numbers:");
	
	for(i = 0; i < 5; i++)
	
	scanf("%d", &arr[i]);
	
	printf("Enter number to find: ");
   
    
	for(i = 0; i < 5; i++)
	{
		if(arr[i] % 2 == 0)
		{
			printf("%d is even\n", arr[i]);
		}
		else
		printf("%d is odd\n", arr[i]);
	}
	

}