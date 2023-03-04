package com.Jsp.Jdbcproject.Module1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcPreparedstmt2 {

	public static void main(String[] args) {

		Connection con=null;
		PreparedStatement pstmt=null;
		String inquery="delete from sourabh1.emp where empno=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver class loaded and registered ");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sourabh1?user=root&password=Sourabh");
			System.out.println("connection estd bet java app and database");
			pstmt=con.prepareStatement(inquery);
			System.out.println("platfrom created ...");
			Scanner sc=new Scanner(System.in);
			System.out.println("delete record which you want ");
			int a=sc.nextInt();
			pstmt.setInt(1, a);
			pstmt.execute();
;			
			System.out.println("record deleted");
			
		
			
			
			
		} catch (ClassNotFoundException  | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
