/*2.5 Accept the price from user. 
Ask the user if he is a student (user may say y or n). 
If he is a student and he has purchased more than 500 than discount is 20% otherwisediscount is 10%.
But if he is not a student then if he has purchased more than 600 discount is 15% otherwise there is not discount.*/

#include <stdio.h>
void discount();
void main()
{
	discount();
}

void discount()
{
    char isStudent = 'n';
    double price, fprice;
    double discount = 0;

    printf("Enter price: ");
    scanf("%lf", &price);

   printf("Are you a student? (y/n): ");
   scanf(" %c", &isStudent);

    if (isStudent == 'y') {
        if (price >= 500) {
            discount = price * 0.20;
            printf("Discount = %lf\n", discount);
        } else {
            discount = price * 0.10;
            printf("Discount = %lf\n", discount);
        }
    } else {
        if (price >= 600) {
            discount = price * 0.15;
            printf("Discount = %lf\n", discount);
        } else {
            discount = 0;
        }
    }

    fprice = price - discount;

    if (discount == 0) {
        printf("Final price = %lf\n", fprice);
    } else {
        printf("Final price = %lf\n", fprice);
    }
}