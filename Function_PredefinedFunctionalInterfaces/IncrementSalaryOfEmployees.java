package com.learnJava.Function_PredefinedFunctionalInterfaces;


import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

//Increment salary of employees whose salary is less than 3500 by 477 using predicate and function
//class Employee is predefined in TotalSalaryOfAllEmployees

public class IncrementSalaryOfEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> listOfEmployees = new ArrayList<>();
		populate(listOfEmployees);
		System.out.println("Before Increment: " + listOfEmployees);
		Predicate<Employee> p1 = e -> e.getSalary()<3500;
		
		Function<Employee, Employee> f1 = e -> {
				e.setSalary(e.getSalary()+477);
				return e;
		};
		
		for(Employee employee: listOfEmployees) {
			if(p1.test(employee)) {
				f1.apply(employee);
			}
		}
		
		System.out.println("After Increment:  " + listOfEmployees);

	}

	private static void populate(ArrayList<Employee> listOfEmployees) {
		// TODO Auto-generated method stub
		listOfEmployees.add(new Employee("Adam", 1000));
		listOfEmployees.add(new Employee("Becky", 2000));
		listOfEmployees.add(new Employee("Christy", 3000));
		listOfEmployees.add(new Employee("Dan", 4000));
		listOfEmployees.add(new Employee("Eve", 5000));
		
	}
	
	

}