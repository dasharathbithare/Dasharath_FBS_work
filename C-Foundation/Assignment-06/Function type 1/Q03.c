//3. Write a program to check whether a given year is a leap year.

#include <stdio.h>
void check();
int main()
{
	check();
}

void check()
{
    int year = 2025;  

    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
        printf("%d is a Leap Year\n", year);
    } else {
        printf("%d is Not a Leap Year\n", year);
    }

    
}