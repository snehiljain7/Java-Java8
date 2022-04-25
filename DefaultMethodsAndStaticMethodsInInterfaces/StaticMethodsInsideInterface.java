package com.learnJava.DefaultMethodsAndStaticMethodsInInterfaces;

interface Interf1{
	public static void m1() {
		System.out.println("Inside Static method");
	}
}
public class StaticMethodsInsideInterface implements Interf1{

	public static void main(String[] args) {
		
		// m1()				//does not belong to implementation class so won't work
		StaticMethodsInsideInterface s= new StaticMethodsInsideInterface();
		//s.m1()			//wont work for the same reason Java interface static methods is part of interface not of implementation class
		//StaticMethodsInsideInterface.m1();		//wont work for the same reason Java interface static methods is part of interface not of implementation class
		
		Interf1.m1();			//Java interface static methods belongs to interface only
	}
}
 