

package com.jsp.First1Project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.dialect.MySQL5Dialect;
//import org.hibernate.dialect.MySQL8Dialect;

@Entity
public class Student {

	@Id
	private int usn;
	@Column(name="stud_name")
	private String name;
	private double marks;
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
}
