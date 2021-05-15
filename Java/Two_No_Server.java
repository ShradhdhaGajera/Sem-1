// Practical No : 16

import java.net.*;
import java.io.*;

class Two_No_Server
{
	public static void main(String [] args)
	{
		
		try
		{
				
				ServerSocket ss = new ServerSocket(50001);
				while(true)
				{			
					
					Socket s  = ss.accept();
					InputStream is = s.getInputStream();
					OutputStream os = s.getOutputStream();
					
					
					DataInputStream dis=new DataInputStream(is);
							
					double d1  = Double.parseDouble(dis.readUTF());
					double d2  = Double.parseDouble(dis.readUTF());
					String op  = dis.readUTF();
					double ans=0;
					
					DataOutputStream dos=new DataOutputStream(os);  
					
					if(op.equals("+"))
					{
						ans=d1+d2;
						
					}
					else if (op.equals("-"))
					{
						ans=d1-d2;
					}
										
					
					dos.writeUTF(""+ans);
					dos.flush();
									
					
					s.close();		
				}
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