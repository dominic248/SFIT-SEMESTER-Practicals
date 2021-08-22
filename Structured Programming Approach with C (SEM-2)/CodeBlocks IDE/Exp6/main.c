#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*link;
};
struct node*start=NULL;
void create(struct node**);
void display(struct node*);
void split(struct node*,struct node**,struct node**);
int count(struct node*);
void rev(struct node**,struct node*);
void copy(struct node**,struct node*);
void concatenate(struct node**,struct node**);
void main()
{

    struct node*first=NULL;
    struct node*second=NULL;
    struct node*c=NULL;
    struct node*r=NULL;
    int t;
    //clrscr();
    printf("Exp6\tSIA2\tRoll no.39\n");
    create (&start);
    printf("#Linkedlist is as follows\n");
    display(start);
    copy(&c,start);
    printf("\nThe copied linked list is as follows:\n");
    display(c);
    rev(&r,start);
    printf("\nLinkedlist is reversed as follows:\n");
    display(r);
    split(start,&first,&second);
    printf("\nLinkedlist is split into two\n");
    printf("The first linkedlist is as follows\n");
    display(first);
    printf("\nThe second linkedlist is as follows\n");
    display(second);
    concatenate(&first,&second);
    printf("\nThe split linkedlist is concatenated as follows:\n");
    display(first);
    t=count(c);
    printf("\nThe count is:%d",t);
    getch();
}
void display(struct node*q)
{
    struct node*temp;
    temp=q;
    while(temp!=NULL)
    {
        printf("%d->",temp->data);
        temp=temp->link;
    }
    printf("NULL");
}
void create(struct node**q)
{
    int n,num,i;
    struct node*temp;
    printf("Enter the no of elements to be inserted:");
    scanf("%d",&n);
    for(i=0; i<n; i++)
    {
        printf("Enter a no:");
        scanf("%d",&num);
        temp=(struct node*)malloc(sizeof(struct node));
        temp->data=num;
        temp->link=NULL;
        if(*q==NULL)
            *q=temp;
        else
        {
            struct node*p;
            p=*q;
            while(p->link!=NULL)
            {
                p=p->link;
            }
            p->link=temp;
        }
    }
}
void split(struct node*p,struct node**first,struct node**second)
{
    int numnodes,splitpt,i=0;
    struct node*temp,*newnode,*temp2;
    numnodes=count(p);
    temp=p;
    if(numnodes%2==0)
        splitpt=numnodes/2;
    else
        splitpt=numnodes/2+1;
    temp=p;
    while(i<splitpt)
    {
        newnode=(struct node*)malloc(sizeof(struct node));
        newnode->data=temp->data;
        if(i==0)
        {
            *first=newnode;
            temp2=newnode;
        }
        else
        {
            temp2->link=newnode;
            temp2=temp2->link;
        }
        temp=temp->link;
        i++;
    }
    temp2->link=NULL;
    while(temp!=NULL)
    {
        newnode=(struct node*)malloc(sizeof(struct node));
        newnode->data=temp->data;
        if(*second==NULL)
        {
            *second=newnode;
            temp2=newnode;
        }
        else
        {
            temp2->link=newnode;
            temp2=temp2->link;
        }
        temp=temp->link;
    }
    temp2->link=NULL;
}
int count(struct node*a)
{
    int count=0;
    while(a!=NULL)
    {
        count++;
        a=a->link;
    }
    return(count);
}
void rev(struct node**q,struct node*p)
{
    struct node*temp,*temp1;
    temp=p;
    while(temp!=NULL)
    {
        if(*q==NULL)
        {
            *q=(struct node*)malloc(sizeof(struct node));
            (*q)->link=NULL;
            temp1=*q;
        }
        else
        {
            *q=(struct node*)malloc(sizeof(struct node));
            (*q)->link=temp1;
            temp1=*q;
        }
        (*q)->data=temp->data;
        temp=temp->link;
    }
}
void copy(struct node**q,struct node*p)
{
    if ( p != NULL )
    {
        *q = malloc ( sizeof ( struct node ) ) ;

        ( *q ) -> data = p -> data ;
        ( *q ) -> link = NULL ;

        copy (  &( ( *q ) -> link ),p -> link) ;
    }
}
void concatenate(struct node**p,struct node**q)
{
    struct node*temp;
    if(*p==NULL)
        *p=*q;
    else
    {
        if(*q!=NULL)
        {
            temp=*p;
            while(temp->link!=NULL)
                temp=temp->link;
            temp->link=*q;
        }
    }
}
