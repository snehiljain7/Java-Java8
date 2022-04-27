package com.learnJava.Function_PredefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

//Find student grade based on their marks and also use Predicate to find name of students who scored above 60
class Student{
	private String name;
	private int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	
}
public class FindStudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> listOfStudents = new ArrayList<>();
		populate(listOfStudents);
		
		Function<Student, String> f = s -> {
			int marks = s.getMarks();
			if(marks>=80) {
				return "A[Distinction]";
			}
			else if(marks>=60) {
				return "B[First Class]";
			}
			else if(marks>=50) {
				return "C[Second Class]";
			}
			else if(marks>=35) {
				return "D[Third Class]";
			}
			else {
				return "E[Failed]";
			}
				
		};
		for(Student student:listOfStudents) {
			System.out.println("Name: " + student.getName());
			System.out.println("Marks: " + student.getMarks());
			System.out.println("Grade: " + f.apply(student));
			System.out.println();
		}
		
		Predicate<Student> p1 = s -> s.getMarks()>=60;
		System.out.println("Passed with marks above 60: ");
		for(Student student:listOfStudents) {
			if(p1.test(student)) {
				System.out.println("Name: " + student.getName());
				System.out.println("Marks: " + student.getMarks());
				System.out.println("Grade: " + f.apply(student));
				System.out.println();
			}
			
		}
		
		

	}

	private static void populate(ArrayList<Student> listOfStudents) {
		// TODO Auto-generated method stub
		listOfStudents.add(new Student("Adam", 100));
		listOfStudents.add(new Student("Bob", 65));
		listOfStudents.add(new Student("Charlie", 55));
		listOfStudents.add(new Student("Dreck", 45));
		listOfStudents.add(new Student("Rock", 25));
		
	}

}
