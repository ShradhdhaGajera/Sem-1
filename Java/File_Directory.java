// Practical No : 11


import java.io.*;

class File_Directory
{
	public static void main(String [] args)
	{
		
		
		File f = new File(args[0]);
		String[] files=f.list();
		
		if(f.isDirectory())
		{
			System.out.println("This is Directory");
			
			if (files.length == 0)
			{
				System.out.println("The directory is empty");
			} 
			else
			{
				for (String aFile : files) 
				{
					System.out.println(aFile);
				}
			}
		
			
		}
		else if(f.isFile())
		{
			System.out.println("This is File");
			System.out.println(f.length());

		}
		else
		{		
			System.out.println("Error");
		}
	}
}