//2. Print prime numbers in the given range 1 to n.
#include <stdio.h>

void printPrimes(int *n)   
{
    int i, j, count;
    
    for(i = 2; i <= *n; i++)
    {
        count = 0;
        for(j = 1; j <= i; j++)
        {
            if(i % j == 0)
            {
                count++;
            }
        }
        if(count == 2)
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
    printf("Enter the number: ");
    scanf("%d", &n);

    printPrimes(ptr);   
}