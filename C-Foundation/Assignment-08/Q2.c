//2. Search the given number in array.  
# include<stdio.h>
void main()
{
	   int arr[5], i, num, flag=0;

    printf("Enter 5 numbers:\n");
    for(i=0; i<5; i++)
        scanf("%d",&arr[i]);

    printf("Enter number to search: ");
    scanf("%d",&num);

    for(i=0; i<5; i++)
    {
        if(arr[i]==num)
        {
            flag=1;
            break;
        }
    }

    if(flag==1)
        printf("Number Found");
    else
        printf("Number Not Found");
}