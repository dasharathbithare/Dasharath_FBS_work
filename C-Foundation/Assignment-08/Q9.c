//9. Reverse the given array.
#include<stdio.h>
void main()
{
	int arr[5],i;
	
	printf("Enter the Numbers:\n");
	
	for(i = 0; i<5; i++)
	
	scanf("%d",&arr[i]);
	
	printf("Reverse array:\n");
	
	for(i=4; i>=0; i--)
	printf("%d ", arr[i]);
}