package com.Jsp.Jdbcproject.Module1;
import java.sql.*;
import java.util.Scanner;
public class FetchingData {

	public static void main(String[] args) 
	{
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	String fetchData="select * from sourabh1.emp where empno=?";
try {
	
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("driver class loaded and registered");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sourabh1?user=root&password=Sourabh");
  System.out.println("connection estd between java app and databse");
  
  pstmt=con.prepareStatement(fetchData);
  System.out.println("platform created");
  
  System.out.println("setting the value for placeholder ");
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the empno whose record u want to fetch");
  int empno=sc.nextInt();
  pstmt.setInt(1,empno );
  rs=pstmt.executeQuery(); //5thstep
  if(rs.next())
  {
	 int eNum= rs.getInt("empno");
	 String eName= rs.getString(2);
	  double eSalary=rs.getDouble(3);
	  System.out.println("the empno is; "+eNum+" the NAME IS ; "+eName+" the salaryof emp is ;"+eSalary );
  }
  else {
	  System.err.println("no such record found  ");
  }
  
  }

 

catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
finally {
	if(con!=null &&pstmt!=null && rs!=null)
	{
		try {
			con.close();
			pstmt.close();
			rs.close();
			
		} 
		catch (SQLException e) 
		{

			e.printStackTrace();
		}
	System.out.println("all costly resources are closed ");	
	}
}
	}

}
