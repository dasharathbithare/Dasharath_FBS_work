//Find factorial of given number. Input: n = 5 Output: 120
#include <stdio.h>

int main() 
{
    int n = 5;
    int i, fact = 1;

    for (i = 1; i <= n; i++) {
        fact = fact * i;
    }

    printf("Factorial = %d", fact);

    return 0;
}