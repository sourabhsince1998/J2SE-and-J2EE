package com.jsp.ServletProject;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
public class MyServlet extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
{
	String firstName=req.getParameter("fnm"); // getparameter() is used to fetch the data from front end
	String lastName=req.getParameter("lnm");
	String email=req.getParameter("em");
	String phone=req.getParameter("ph");
	String address=req.getParameter("ad");
	
	PrintWriter out=resp.getWriter(); // get writer() is used to print 
	
	out.print( "<html><body bgcolor='blue'><h1>"
	+"Congrats Your Data is recorded succesfully "+firstName+"</h1></body></html");
	out.flush();
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sourabh1?user=root&password=Sourabh");
		PreparedStatement pstmt=con.prepareStatement("insert into sourabh1.user values(?,?,?,?,?)");
		pstmt.setString(1, firstName);
		pstmt.setString(2, lastName);
		pstmt.setString(3, email);
		pstmt.setString(4, phone);
		pstmt.setString(5, address);
		pstmt.execute();
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}

































































































































































