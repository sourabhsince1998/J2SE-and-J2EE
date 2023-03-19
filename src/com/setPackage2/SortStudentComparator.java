package com.setPackage2;

import java.util.TreeSet;

public class SortStudentComparator
{
	public static void main(String[] args)
	{
		StudentComparator s1=new StudentComparator(21,"Dinga");
		StudentComparator s2=new StudentComparator(22,"Dingi");
		StudentComparator s3=new StudentComparator(23,"Dinguu");
		
		SortStudentId id=new SortStudentId();
	//	SortStudentName name=new SortStudentName();
		TreeSet<StudentComparator> t=new TreeSet(id);
	//	TreeSet<StudentComparator> t1=new TreeSet(name); sorting on name
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		for (StudentComparator std:t)
		{
			System.out.println(std);
		}
		
		}
}
