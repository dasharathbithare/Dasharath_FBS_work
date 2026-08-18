//4. Print strong numbers in the given range 1 to n.
#include <stdio.h>

void Strongnumber(int *n)
{
    int  i, temp, rem;
    int fact, sum, j;
	 
    printf("Strong numbers from 1 to %d are:\n", *n);

    for(i = 1; i <= *n; i++)
    {
        temp = i;
        sum = 0;

        while(temp > 0)
        {
            rem = temp % 10;

            fact = 1;
            for(j = 1; j <= rem; j++)
            {
                fact = fact * j;
            }

            sum = sum + fact;
            temp = temp / 10;
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
	printf("Enter the value of n: ");
    scanf("%d", &n);
    Strongnumber(ptr);

}