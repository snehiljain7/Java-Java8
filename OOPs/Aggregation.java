package com.learnJava.OOPs;

class Address{
	private int houseNo;
	private String street;
	private String city;
	private String state;
	private String country;
	private String zip;
	public Address(int houseNo, String street, String city, String state, String country, String zip) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", zip=" + zip + "]";
	}
	
	
}


public class Aggregation {
/*It is a special form of Association where:  

It represents Has-A’s relationship.
It is a unidirectional association i.e. a one-way relationship. For example, a department can have students but vice versa is not possible and thus unidirectional in nature.
In Aggregation, both the entries can survive individually which means ending one entity will not affect the other entity.*/
	private String name;
	private int empid;
	private Address empAddress;
	public Aggregation(String name, int empid, Address empAddress) {
		super();
		this.name = name;
		this.empid = empid;
		this.empAddress = empAddress;
	}
	
	public void displayInfo() {
		System.out.println("name=" + name + ", empid=" + empid + ", empAddress=" + empAddress);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add1 = new Address(15205, "North Kierland Blvd. Suite 100","Scottsdale","AZ", "85254", "America");    
        Address add2 = new Address(2829, "Ala Kalanikaumaka, Kukui'ula Village", "Koloa","HI", "96756", "America");  
		Aggregation employee1 = new Aggregation("Adam", 101, add1);
		Aggregation employee2 = new Aggregation("Eve", 102, add2);
		
		employee1.displayInfo();
		employee2.displayInfo();

	}


}
