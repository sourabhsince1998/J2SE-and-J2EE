package com.setPackage2;

public class StudentComparator
{
	int id;
	String name;
	public StudentComparator(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "StudentComparator [id=" + id + ", name=" + name + "]";
	}
	
	}
