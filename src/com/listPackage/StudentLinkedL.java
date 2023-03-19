package com.listPackage;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentLinkedL
{
	int age;
	String name;
	
	public StudentLinkedL(int age, String name)
	{
		super();
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args)
	{
		StudentLinkedL s1=new StudentLinkedL(2,"Tom");
		
		StudentLinkedL s2=new StudentLinkedL(2,"Jerry");
		
		StudentLinkedL s3=new StudentLinkedL(2,"Smith");
		
		LinkedList<StudentLinkedL> l=new LinkedList();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		for(StudentLinkedL obj:l)
		{
		 //System.out.println(obj);
		System.out.println("Name :"+obj.name+" Age :"+obj.age);
		}
		
		LinkedList<Double> x=new LinkedList();
	       x.add(10.0);
	       x.add(20.5);
	       x.add(12.3);
	       for(double d:x)
	       {
	    	  System.out.println(x);
	    	  
	       }

	}
}
