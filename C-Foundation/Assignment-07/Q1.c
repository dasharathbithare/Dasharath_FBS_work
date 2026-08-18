//1. Print armstrong numbers in the given range 1 to n, using pointer.
#include <stdio.h>

// Function with parameter, no return type
void printArmstrong(int* n) {
    int i, temp, rem, sum;

    printf("Armstrong numbers between 1 and %d are:\n", n);

    for (i = 1; i <= *n; i++) {
        temp = i;
        sum = 0;

        while (temp > 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);  // cube of digit
            temp = temp / 10;
        }

        if (sum == i) {
            printf("%d\n", i);
        }
    }
}

int main() {
    int n;
    int *ptr;
    printf("Enter n: ");
    scanf("%d", &n);
    
    ptr = &n;

    // Call function with parameter
    printArmstrong(ptr);

    return 0;
}