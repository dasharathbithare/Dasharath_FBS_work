//2.2 Accept three sides of a triangle from the user and determine whether the triangle isequilateral, isosceles, or scalene.
#include <stdio.h>
#include <stdio.h>

void triangle();   

int main()
{
    triangle();    
}
void triangle()
{
    int a, b, c;

    printf("Enter three sides of the triangle: ");
    scanf("%d %d %d", &a, &b, &c);

    if (a + b > c && a + c > b && b + c > a)
    {
        if (a == b && b == c)
        {
            printf("Equilateral Triangle");
        }
        else if (a == b || b == c || a == c)
        {
            printf("Isosceles Triangle");
        }
        else
        {
            printf("Scalene Triangle");
        }
    }
    else
    {
        printf("Invalid Triangle");
    }
}