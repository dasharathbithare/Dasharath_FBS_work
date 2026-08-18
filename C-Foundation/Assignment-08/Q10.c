//10. Sort the array.

#include <stdio.h>

void main() {
    int arr[5], i, j, temp;

    printf("Enter 5 numbers:\n");
    for(i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }

    
    for(i = 0; i < 5 - 1; i++) 
	{
        for(j = 0; j < 5 - i - 1; j++)
		{
            if(arr[j] > arr[j + 1]) 
			{
               
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    printf("Sorted array:\n");
    for(i = 0; i < 5; i++) {
        printf("%d ", arr[i]);
    }

    
}