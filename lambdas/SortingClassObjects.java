package com.learnJava.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}
	
	
}
public class SortingClassObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "A"));
		employees.add(new Employee(5, "s"));
		employees.add(new Employee(3, "g"));
		employees.add(new Employee(2, "Z"));
		employees.add(new Employee(4, "H"));
		
		System.out.println("Before Sorting " + employees);
		Collections.sort(employees, 
							(e1,e2) -> (e1.id<e2.id)?-1:(e1.id>e2.id)?1:0 
									);
		System.out.println("After Sorting " + employees);

	}

}
