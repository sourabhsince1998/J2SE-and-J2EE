package net.hibernate.java;

import org.hibernate.Transaction;

import org.hibernate.Session;
//import org.hibernate.SharedSessionContract;

//import org.hibernate.*;

import net.javaguides.hibernate.model.Student;
import net.javaguides.hibernate.util.Hibernateutil;


public class App 
{
	//private static SharedSessionContract session;

	public static void main(String[] args) {
		Student student=new Student("ramkumarsingh","fadakre12","ramesh123@gmail");
	   
	    Transaction transaction=null;
	   // Session session = sessionFactory.openSession();
	    try(Session session= Hibernateutil.getSessionFactory().openSession())
	    {
	    	//start transaction 
	    	transaction=session.beginTransaction();
	    	
	    	session.save(student);
	    	
	    	transaction.commit();
	    	

	    	//session.getTransaction().commit();
	    	//session.close();*/
	    	 
	    	
	    }
	   
	    catch(Exception e) 
	    	{
	    	if(transaction!=null)
	    	{
	    		transaction.rollback();
	    	    
	    		}
	    	/* finally {
	 	    	SharedSessionContract session = null;
				session.close();
	 	    }*/
	 	    
	  
	    
	    	}
	 	
	    }
}
	


