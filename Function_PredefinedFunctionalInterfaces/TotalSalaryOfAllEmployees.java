package com.learnJava.Function_PredefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Function;

//Find total salary of all employees
class Employee{
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	};
	
	
}
public class TotalSalaryOfAllEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> listOfEmployees = new ArrayList<>();
		populate(listOfEmployees);
		
		Function<ArrayList<Employee>, Double> f = employeesList -> {
			double totalSalary = 0;
			for(Employee employee: employeesList) {
				totalSalary += employee.getSalary();
			}
			return totalSalary;
		};
		
		System.out.println("Total salary: " + f.apply(listOfEmployees));

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
