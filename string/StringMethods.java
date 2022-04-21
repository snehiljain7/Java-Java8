package com.learnJava.string;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = new String("Hello");			//Object creation in Heap and SCP
		
		String s2 = new String("Hello");			//Object creation in Heap and no object creation in scp because Hello is already created once
		
		String s3 = "Hello";						//Object reference to already created object in SCP
		String s4 = "Hello";						//Object reference to already created object in SCP
		
		System.out.println(s1 == s2);				//Different memory addresses because new creates 2 different objects in heap
		
		System.out.println(s1 == s3);				//Different memory addresses one in Heap and other in SCP
		
		System.out.println(s4 == s3);				//Referencing to same SCP memory
		
		//Important methods in JAVA
		
		System.out.println(s1.charAt(3));			//gives char at particular index
		
		s2 = s2.concat("World");					//s += "World"
		
		System.out.println(s2);						//concatenated object
		
		System.out.println(s1.equals("Hello"));		//equals method compares content of 2 string objects including case
		
		System.out.println(s1.equals("HELLO"));
		
		System.out.println(s1.equalsIgnoreCase("HELLO"));	//equalsIgnoreCase method compares content of 2 string objects ignoring case
		
		System.out.println(s1.isEmpty());					//checks if string is empty or not, returns boolean
		
		System.out.println("".isEmpty());
		
		System.out.println(s1.length());					//return length of string
		
		System.out.println(s1.replace('l', 'L'));
		
		System.out.println(s1.indexOf('l'));
		
		System.out.println(s1.lastIndexOf('l'));
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.toUpperCase());
		
		System.out.println("  Hello World  ".trim());
		
		String s = new String("hello");
		s1 = s.toUpperCase();								//new object at runtime will be created
		s2 = s.toLowerCase();								//object will be reused at runtime in heap memory since s is all in lowercase
		System.out.println(s==s1);				
		System.out.println(s==s2);
		
		
	}

}
