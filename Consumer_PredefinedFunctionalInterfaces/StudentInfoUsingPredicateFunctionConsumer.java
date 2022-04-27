package com.learnJava.Consumer_PredefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


//Display student using Predicate Function and Consumer
//Find grades, get student with marks above 60 and display their info
class Student{
	private String name;
	private double marks;
	public Student(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	
}
public class StudentInfoUsingPredicateFunctionConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> listOfStudents = new ArrayList<>();
		populate(listOfStudents);
		
		Predicate<Student> p1 = s -> s.getMarks()>=60;
		
		Function<Student, String> f1 = s -> {
			double marks = s.getMarks();
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
			else{
				return "E[Failed]";
			}
		};
		
		Consumer<Student> c1 = s-> {
			System.out.println("Name: " + s.getName());
			System.out.println("Marks: " + s.getMarks());
			System.out.println("Grade: " + f1.apply(s));
			System.out.println();
		};
		
		for(Student student: listOfStudents) {
			if(p1.test(student)) {
				c1.accept(student);
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
