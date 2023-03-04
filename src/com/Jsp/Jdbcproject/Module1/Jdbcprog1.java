package com.Jsp.Jdbcproject.Module1;
import java.sql.*;
public class Jdbcprog1 {
public static void main(String[] args) {
	Connection con=null;
	Statement stmt=null;
	String query="insert into sourabh1.emp values(1215,'Mr Uddam',50000.50) ";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver class loaded and registered");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sourabh1?user=root&password=Sourabh");
			
			stmt=con.createStatement();
			System.out.println("platfom created ..");
			
			System.out.println("connection estd between java app and database");
			boolean b=stmt.execute(query);
			
			System.out.println("record inserted.."+b);
			System.out.println("query executed...");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	
	

}
}
