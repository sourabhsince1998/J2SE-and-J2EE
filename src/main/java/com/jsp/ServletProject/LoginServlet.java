
package com.jsp.ServletProject;

import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		String email=req.getParameter("em");
		String password=req.getParameter("pa");
		PrintWriter out=resp.getWriter();
		
	out.flush();
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sourabh1?user=root&password=Sourabh");
		PreparedStatement pstmt=con.prepareStatement("select * from sourabh1.user where email=? and password=?");
	    pstmt.setString(1, email);
	    pstmt.setString(2, password);
	
	    ResultSet rs=pstmt.executeQuery();
	     if(rs.next())
	     {
	    	 out.print("<html><body bgcolor='green' align='center'><h1> Mr/Ms"
	    				+"Congrats Login is succesfull "+rs.getString(1)+"</h1></body></html"); 
	     }
	     else
	     {
	    	 out.print("<html><body bgcolor='red' align='center'><h1>"
	    				+"Invalid User <h2>Check Your EmailId and Password "+email+"</h1></body></html"); 
	     }
	}
	     catch(ClassNotFoundException | SQLException e)
	     {
	    	 e.printStackTrace();
	     }
	     }
	
	}
	

