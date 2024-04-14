create or replace procedure usrinsert  (id IN NUMBER,  name IN VARCHAR2)  
is  
begin  
	insert into usertb values(id,name);  
end;  
/ 

*/

import java.sql.*;  
public class procedure
{  
	public static void main(String[] args) throws Exception
	{  
  		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");  
  		CallableStatement stmt=con.prepareCall("{call usrinsert(?,?)}");  
		stmt.setInt(1,1011);  
		stmt.setString(2,"amal");  
		stmt.execute();  
  		System.out.println("success");  
	}  
}  