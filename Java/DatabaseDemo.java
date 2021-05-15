// Practical No : 9

import java.util.*;
import java.sql.*;
/*java -classpath .;mysql-connector-java-5.1.6-bin.jar DatabaseDemo */

class DatabaseDemo
{
		public static void main(String args[])
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","");
				Statement st=con.createStatement();
				
				String s1="insert into stud_tbl Values (1,'Nil','junagadh',97.90)";
				st.executeUpdate(s1);
				
				String s2="insert into stud_tbl Values (2,'Nax','Ahmedabad',85.10)";
				st.executeUpdate(s2);
				
				System.out.println("Record inserted.....");
				
				st.close();
				con.close();
			}
			catch(ClassNotFoundException cfe)
			{
				cfe.printStackTrace();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}