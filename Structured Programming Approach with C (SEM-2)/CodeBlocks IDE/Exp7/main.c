#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
/*-----------------------------------define tree node---------------------------------------*/
typedef struct treenode
{
    char data;
    struct treenode *left,*right;
} treenode;
/*-----------------------------------define stack---------------------------------------*/
typedef struct stack
{
    treenode *data[20];
    int top;
} stack;
/*-----------------------------------STACK OPERATIONS ---------------------------------------*/
void init(stack *s)
{
    s->top=-1;
}
treenode *pop(stack *s)
{
    treenode *p;
    p=s->data[s->top];
    s->top=s->top-1;
    return(p);
}
void push(stack *s,treenode *p)
{
    s->top=s->top+1;
    s->data[s->top]=p;
}
int empty(stack *s)
{
    if(s->top==-1)
    {
        return(1);
    }
    return(0);
}
int full(stack *s)
{
    if(s->top==19)
        return(1);
    return(0);
}
/*-----------------------------------TREE OPERATIONS---------------------------------------*/
treenode *create();
void inorder(treenode *T);
void preorder(treenode *T);
void postorder(treenode *T);
/*-----------------------------------MAIN FUNCTION---------------------------------------*/
void main()
{
    treenode *root=NULL,*p;
    int x,op;
    printf("Exp7\tSIA2\tRoll no.39");
    //clrscr();
    do
    {
        printf("\n---------------MAIN MENU---------------");
        printf("\n1.CREATE\n2.PREORDER\n3.INORDER\n4.POSTORDER\n5.QUIT\nENTER YOUR CHOICE\n");
        scanf("%d",&op);
        switch(op)
        {
        case 1:
            root=create();
            break;
        case 2:
            preorder(root);
            break;
        case 3:
            inorder(root);
            break;
        case 4:
            postorder(root);
            break;
        }
    }
    while(op!=5);
    getch();
}
/*-----------------------------------TREE OPERATIONS DEFINATIONS---------------------------------------*/
void inorder(treenode *T)
{
    if(T!=NULL)
    {
        inorder(T->left);
        printf("%c",T->data);
        inorder(T->right);
    }
}
void preorder(treenode *T)
{
    if(T!=NULL)
    {
        printf("%c",T->data);
        preorder(T->left);
        preorder(T->right);
    }
}
void postorder(treenode *T)
{
    if(T!=NULL)
    {
        postorder(T->left);
        postorder(T->right);
        printf("%c",T->data);
    }
}
treenode * create()
{
    char a[50];
    int i;
    treenode *p,*q,*root;
    stack s;
    init(&s);
    flushall();
    printf("ENTER A POSTFIX EXPRESSION\n");
    gets(a);
    for(i=0; a[i]!='\0'; i++)
    {
        if(isalnum(a[i]))                               //if operand then push to stack
        {
            p=(treenode *)malloc(sizeof(treenode));
            p->left=p->right=NULL;
            p->data=a[i];
            push(&s,p);
        }
        else                                            //if operator then pop two operands and perform operation
        {
            q=pop(&s);
            p=pop(&s);
            root=(treenode *)malloc(sizeof(treenode));
            root->left=p;
            root->right=q;
            root->data=a[i];
            push(&s,root);
        }
    }
    root=pop(&s);                      //remove the last element left in stack as root of tree
    return(root);
}
