package com.setPackage2;

import java.util.Comparator;

public class SortStudentId implements Comparator<StudentComparator>
{
    
	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		return o1.id-o2.id;
	}
	
}
