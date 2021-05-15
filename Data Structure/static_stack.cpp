// practical no. :5 


#include<stdio.h>
#define n 5
int stack[n],top,data,i,val;
void push(void);
void pop(void);
void show();

int main()
{
	top=-1;
	push();
	push();
	push();
	push();
	push();
	show();
	pop();
	show();
	pop();
	show();
	pop();
	show();
}

void push()
{
	printf("Enter the value to push in to the stack :");
	scanf("%d",&data);
	if(top==n-1)
	{
		printf("stack is full \n");
	}
	else
	{
		top=top+1;
		stack[top]=data;
		printf("Element pushed successfully \n");
	}
}

void pop()
{
	if(top==-1)
	{
		printf("stack is underflow \n");
	}
	else
	{
		val=stack[top];
		printf(" Element poped is %d  \n",val);
		top=top-1;
	}
}


void show()
{
	for(i=top;i>-1;i--)
	{
		printf("The element in stack is %d: \n",stack[i]);
	}
}
