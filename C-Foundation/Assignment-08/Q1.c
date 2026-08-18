//1. Find minimum and maximum number in array. 
#include <stdio.h>

void main() {
    int arr[5];
    int min, max;
    int i;

    printf("Enter 5 numbers:\n");
    for (i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }

    
    min = max = arr[0];

   
    for (i = 1; i < 5; i++) 
	{
        if (arr[i] < min) 
		{
            min = arr[i];
        }
        if (arr[i] > max) 
		{
            max = arr[i];
        }
    }

    printf("The maximum number is: %d\n", min);
    printf("The minimum number is: %d\n", max);
}