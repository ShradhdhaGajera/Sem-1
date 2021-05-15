// practical no. :3


#include <stdio.h> 

void fun(int a) 
{ 
	printf("Value of a is %d\n", a); 
} 

int main() 
{ 
	// fun_ptr is a pointer to function fun() 
	void (*fun_ptr)(int); 
	fun_ptr = &fun; 
	
	(*fun_ptr)(10); 
	
	return 0; 
} 

