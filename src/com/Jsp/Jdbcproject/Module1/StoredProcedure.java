package com.Jsp.Jdbcproject.Module1;
import java.sql.*;
import java.util.Scanner;
public class StoredProcedure {

	public static void main(String[] args)
	
	{
	Connection con=null;
	CallableStatement cstmt=null;
	ResultSet rs=null;
	String spquery="{call sourabh1.getdetails(?)}";
      try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sourabh1?user=root&password=Sourabh");
		cstmt=con.prepareCall(spquery);//1 //write query directly here if u want
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the empno whch u want to fetch");
		int eid=sc.nextInt();
		cstmt.setInt(1,eid);//2
		rs=cstmt.executeQuery();//3
		if(rs.next())
		{
			int empno=rs.getInt(1);
			String name=rs.getString(2);
			double sal=rs.getDouble(3);
			System.out.println("empno is "+empno+" name "+name+"  and salary is "+sal);
			
		}
		else
		{
			System.err.println("no record found.....!");
		}
		 sc.close();
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      finally
      {
    	  if(con!=null & cstmt!=null &rs!=null)
    	  {
    		  try {
				con.close();
				cstmt.close();
				rs.close();
				System.out.println("all costly resources are closed");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  }
    		  
      }
	}

}
