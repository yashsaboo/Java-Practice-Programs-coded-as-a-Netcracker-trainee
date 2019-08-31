package com.netcracker.Collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student stud1, Student stud2) {
		return stud1.getName().compareTo(stud2.getName());
	}
}
