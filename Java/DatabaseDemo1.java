// Practical No : 9

import java.util.*;
import java.sql.*;

// java -classpath .;mysql-connector-java-5.1.6-bin.jar DatabaseDemo 

class DatabaseDemo1
{
		public static void main(String args[])
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","");
				Statement st=con.createStatement();
				
				String s1="select * from stud_tbl";
				
				ResultSet rs=st.executeQuery(s1);
				while(rs.next())
				{
					System.out.println("\n Id :" +rs.getString("stud_id") + "\n Name :" +rs.getString("stud_name") +
						"\n City :" +rs.getString("stud_city") + "\n Result :" +rs.getString("result"));
				}
				rs.close();
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