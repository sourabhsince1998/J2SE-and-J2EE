package com.objectPackage;

public class EmployeetoString 
{
	String name;
	double salary;
	public EmployeetoString(String name, double salary) 
	{
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString ()
	{
		return " Salary of "+name+" is "+ salary;
		
	}
	public static void main(String[] args) {
		EmployeetoString e1=new EmployeetoString ("Tom", 25000);
		
		EmployeetoString e2=new EmployeetoString ("Jerry", 10000);
		System.out.println(e1);
		System.out.println(e2);
		
	}

}
