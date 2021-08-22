#include<stdio.h>
#include<conio.h>
const int max=3;
void enqueue(int);
int dequeue();
int peek();
void display();
int stack[2],rear=-1,front=-1;
void main()
{
    int val,n,m;
    //clrscr();
    printf("Exp3\tSIA2\tRoll no.39");
    do
    {
        printf("\n------------------------MAIN MENU------------------------");
        printf("\n1.ENQUEUE\t2.DEQUEUE\t3.PEEK\t4.Display\t5.Exit\nEnter your choice: ");
        scanf("%d",&n);
        switch(n)
        {
        case 1:
            printf("Enter value to ENQUEUE: ");
            scanf("%d",&m);
            enqueue(m);
            break;
        case 2:
            val=dequeue();
            if(val!=0)
                printf("Value DEQUEUED is: %d ",val);
            break;
        case 3:
            printf("Peek value: ");
            peek();
            break;
        case 4:
            printf("DISPLAY\n");
            display();
            break;
        case 5:
            printf("EXIT");
            break;
        default:
            printf("INVALID");
        }
    }
    while(n!=5);
    getch();
}
void enqueue(int m)
{
    if(rear==max-1)
    {
        printf("Overflow");
    }
    else
    {
        if(front==-1)
            front=0;
        rear++;
        stack[rear]=m;
        printf("%d is ENQUEUED",m);
    }
}
int dequeue()
{
    int m=0;
    if(front==-1)
    {
        printf("Underflow");
    }
    else
    {
        m=stack[front];
        front++;
    }
    return m;
}
int peek()
{
    int m=0;
    if(rear==-1)
    {
        printf("Stack is empty");
    }
    else
    {
        m=stack[rear];
        printf("%d",m);
    }
    return m;

}
void display()
{
    int i;
    printf("Stack elements are: ");
    for(i=front; i<=rear; i++)
    {
        printf("%d\n",stack[i]);
    }
}
