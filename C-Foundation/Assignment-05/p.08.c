//Print a pattern of stars in diamond shape Input: n = 4
#include <stdio.h>

int main() {
    int n = 4;

    // Upper Pyramid
    for (int i = 1; i <= n; i++) {

        // Spaces
        for (int j = 1; j <= n - i; j++) {
            printf(" ");
        }

        // Stars
        for (int j = 1; j <= 2 * i - 1; j++) {
            printf("*");
        }

        printf("\n");
    }

    // Lower Inverted Pyramid
    for (int i = 1; i <= n - 1; i++) {

        // Spaces
        for (int j = 1; j <= i; j++) {
            printf(" ");
        }

        // Stars
        for (int j = 1; j <= 2 * (n - i) - 1; j++) {
            printf("*");
        }

        printf("\n");
    }

    return 0;
}