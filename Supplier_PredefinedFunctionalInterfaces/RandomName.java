package com.learnJava.Supplier_PredefinedFunctionalInterfaces;

import java.util.function.Supplier;
//Get Random name by using supplier
public class RandomName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s1 = {"Adam", "Bob", "Cole", "Dan"};
		Supplier<String> s = () -> {
			
			int x = (int)(Math.random()*4);
			return s1[x];
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	
	}

}
