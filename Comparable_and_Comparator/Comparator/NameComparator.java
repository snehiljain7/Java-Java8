package com.learnJava.Comparable_and_Comparator.Comparator;

import java.util.Comparator;

class NameComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}
