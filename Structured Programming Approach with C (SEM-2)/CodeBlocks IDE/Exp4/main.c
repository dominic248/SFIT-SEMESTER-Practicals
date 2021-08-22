#include<stdio.h>
#include<conio.h>
const int max=3;
void enqueue(int);
void frontenqueue(int);
int dequeue();
int reardequeue();
void display();
int queue[2],rear=-1,front=-1;
int main()
{
    int val,n,m;
    //clrscr();
    printf("Exp4\tSIA2\tRoll no.39");
    do
    {
        printf("\n------------------------MAIN MENU------------------------");
        printf("\n1.ENQUEUE rear\t2.ENQUEUE front\t3.DEQUEUE rear\n4.DEQUEUE front\t5.Display\t6.EXIT\nEnter the choice:");
        scanf("%d",&n);
        switch(n)
        {
        case 1:
            printf("Enter value to ENQUEUE from rear: ");
            scanf("%d",&m);
            enqueue(m);
            break;
        case 2:
            printf("Enter value to ENQUEUE from front: ");
            scanf("%d",&m);
            frontenqueue(m);
            break;
        case 3:
            if(rear==-1)
            {
                printf("UNDERFLOW");
            }
            else
            {
                val=reardequeue();
            }
            printf("Value DEQUEUED from rear is %d",val);
            break;
        case 4:
            if(front==-1)
            {
                printf("UNDERFLOW");
            }
            else
            {
                val=dequeue();
            }
            printf("Value DEQUEUED from front is %d",val);
            break;
        case 5:
            printf("DISPLAY\n");
            display();
            break;
        case 6:
            printf("EXIT");
            break;
        default:
            printf("INVALID");
        }
    }
    while(n!=6);
    getch();
}
void enqueue(int m)
{
    if(rear==(max-1))
    {
        printf("OVERFLOW");
    }
    else if(front==-1)
    {
        front=0;
        rear=0;
        queue[front]=m;
        printf("%d is ENQUEUED",m);
    }
    else
    {
        rear++;
        queue[rear]=m;
        printf("%d is ENQUEUED",m);
    }
}
int dequeue()
{
    int m=0;
    if(front==rear)
    {
        m=queue[front];
        front=-1;
        rear=-1;
        return m;
    }
    else
    {
        m=queue[front];
        front++;
    }
    return m;
}
void display()
{
    int i;
    printf("Queue elements are:\n");
    for(i=front; i<=rear; i++)
    {
        printf("%d\t",queue[i]);
    }
}
int reardequeue()
{
    int m=0;
    if(front==rear)
    {
        m=queue[front];
        front=-1;
        rear=-1;
    }
    else
    {
        m=queue[rear];
        rear--;
    }
    return m;
}
void frontenqueue(int m)
{
    if(front==0)
    {
        printf("OVERFLOW");
    }
    else if(rear==-1)
    {
        rear=0;
        front=0;
        queue[front]=m;
        printf("%d is ENQUEUED",m);
    }
    else
    {
        --front;
        queue[front]=m;
        printf("%d is ENQUEUED",m);
    }
}

