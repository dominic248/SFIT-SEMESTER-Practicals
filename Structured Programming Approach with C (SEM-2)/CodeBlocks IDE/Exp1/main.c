#include<stdio.h>
#include<conio.h>
#define MAX 5
int st[5], top=-1;
void push(int st[], int val);
int pop(int st[]);
void display(int st[]);
int peek(int st[]);
int main()
{
    int val, option;
    //clrscr();
    printf("Exp1\tSIA2\tRoll no.39\n");
    do
    {
        printf("------------------------MAIN MENU------------------------");
        printf("\n1.Push\t2.Pop\t3.Display\t4.Peek\t5.Exit");
        printf("\nEnter your choice: ");
        scanf("%d",&option);
        switch(option)
	    {
            case 1: printf(" Enter the no to be pushed on the stack: ");
                    scanf("%d",&val);
                    push(st,val);
                    break;

            case 2: val=pop(st);
                    if( val!=-1)
                        printf(" The value to be deleted form the stack is: %d\n", val);
                    break;
            case 3: display(st);
                    break;
            case 4: val=peek(st);
                    if(val!=-1)
                        printf(" The value stored at top of the stack is: %d\n",val);
                    break;
            case 5: printf("Exiting!");
                    break;
            default: printf("Please enter a correct choice!");
        }
    }while(option!=5);
    return 0;
}
void push(int st[], int val)
{
    if(top==MAX-1){
        printf(" STACK OVERFLOW\n");
    }else{
       top++;
       st[top]=val;
    }
}
int pop(int st[])
{
    int val;
    if(top==-1){
       printf(" STACK UNDERFLOW\n");
       return -1;
    }else{
        val=st[top];
        top--;
        return val;
    }
}
void display(int st[])
{
    int i;
    if(top==-1){
            printf(" STACK IS EMPTY\n");
    }else{
	    for(i=0;i<=top;i++)
	    {
	       printf(" %d\n",st[i]);
        }
    }
}
int peek(int st[])
{
	if(top== -1){
		printf(" STACK IS EMPTY\n");
		return -1;
    }else{
	   return st[top];
	}
}
