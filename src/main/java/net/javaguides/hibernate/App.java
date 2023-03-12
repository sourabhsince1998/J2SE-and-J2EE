package net.javaguides.hibernate;

import java.util.List;

import net.javaguides.hibernate.dao.IStudentdao;
import net.javaguides.hibernate.dao.StudentDao;
import net.javaguides.hibernate.model.Student;

public class App {

	public static void main(String[] args) 
	{
		IStudentdao  studentDao =new StudentDao(); 
		//test savestudent
		Student student =new Student("Krsih","gomb","krsih@gmail");
		
		studentDao.saveStudent(student);
		
		//test updatestudent
		student.setFirstName("Ram");
		studentDao.updateStudent(student);
	
		
		//test getstudentById
		Student student2=studentDao.getStudentById(1);
		System.out.println(student2);

		//test getallstudents
		List<Student> students=studentDao.getAllStudents();
		System.out.println(students);
		
	    students.forEach(student1->System.out.println(student1.getId()));
	     //students.forEach(student3->System.out.println(student3.getFirstName())); get student Firstname
	
	
	    //test deletestudent
	 //   studentDao.deleteStudent(student.getId());
	
	}

}
