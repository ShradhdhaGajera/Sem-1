// Practical No : 16

import java.net.*;
import java.io.*;
import java.util.Scanner;

class Two_No_Client
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
				
				Socket s = new Socket("localhost",50001);
				InputStream is = s.getInputStream();
				OutputStream os = s.getOutputStream();
				
				
				System.out.print("Enter any number : " );
				double d1 = sc.nextDouble(); 
				System.out.print("Enter any number : " );
				double d2 = sc.nextDouble(); 
				System.out.print("Enter Any Operator Either + or - : " );
				String op = sc.next(); 
				
				DataOutputStream dos=new DataOutputStream(os);  
				dos.writeUTF(""+d1);
				dos.flush();
				dos.writeUTF(""+d2);
				dos.flush();
				dos.writeUTF(""+op);
				dos.flush();
				
				
				DataInputStream dis=new DataInputStream(is);  
				
				String  str=(String)dis.readUTF();  
				System.out.println("Ans : "+str);  
								
				
				s.close();		
		}
		catch(UnknownHostException unhe)
		{
			unhe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
}