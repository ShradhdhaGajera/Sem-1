//practical no. : 1

class Utility 
{ 
    public static boolean evenOdd(int n) 
    { 
       if(n % 2 == 0)
	   {
          return true;
	   }
	   else
	   {   
		  return false;
	   }
    } 
	
    static boolean isPrime(int n) 
    { 
       
        if (n <= 1)			
		{			
            return false;
		}	
        for (int i = 2; i < n; i++) 
		{
            if (n % i == 0) 
			{
                return false; 
			}
			
		} 
		return true; 
    } 
	
    public static void main(String[] args) 
    { 
        int n = 43; 
        if(evenOdd(n) == true)
		{			
            System.out.print(n+" No Is Even \n"); 
		}
        else
		{
            System.out.print(n+" No Is Odd \n");
		}
		if (isPrime(101))
		{			
            System.out.println(" No Is Prime"); 
		}
        else
		{
            System.out.println(" No Is Not Prime"); 
		}
        if (isPrime(10)) 
		{
            System.out.println(" No Is Prime"); 
		}
        else
		{
            System.out.println(" No Is Not Prime"); 
		}
    } 
}