//Write a menu driven program to take a number for user and perform operations as follows.

#include <stdio.h>

int main()
{
    int n, choice, i;
    int temp, rem, rev = 0, sum = 0, count = 0;

    printf("Enter a number: ");
    scanf("%d", &n);

    printf("\n1. Even or Odd");
    printf("\n2. Prime or Not");
    printf("\n3. Palindrome or Not");
    printf("\n4. Positive, Negative or Zero");
    printf("\n5. Reverse a Number");
    printf("\n6. Sum of Digits");

    printf("\nEnter your choice: ");
    scanf("%d", &choice);

    if (choice == 1)
    {
        if (n % 2 == 0)
            printf("Even Number");
        else
            printf("Odd Number");
    }

    else if (choice == 2)
    {
        if (n <= 1)
        {
            printf("Not Prime");
        }
        else
        {
            for (i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    count++;
                    break;
                }
            }

            if (count == 0)
                printf("Prime Number");
            else
                printf("Not Prime");
        }
    }

    else if (choice == 3)
    {
        temp = n;

        while (temp > 0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (rev == n)
            printf("Palindrome Number");
        else
            printf("Not Palindrome");
    }

    else if (choice == 4)
    {
        if (n > 0)
            printf("Positive Number");
        else if (n < 0)
            printf("Negative Number");
        else
            printf("Zero");
    }

    else if (choice == 5)
    {
        temp = n;

        while (temp > 0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        printf("Reverse = %d", rev);
    }

    else if (choice == 6)
    {
        temp = n;

        while (temp > 0)
        {
            rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }

        printf("Sum of Digits = %d", sum);
    }

    else
    {
        printf("Invalid Choice");
    }

    return 0;
}