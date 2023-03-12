package net.javaguides.hibernate.dao;

import javax.transaction.SystemException;
//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.javaguides.hibernate.model.Student;
import net.javaguides.hibernate.util.HibernateUtil;

public class StudentDao 
{
	public void saveStudent(Student student) throws IllegalStateException, SystemException {
		Transaction transaction=null;
		
		//auto close session object
		try (Session session= HibernateUtil.getSessionFactory().openSession())
	     
		{
			//start transaction
			transaction=session.beginTransaction();
			
			//save transaction
			session.save(student);
		
			//commit transaction
			transaction.commit();
			
		}
		catch(Exception e) {
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
	}
}
			
			
			
	

