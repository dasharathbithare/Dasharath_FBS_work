//Check the given number is Palindrome number or not.Input: n = 121 Output: Palindrome
#include <stdio.h>
int main() {
    int n = 121;
    int org = n;
    int digit, rev = 0;

    while (n != 0) {
        digit = n % 10;
        rev = rev * 10 + digit;
        n = n / 10;
    }

    if (rev == org)
        printf("Palindrome");
    else
        printf("Not Palindrome");

    return 0;
}