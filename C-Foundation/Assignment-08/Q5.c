//5. Print alternate elements in array.
# include<stdio.h>
void main()
{
	int arr[5], i;
	
	printf("Enter the numbers:");
	
	for( i=0; i <5; i++)
	
	scanf("%d", &arr[i]);
	
	printf("Alternate Elements:\n");
	
	for( i = 0; i < 5 ; i= i+= 2)
	printf("%d ", arr[i]);
	
}
	