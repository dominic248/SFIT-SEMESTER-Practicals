#include<stdio.h>
#include<conio.h>
#define size 10
int n=10;
int partition(int a[],int beg,int end);
void quick_sort(int a[],int beg,int end);
void merge(int a[],int,int,int);
void merge_sort(int a[],int,int);
void main()
{
    int arr[size],i,x;
    //clrscr();
    printf("Exp9\tSIA2\tRoll no.39");
    do
    {
        printf("\n ENTER THE NO. OF ELEMENTS :\t");
        scanf("%d",&n);
        printf("ENTER THE ELEMENT :\t");
        for(i=0; i<n; i++)
        {
            scanf("%d",&arr[i]);
        }

        printf("\n ENTER YOUR CHOICE 1.QUICK SORT\t 2.MERGE SORT\t 3.EXIT\n");
        scanf("%d",&x);
        switch(x)
        {
        case 1:
            quick_sort(arr,0,n-1);
            printf("THE QUICK SORTED ARRAY IS:\n");
            for(i=0; i<n; i++)
                printf("%d \t",arr[i]);
            break;

        case 2:
            merge_sort(arr,0,n-1);
            printf("THE MERGE SORTED ARRAY IS:\n");
            for(i=0; i<n; i++)
            {
                printf("%d \t",arr[i]);
            }
            break;
        case 3:
            printf("EXIT");
            break;
        default:
            printf("INVALID");
        }
    }
    while(x!=3);
    getch();
}
int partition(int a[],int beg,int end)
{
    int left,right,temp,loc,flag;
    loc=left=beg;
    right=end;
    flag=0;
    while(flag!=1)
    {
        while((a[loc]<=a[right]) && (loc!=right))
            right--;
        if(loc==right)
            flag=1;
        else if(a[loc]>a[right])
        {
            temp=a[loc];
            a[loc]=a[right];
            a[right]=temp;
            loc=right;
        }
        if(flag!=1)
        {
            while((a[loc]>=a[left])&&(loc!=left))
                left++;
            if(loc==left)
                flag=1;
            else if(a[loc]<a[left])
            {
                temp=a[loc];
                a[loc]=a[left];
                a[left]=temp;
                loc=left;
            }
        }
    }
    return loc;
}
void quick_sort(int a[],int beg,int end)
{
    int loc,i;
    if(beg<end)
    {
        loc=partition(a,beg,end);
        quick_sort(a,beg,loc-1);
        quick_sort(a,loc+1,end);
    }
}
void merge_sort(int arr[],int beg,int end)
{
    int mid,i;
    int n=end;
    if(beg<end)
    {
        mid=(beg+end)/2;
        merge_sort(arr,beg,mid);
        merge_sort(arr,mid+1,end);
        merge(arr,beg,mid,end);
    }
}
void merge(int arr[],int beg,int mid,int end)
{
    int i=beg,j=mid+1,index=beg,temp[size],k;
    while((i<=mid) && (j<=end))
    {
        if(arr[i] < arr[j])
        {
            temp[index]=arr[i];
            i++;
        }
        else
        {
            temp[index]=arr[j];
            j++;
        }
        index++;
    }
    if(i<mid)
    {
        while(j<=end)
        {
            temp[index]=arr[j];
            j++;
            index++;
        }
    }
    else
    {
        while(i<=mid)
        {
            temp[index]=arr[i];
            i++;
            index++;
        }
    }
    for(k=beg; k<index; k++)
        arr[k]=temp[k];
}