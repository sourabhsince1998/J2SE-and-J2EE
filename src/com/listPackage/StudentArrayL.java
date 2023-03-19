package com.listPackage;

import java.util.ArrayList;

public class StudentArrayL 
{
	int age;
	String name;
	
	public StudentArrayL(int age, String name)
	{
		super();
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args)
	{
		StudentArrayL s1=new StudentArrayL(2,"Tom");
		
		StudentArrayL s2=new StudentArrayL(2,"Jerry");
		
		StudentArrayL s3=new StudentArrayL(2,"Smith");
		
		ArrayList<StudentArrayL> l=new ArrayList();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		for(StudentArrayL obj:l)
		{
			//System.out.println(obj);
		System.out.println("Name :"+obj.name+" Age :"+obj.age);
		}
		
	   ArrayList<Double> x=new ArrayList();
	       x.add(10.0);
	       x.add(20.5);
	       x.add(12.3);
	       for(double d:x)
	       {
	    	   System.out.println(d);
	    	  
	       }
	       }
	}
