package com.learnJava.OOPs;

import java.util.ArrayList;
import java.util.List;

class Car{
	public String name, color, model;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", model=" + model + "]";
	}
	
	
	
	
}

class Person{
	
	private String name;
	List<Car> cars;
	public Person(String name, List<Car> cars) {
		super();
		this.name = name;
		this.cars = cars;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", cars=" + cars + "]";
	}
	
	
}
public class Association {
	//Association is a relation between two separate classes which establishes through their Objects. 
	//Association can be one-to-one, one-to-many, many-to-one, many-to-many.

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.setName("Ford BRONCO OUTER BANKS SUV");   
        car1.setColor("Black");  
        car1.setModel("2021");  
        Car car2 = new Car();    
        car2.setName("HONDA ODYSSEY EX-L MINIVAN");  
        car2.setColor("Brown");  
        car2.setModel("2019"); 
        
        List<Car> listOfCars = new ArrayList();
        listOfCars.add(car1);
        listOfCars.add(car2);
        Person person = new Person("Lucider", listOfCars);
        
        System.out.println(person);
	}

}
