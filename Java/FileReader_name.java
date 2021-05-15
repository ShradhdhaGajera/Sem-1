// Practical No : 13

import java.io.*;

public class FileReader_name
{
	
  public static void main(String[] args)throws Exception
  {
  
	File file = new File("E:\\12008142\\java\\test.txt");
  
	BufferedReader br = new BufferedReader(new FileReader(file));
  
	String st;
	while ((st = br.readLine()) != null)
		System.out.println(st);
  }
  
}