package com.studentTesting;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student,Long>
{
	
Optional<Student> findByEmail(String emailS);

}
