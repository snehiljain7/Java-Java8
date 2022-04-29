package com.learnJava.Comparable_and_Comparator.Comparable;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st) {
//		if (age == st.age)
//			return 0;
//		else if (age > st.age)
//			return 1;
//		else
//			return -1;
		return Integer.compare(this.age, st.age);
	}
}

