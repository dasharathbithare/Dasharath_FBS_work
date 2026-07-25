//Check the given number is prime or not. Input: n = 7 Output: Prime
#include<stdio.h>
int main ()
{
	int n = 7;
	int flag = 0;
	for (int i = 2; i <= n - 1; i++)
    {
        if (n % i == 0)
        {
            flag = 1;
            break;
        }
    }
	if (flag == 1)
        printf("Not Prime");
    else
        printf("Prime");

    return 0;
}
