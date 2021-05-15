// practical no. :6

#include<stdio.h>
#include<malloc.h>
#include<stdlib.h>

void add();
void delete1();
void display();

struct node
{
	int data;
	struct node *next;
}*top=NULL;

int main()
{
	add();
	add();
	add();
	add();
	display();
	delete1();
	display();
	delete1();
	display();	
}

void add()
{
	struct node *newnode;
	int value;
	printf("enthe the value of node:");
	scanf("%d",&value);
	
	newnode=(struct node*)malloc(sizeof(struct node));
	newnode->data=value;
	
	if(top==NULL)
			newnode->next=NULL;
	else
			newnode->next=top;
	
	top=newnode;
}
void delete1()
{
	if(top==NULL)
	{
		printf("Stack is empty, can't delete\n");
	}
	else
	{
		struct node *temp=top;
		printf("Deleted Element is %d\n",temp->data);
		top=temp->next;
		free(temp);
	}
	
}
void display()
{
	
	if(top==NULL)
	{
		printf("Stack is empty\n");
	}
	else
	{
		struct node *temp=top;
		
		while(temp->next!=NULL)
		{
			printf("Value is %d\n",temp->data);
			temp=temp->next;
		}
		printf("Value is %d\n",temp->data);
	}	
}

