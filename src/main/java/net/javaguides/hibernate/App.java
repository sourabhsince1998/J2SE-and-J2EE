package net.javaguides.hibernate;

import javax.transaction.SystemException;


import net.javaguides.hibernate.dao.StudentDao;
import net.javaguides.hibernate.model.Student;

public class App {

	public static void main(String[] args) throws IllegalStateException, SystemException  {
		
		StudentDao studentDao=new StudentDao();
		
		Student student =new Student("Venkat","Rao","venky@gmail");
		
		
		studentDao.saveStudent(student);
		
        System.out.println(student.getId());
       // System.out.println(student.getFirstName());
	}

}
