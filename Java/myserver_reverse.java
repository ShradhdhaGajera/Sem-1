// Practical No : 17

import java.io.*;
import java.net.*;

public class myserver_reverse
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(6666);  
			 Socket s =  ss.accept();
			 DataInputStream dis = new DataInputStream(s.getInputStream());
			 String str = (String)dis.readUTF();
			
			 System.out.println("ans = " +str );
			    byte[] strAsByteArray = str.getBytes();
 
			byte[] result = new byte[strAsByteArray.length];
 
        
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
		        System.out.println(new String(result));
		
			
			dos.writeUTF("ans1 ="+result);
			dos.flush();
			dos.close();
			ss.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}