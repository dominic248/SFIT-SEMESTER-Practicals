#include<conio.h>
#include<stdio.h>
int a[10],h[10],i;
void hash1(int key);
void main()
{
    int n;
    //clrscr();
    printf("Exp11\tSIA2\tRoll no.39");
    printf("\n Enter the number of elements:");
    scanf("%d",&n);
    printf("\n Enter the array elements:");
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0; i<10; i++)
    {
        h[i]=-1;
    }
    printf("Hash table before adding elements:");
    for(i=0; i<10; i++)
    {
        printf("%d\t",h[i]);
    }
    for(i=0; i<=9; i++)
    {
        hash1(a[i]);
    }
    printf("\nArray\tlocation\thashtable:\n");
    for(i=0; i<n; i++)
    {
        printf("%d\t%d\t\t%d\n",a[i],i,h[i]);
    }
    getch();
}
void hash1(int key)
{
    int index,i=0;
    do
    {
        index=(key+i)%10;
        if(h[index]!=-1)
            i++;
    }
    while(h[index]!=-1);
    h[index]=key;
}
