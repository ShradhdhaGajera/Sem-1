// practical no. :1  

#include<stdio.h>  

int addition ();  
int substraction();
int multiplication();
int division();

int main ()  
{  
    int result;   
    int (*ptr)();  
    ptr = &addition;  
    result = (*ptr)();  
    printf("The addition is %d \n",result);  
    
    int result1;   
    int (*ptr1)();  
    ptr1 = &substraction;  
    result1 = (*ptr1)();  
    printf("The substraction is %d \n",result1);
    
    int result2;   
    int (*ptr2)();  
    ptr2 = &multiplication;  
    result2 = (*ptr2)();  
    printf("The multiplication is %d \n",result2);
    
    int result3;   
    int (*ptr3)();  
    ptr3 = &division;  
    result3 = (*ptr3)();  
    printf("The division is %d \n",result3);
    
   
}  

int addition()  
{  
    int a, b;   
    printf("Enter two numbers : \n");  
    scanf("%d %d",&a,&b);  
    return a+b;  
}  

int substraction()  
{  
    int a, b;   
    printf("Enter two numbers : \n");  
    scanf("%d %d",&a,&b);  
    return a-b;  
}  

int multiplication()  
{  
    int a, b;   
    printf("Enter two numbers : \n");  
    scanf("%d %d",&a,&b);  
    return a*b;  
}  
int division()  
{  
    int a, b;   
    printf("Enter two numbers : \n");  
    scanf("%d %d",&a,&b);  
    return a/b;  
}  
