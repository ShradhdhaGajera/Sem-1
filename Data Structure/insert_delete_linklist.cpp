// practical no. :10  


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
void insertatbegin(int);
void insertend(int);
void deletebegin();
void deleteend();
void main()
{
	create();
	create();
	create();
	create();
	display();
	insertatbegin(100);
	display();
	insertend(80);
	display();
	deletebegin();
	display();
	deleteend();
	display();
}
void create()
{
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter Value Of Linklist : ");
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
	printf("\n Dispaly Function Called");
	for(temp=first;temp!=NULL;temp=temp->next)
	{
		printf("\n The Element Of Link List Are : %d\n",temp->no);
	}
}
void insertatbegin(int data)
{
	struct node *newnode1;
	newnode1=(struct node*)malloc(sizeof(struct node));
	newnode1->no=data;
	newnode1->next=first;
	first=newnode1;
	printf("\n Successfully Inserted");
}
void insertend(int item)
{
	 struct node *ptr = (struct node*)malloc(sizeof(struct node));     
        struct node *temp;  
        if(ptr == NULL)  
        {  
            printf("\n Overflow");     
        }  
        else  
        {  
            ptr->no = item;  
            if(first == NULL)  
            {  
                ptr -> next = NULL;  
                first = ptr;  
               
            }  
            else  
            {  
                temp = first;  
                while (temp -> next != NULL)  
                {  
                    temp = temp -> next;  
                }  
                temp->next = ptr;  
                ptr->next = NULL;  
                
              
            }  
        }  
}
void deletebegin()
{
	 struct node *ptr;  
        if(first == NULL)  
        {  
            printf("\n List is Empty");  
        }  
        else   
        {  
            ptr = first;  
            first = ptr->next;  
            free(ptr);  
            printf("\n Node Deleted From The Begining ...");  
        }  
}
void deleteend()
{
	struct node *ptr,*ptr1;  
        if(first == NULL)  
        {  
            printf("\n List is Empty");  
        }  
        else if(first -> next == NULL)  
        {  
            first = NULL;  
            free(first);  
        }  
              
        else  
        {  
            ptr = first;   
            while(ptr->next != NULL)  
                {  
                    ptr1 = ptr;  
                    ptr = ptr ->next;  
                }  
                ptr1->next = NULL;  
                free(ptr);  
                printf("\n Deleted Node from The Last ...");  
            }     
}

