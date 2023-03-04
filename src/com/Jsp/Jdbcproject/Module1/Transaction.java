package com.Jsp.Jdbcproject.Module1;
import java.sql.*;
import java.util.Scanner;
public class Transaction {

	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2=null;
		//Savepoint sp=null;
    try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sourabh1?user=root&password=Sourabh");
		con.setAutoCommit(false);
		pstmt1=con.prepareStatement("insert into sourabh1.stud1 values(?,?,?)");
		pstmt2=con.prepareStatement("insert into sourabh1.stud2 values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter usn");
		
		
		System.out.println("inserting values for stud1");
		System.out.println("enter usn");
		int a=sc.nextInt();
		pstmt1.setInt(1,a);
		System.out.println("enter name");
		String b=sc.next()
;		pstmt1.setString(2,b);
		System.out.println("enter marks");
		double c=sc.nextDouble();
		pstmt1.setDouble(3,c);
		pstmt1.execute();
		
		System.out.println("inserting values for stud2");
		System.out.println("enter usn");
		int d=sc.nextInt();
		System.out.println("enter name");
		String e=sc.next();
	    System.out.println("enter marks");
		double f=sc.nextDouble();
		//sp=con.setSavepoint();
				
		
		pstmt2.setInt(1,d);
		pstmt2.setString(2,e);
		pstmt2.setDouble(3,f);
		pstmt2.execute();
		con.commit();
		sc.close();		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		try {
			con.rollback();// pass sp here 
			               //write as con.commit();			
			System.out.println("rollback called");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.printStackTrace();
	}
    finally
    {
    	if(con!=null & pstmt1!=null & pstmt2!=null )
    	{
    		try {
				con.close();
				pstmt1.close();
				pstmt2.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
	}

}
