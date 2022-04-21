package com.learnJava.Serialization_Desialization;


public class DemoMarkerClass implements MarkerInterface{

	public void show(){
			System.out.println("Hello I am object of DemoMarkerClass if you want to use this class object you need to implement MarkerInterface in it");
	}
	
	
}

class XYZ implements MarkerInterface{
	public void display(int i) throws Exception {
		if(this instanceof MarkerInterface)
		System.out.println(i);
		else
			throw new Exception();
	}
}
