package com.studentTesting;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.studentTesting.Student;
import com.studentTesting.StudentRepository;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentRepositoryTests 
{
	@Autowired
	private StudentRepository studentRepository;
	
	/*@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DataSource DataSource;	*/

 //JUnit test for save Student
	
	@Test
	@Order(1)
	@Rollback(value=false)
	public void saveStudentTest() {
		Student student=Student.builder()
		          .firstName("Ramesh")
				  .lastName("Fadatare")
				  .email("ramesh@gmail.com")
				  .build();
		
		
		studentRepository.save(student);
		
		Assertions.assertThat(student.getId()).isGreaterThan(0);
		
		}
	
	@Test
	@Order(2)
	public void getStudentTest()
	{
		Student student=studentRepository.findById(1L).get();
		
		Assertions.assertThat(student.getId()).isEqualTo(1L);
		
		
	}
	
	@Test
	@Order(3)
	public void getListOfStudentsTest()
	{
		
		List<Student> students=studentRepository.findAll();
		
		Assertions.assertThat(students.size()).isGreaterThan(0);
		
		
	}
	
	@Test
	@Order(4)
	@Rollback(value=false)
	public void updateStudentTest()
	{
		Student student=studentRepository.findById(1L).get();
		
		student.setEmail("ram@gmail.com");
		
				
		Student studentUpdated=studentRepository.save(student);
		
		Assertions.assertThat(studentUpdated.getEmail()).isEqualTo("ram@gmail.com");
		
		
	}
	
	@Test
	@Order(5)
	@Rollback(value=false)
	public void deletestudentest()
	{
		Student student=studentRepository.findById(1L).get();
		
		studentRepository.delete(student);
		
		Student student1=null;
		
		Optional<Student> optionalStudent=studentRepository.findByEmail("ram@gmail.com");
	
		if(optionalStudent.isPresent()) {
			student1=optionalStudent.get();
		}
		Assertions.assertThat(student1).isNull();
		
	
	
	}
	
	}
