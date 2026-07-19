// Accept three sides of a triangle from the user and determine whether the triangle is equilateral, isoscales, or scalane.

#include <stdio.h>
int main()
{
	int a, b, c;  //this inputs are the three sides of a traingle
    printf("enter the first side of traingle = ");
	scanf("%d", &a);
	
	printf("enter the secccnd side of traingle = ");
	scanf("%d", &b);
	
	printf("enter the third side of traingle = ");
	scanf("%d", &c);
	
	if(a+b+c ==180)
	
    {
	
	if(a==b && b==c)
	  {
		if(a!=0 && b!=0 && c!=0)
	    {
	    	printf("Equialateral");
	    }
	else if(a == b || b == c || a == c )
	    {
	    	printf("Isoscales");
	    }
	else
    	printf("scalene");
      }
    
    else printf ("The angle must be not 0");
    }
    else 
	printf("the addition of angles must be 180");
	
	return 0;
}