//4. a program to check whether a given character is a vowel or consonant.

#include <stdio.h>
void check();

int main() 
{
	check();
}
void check()
{
    char ch = 'b';   

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        printf("%c is a Vowel\n", ch);
    } else {
        printf("%c is a Consonant\n", ch);
    }
}