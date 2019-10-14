/*I DIMENSIONAL ARRAY*/

#include <stdio.h>
int main()
{
    int arr[9];                                 //declared array of size n

    printf("Enter elements of the array\n");
    for(register int i=0;i<9;i++)
    {
        scanf("%d",&arr[i]);
    }

    printf("Entered array by the user\n");
    for(register int i=0;i<9;i++)
    {
            printf("%d ",arr[i]);
        }
    }
}
