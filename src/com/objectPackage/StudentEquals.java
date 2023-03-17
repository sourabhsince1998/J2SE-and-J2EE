package com.objectPackage;

public class StudentEquals 
{
	int age;

	public StudentEquals(int age)
	{
		super();
		this.age = age;
	}
	
	public boolean equals(Object obj)
	{
		StudentEquals s=(StudentEquals) obj;
		return this.age==s.age;
	}
	public static void main(String[] args)
	{
		StudentEquals s1=new StudentEquals(21);
		StudentEquals s2=new StudentEquals(21);
		System.out.println(s1.equals(s2));
	}

}
