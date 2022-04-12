package com.learnJava.OOPs;

import java.util.ArrayList;
import java.util.List;

class Office{
	
	public String name;     
    public String address;
	public Office(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Office [name=" + name + ", address=" + address + "]";
	}  
	
    
    
}

class Company{
	//Company having more than one office
	
	public String name;
	List<Office> offices;
	public Company(String name, List<Office> offices) {
		super();
		this.name = name;
		this.offices = offices;
	}
	public String getName() {
		return name;
	}
	public List<Office> getOffices() {
		return offices;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", offices=" + offices + "]";
	}
	
	
	
}
public class Composition {
	/*Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.  

It represents part-of relationship.
In composition, both entities are dependent on each other.
When there is a composition between two entities, the composed object cannot exist without the other entity.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Office o1 = new Office("Google India Pvt. Ltd", "Banglore");     
          Office o2 = new Office("Google India Pvt. Ltd", "Gurgaon");  
          Office o3 = new Office("Google India Pvt. Ltd", "Hyderabad");  
          Office o4 = new Office("Google India Pvt. Ltd", "Mumbai");  
          
          List<Office> offices = new ArrayList<Office>();     
          offices.add(o1);     
          offices.add(o2);     
          offices.add(o3);   
          offices.add(o4); 
          
          Company company = new Company("Google", offices);     
          System.out.println(company.getName()+" offices:");  
          
          List<Office> obj= company.getOffices();
          
          for(Office office: obj) {
        	  System.out.println(office);    
          }

	}

}
