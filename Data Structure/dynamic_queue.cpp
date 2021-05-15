// practical no. :8


#include<stdio.h>
#include<stdlib.h>

struct node
{
	int data;
	struct node *next;
}*front=NULL,*rear=NULL;

void insert();
void delete1();
void display();

int main()
{
	insert();
	insert();
	insert();
	insert();
	insert();
	display();
	delete1();
	display();
	delete1();
	display();
	delete1();
	display();
	delete1();
	display();
	delete1();
	display();
}
void insert()
{
	struct node *newnode;
	int value;
	printf("enter the value in queue:");
	scanf("%d",&value);
	newnode=(struct node*)malloc(sizeof(struct node));
	newnode->data=value;
	newnode->next=NULL;
	if(front==NULL)
	{
		front=rear=newnode;
	}
	else
	{
		rear->next=newnode;
		rear=newnode;
	}
	
}
void delete1()
{
	struct node *temp;
	temp=front;
	if(front==NULL)
	{
		printf("Queue is empty, we can't delete");
	}
	else
	{
		front=front->next;
		printf("the deleted element from queue is %d\n",temp->data); 
		free(temp);
	}
}
void display()
{
	struct node *temp=front;
	if(front==NULL)
	{
		printf("Queue is empty\n");
	}
	else
	{
		while(temp->next!=NULL)
		{
			printf("Element in queue is:%d\n",temp->data);
			temp=temp->next;
		}
		printf("Element in queue is:%d\n",temp->data);
	}
}

