//practical no. : 7

class OddThread  extends Thread
{
	public void run()
	{
		for(int i=0; i <= 100; i++ )
		{
			if(i %2 != 0)
			{
				System.out.println("odd =" +i);
				try
				{
					Thread.sleep(400);
				}
				catch(InterruptedException i1)
				{
					i1.printStackTrace();
				}
			}
		}
	}
}

class PrimeThread extends Thread
{
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println("" + t.getPriority());
		t.setName("Prime thread");
		System.out.println("" + t.getName());

		int temp;
		boolean isPrime=true;
		
		for(int i=1; i<=100; i++)
		{
			for(int i1= 2 ; i1 <= i / 2;i1++)
			{
			    temp = i % i1;  
                if (temp == 0)   
				{  
                    isPrime = false;  
                    break;  
                }  
			}  
			 
			if (isPrime) 
			{
				System.out.println(i + " is a Prime Number");  
				
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException i1)
				{
					i1.printStackTrace();
				}
			}
			else
			{
				System.out.println(i + " is not a Prime Number");  
			} 
		}
	}
}

public class Thread_Demo
{
	public static void main(String [] args)
	{
		Thread t=Thread.currentThread();
		System.out.println( " " +t.getName());
		t.setName("main thread");
		System.out.println( " " +t.getName());
		System.out.println( " " +t.getPriority());
		
		OddThread ot=new OddThread();
		ot.start();
		
		PrimeThread p1=new PrimeThread();
		p1.start();
	}
}
