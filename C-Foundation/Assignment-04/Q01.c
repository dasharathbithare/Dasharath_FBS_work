//Print armstrong numbers in the given range 1 to n.
#include <stdio.h>

int main()
{
    int n, i;

    printf("Enter n: ");
    scanf("%d", &n);

    for(i = 1; i <= n; i++)
    {
        int num = i;
        int temp = i;
        int digits = 0;
        int sum = 0;
      
        while(temp != 0)
        {
            digits++;
            temp = temp / 10;
        }
        temp = num;

        while(temp != 0)
        {
            int rem = temp % 10;
            int power = 1;
         
            for(int j = 1; j <= digits; j++)
            {
                power = power * rem;
            }
            sum = sum + power;
            temp = temp / 10;
        }
        if(sum == num)
        {
            printf("%d ", num);
        }
       
    }
    return 0;
}