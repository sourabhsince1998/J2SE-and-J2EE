package com.Jsp.Jdbcproject.Module1;
import java.sql.*;
public class BatchUpdate {

	public static void main(String[] args)
	{
		Connection con=null;
		Statement stmt=null;
		
		String inquery="insert into sourabh1.emp values(422,'Dinga Dingi',5000.00)";
		String delquery="delete from sourabh1.emp where empno=421";
	    String upquery="update sourabh1.emp set salary=75000.50,ename='Md syed' where empno=1";
		
			try {
				Class.forName("com.mysql.jdbc.Driver");//2
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sourabh1?user=root&password=Sourabh");//3
				stmt=con.createStatement();//4
				stmt.addBatch(inquery);
				stmt.addBatch(delquery);
				stmt.addBatch(upquery);
				int executeBatch[]=stmt.executeBatch();
				for(int a:executeBatch)
				{
					System.out.println("batch executed  "+a);
				}
			
			} 
			catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
