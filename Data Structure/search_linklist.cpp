// practical no. :9  


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
int search(int key);

void main()
{
	int n,key,index;
	create();
	create();
	create();
	display();
	printf("\n Enter Element to Search :");
	scanf("%d",&key);
	index = search(key);
	if(index>=0)
	{
		printf(" Element %d Found At The Position %d \n",key,index+1);
	}
	else
	{
		printf(" Element %d Not Found in the List \n",key);	
	}
}
void create()
{
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter Value Of Linklist :");
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
int search(int key)
{
	int index;
	struct node *curnode;
	index=0;
	curnode=first;
	
	while(curnode!=NULL&&curnode->no!=key)
	{
		index++;
		curnode=curnode->next;
	}
	return(curnode!=NULL)?index:-1;
}
