package net.javaguides.hibernate.dao;

import java.util.List;

import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.Transaction;


import net.javaguides.hibernate.model.Student;
import net.javaguides.hibernate.util.HibernateUtil;

public class StudentDao implements IStudentdao 
{
	@Override
	public void saveStudent(Student student)   {
		
		Transaction transaction=null;
		
		try(Session session =HibernateUtil.getSessionFactory().openSession())
		{
			
			transaction = session.beginTransaction(); 
			
			
			session.save(student);
			
			 
			transaction.commit();
			
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
		}
	}




@Override
public void updateStudent(Student student)   {
	
	Transaction transaction=null;
	
	try(Session session =HibernateUtil.getSessionFactory().openSession())
	{
		
		transaction = session.beginTransaction(); 
		
		
		session.saveOrUpdate(student);
		
		 
		transaction.commit();
		
	}catch(Exception e) {
		if(transaction!=null) {
			transaction.rollback();
		}
	}
}



@Override
public Student getStudentById(long id )   {
	
	Transaction transaction=null;
	Student student =null;
	
	try(Session session =HibernateUtil.getSessionFactory().openSession())
	{
		
		transaction = session.beginTransaction(); 
		
		student =session.get(Student.class,id);
		//student =session.load(Student.class,id);

		 
		transaction.commit();
		
	}catch(Exception e) {
		if(transaction!=null) {
			transaction.rollback();
		}
	}
	return student;
	}




@Override
public List<Student> getAllStudents( )   {
	
	Transaction transaction=null;
	List<Student> students =null;
	
	try(Session session =HibernateUtil.getSessionFactory().openSession())
	{
		
		transaction = session.beginTransaction(); 
		
		//student =session.get(Student.class,id);
		students =session.createQuery("from Student").list();

		 
		transaction.commit();
		
	}catch(Exception e) {
		if(transaction!=null) {
			transaction.rollback();
		}
	}
	return students;
	}


@Override
public void deleteStudent(long id )   {
	
	Transaction transaction=null;
	Student student =null;
	
	try(Session session =HibernateUtil.getSessionFactory().openSession())
	{
		
		transaction = session.beginTransaction(); 
		
		student =session.get(Student.class,id);
		//student =session.load(Student.class,id);
          
		session.delete(student);
		 
		transaction.commit();
		
	}catch(Exception e) {
		if(transaction!=null) {
			transaction.rollback();
		}
	}
	
	}
}






		
