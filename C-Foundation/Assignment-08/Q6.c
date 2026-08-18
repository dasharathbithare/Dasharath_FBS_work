//6. Accept array and print only prime numbers of array.
#include <stdio.h>

void main()
{
    int arr[5],i,j,count;

    printf("Enter 5 numbers:\n");

    for(i=0;i<5;i++)
        scanf("%d",&arr[i]);

    printf("Prime Numbers:\n");

    for(i=0;i<5;i++)
    {
        count=0;

        for(j=1;j<=arr[i];j++)
        {
            if(arr[i]%j==0)
                count++;
        }

        if(count==2)
            printf("%d ",arr[i]);
    }

  
}