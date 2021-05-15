// practical no. :7 


#include<stdio.h>
#define size 5

int front=-1;
int rear=-1;
int q[size];
int i;

//prototype
void que_insert(int);
void que_delete();
void que_display();

int main()
{
	int value;
	printf("Enter the value to insert in the queue :");
	scanf("%d",&value);
	que_insert(value);
	que_insert(20);
	que_insert(30);
	que_insert(40);
	que_insert(50);
	que_display();
	que_delete();
	que_display();
	que_delete();
	que_display();
	que_delete();
	que_display();

}

void que_insert(int value)
{
	if(rear >= size-1)
	{
		printf("Queue is full \n");
	}
	else
	{
		rear=rear+1;
		q[rear]=value;
		
		if(front==-1)
		{
			front =0;
		}
		
	}
}

void que_delete()
{
	if(front==-1)
	{
		printf("Queue is empty \n");
	}
	else
	{
		printf("The element deleted is %d\n",q[front]);
	}
	if(front==rear)
	{
		front=-1;
		rear=-1;
	}
	else
	{
		front=front+1;
	}
}

void que_display()
{
	
	if(front==-1)
	{
		printf("Queue is empty \n");
	}
	else
	{
		for(i=front;i<=rear;i++)
		{
			printf("Element in queue is %d\n",q[i]);
		}
	}
}

