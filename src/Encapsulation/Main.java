package Encapsulation;

public class Main {
	
public static void main(String[] args) 
{
	System.out.println("Program started");
	
	Student s=new Student(1,"Dinga",98745632,'A');
	
	System.out.println("Student name is "+s.getName());
	
	System.out.println("Student name is"+s.getGrade());
	
	s.setPh(1234523);
	System.out.println("Student phone number is "+s.getPh());
	
	System.out.println("Program Ended");
	
}
}
