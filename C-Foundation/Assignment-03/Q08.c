//Check the given number is Strong number or not. Input: n = 145 output: Strong
#include <stdio.h>

int main() {
    int n = 145;
    int org = n;
    int digit, sum = 0, i, fact;

    while (n != 0) {
        digit = n % 10;

        fact = 1;
        for (i = 1; i <= digit; i++) {
            fact = fact * i;
        }

        sum = sum + fact;
        n = n / 10;
    }

    if (sum == org)
        printf("Strong Number");
    else
        printf("Not a Strong Number");

    return 0;
}