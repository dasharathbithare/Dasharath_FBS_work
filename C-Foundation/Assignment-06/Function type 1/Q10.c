//2.3 Write a program to find greatest of three numbers using nested if-else.
#include <stdio.h>
void gretestnumber();
int main()
{
	gretestnumber();
}

void gretestnumber()
{
    int a = 23, b = 30, c = 43;

    if (a > b) {
        if (a > c) {
            printf("Greatest number is: %d\n", a);
        } else {
            printf("Greatest number is: %d\n", c);
        }
    } else {
        if (b > c) {
            printf("Greatest number is: %d\n", b);
        } else {
            printf("Greatest number is: %d\n", c);
        }
    } 
}