// practical no. :12


#include<stdio.h>
#include<stdlib.h>

struct node
{
	int no;
	struct node *next;

};
struct node *first=NULL;
struct node *last=NULL;
void create();
void display();
void insertdesiredlocation(int,int);
int main()
{

	create();
	create();
	create();
	display();
	insertdesiredlocation(50,2);
	display();

}
void create()
{
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter Value of Linklist :");
	scanf("%d",&newnode->no);
	newnode->next=NULL;
	if(first==NULL)
	{
		first=newnode;
		last=newnode;
	}
	else
	{
		last->next=newnode;
		last=newnode;
	}
}
void display()
{
	struct node *temp;
	printf("Dispaly Function Called");
	for(temp=first;temp!=NULL;temp=temp->next)
	{
		printf("\n The Element Of Link List Are : %d\n",temp->no);
	}
}
void insertdesiredlocation(int data,int pos)
{
	int i;
	struct node *newnode,*temp;
	newnode=(struct node*)malloc(sizeof(struct node));
	if(newnode==NULL)
	{
		printf("Not Able To Allocate Memory To Element");
	}
	else
	{
		newnode->no=data;
		newnode->next=NULL;
		temp=first;
		
		for(i=2;i<=pos-1;i++)
		{
			temp=temp->next;
			if(temp==NULL)
			{
				break;
			}
		}
		newnode ->next = temp ->next;   
        temp ->next = newnode; 
		
	}
}
