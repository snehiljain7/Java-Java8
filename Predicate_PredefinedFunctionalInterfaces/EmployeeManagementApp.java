package com.learnJava.Predicate_PredefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	private String name;
	private String designation;
	private double salary;
	private String city;
	public Employee(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + ", city=" + city
				+ "]";
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	public String getCity() {
		return city;
	}
	
	
	
	
	
}
public class EmployeeManagementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		populate(list);
		
		Predicate<Employee> managerPredicate = emp-> emp.getDesignation().equals("Manager");		//to get employees whose designation is manager
		System.out.println("Employees whose designation is manager");
		getEmployees(managerPredicate, list);
		
		Predicate<Employee> banglorePredicate = emp-> emp.getCity().equals("Bangalore");				//to get employees of Bangalore
		System.out.println("All employees of Bangalore");
		getEmployees(banglorePredicate, list);
		
		Predicate<Employee> salaryLessPredicate = emp-> emp.getSalary()<50000;						//emp info whose salaray is less than 50000
		System.out.println("emp info whose salaray is less than 50000");
		getEmployees(salaryLessPredicate, list);
		
		System.out.println("All managers from bangalore loc");
		getEmployees(managerPredicate.and(banglorePredicate), list);								//All managers from bangalore loc
		
		System.out.println("All Managers or employees whose salary is less than 50000");
		getEmployees(managerPredicate.or(salaryLessPredicate), list);								//managers or salary less than 50000
		
		System.out.println("All Employees who are not managers");
		getEmployees(managerPredicate.negate(), list);	
		
		Employee employee=new Employee("Adam", "CEO", 100000, "Pune");
		Predicate<Employee> CEO = Predicate.isEqual(employee);
		System.out.println("Checking if Adam is CEO: ");
		System.out.println(CEO.test(employee));
	}
	
	private static void getEmployees(Predicate<Employee> managerPredicate, ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		for(Employee employee: list) {
			if(managerPredicate.test(employee)) {
				System.out.println(employee);
			}
		}
		
		System.out.println("-----------------------------------------------");
	}

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Adam", "CEO", 100000, "Pune"));
		list.add(new Employee("Bob", "Lead", 50000, "Pune"));
		list.add(new Employee("Chris", "Lead", 50000, "Bangalore"));
		list.add(new Employee("David", "Developer", 40000, "Pune"));
		list.add(new Employee("Eve", "Developer", 40000, "Bangalore"));
		list.add(new Employee("Freyr", "Tester", 30000, "Pune"));
		list.add(new Employee("Greg", "Manager", 80000, "Bangalore"));
		list.add(new Employee("Helga", "Manager", 80000, "Pune"));
	}

}
