package com.setPackage2;

import java.util.Comparator;

public class SortStudentName implements Comparator<StudentComparator>
{

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		return o1.name.compareTo(o2.name);
	}

}
