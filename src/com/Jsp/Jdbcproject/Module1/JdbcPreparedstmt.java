package com.Jsp.Jdbcproject.Module1;
import java.sql.*;
import java.util.Scanner;
public class JdbcPreparedstmt {
public static void main(String[] args) 
{
	Connection con=null;
	PreparedStatement pstmt=null;
	String inquery="insert into sourabh1.emp values(?,?,?)";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver class loaded and registered "); // first step
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sourabh1?user=root&password=Sourabh");
		System.out.println("connection estd bet java app and database"); //second step
		
		pstmt=con.prepareStatement(inquery);
		System.out.println("platfrom created ..."); //Third Step
		while(true) 
		{
		
		System.out.println("setting the values for placeholder ");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your empno");
		int a=sc.nextInt();
		System.out.println("enter your ename");
		String b=sc.next();
		System.out.println("enter your salary");
		double c=sc.nextDouble();
		
		pstmt.setInt(1,a );
		pstmt.setString(2,b);
		pstmt.setDouble(3,c);
		
		int e=pstmt.executeUpdate();
		System.out.println("record inserted "+e);
		
		System.err.println("do u want to insert more record [yes/no]");
		String choice=sc.next();
		if(choice.equalsIgnoreCase("no"))
		{
			break;
		}
		
		
		}
	
	} catch (ClassNotFoundException  | SQLException e) {
	
		e.printStackTrace();
	}
}
}
