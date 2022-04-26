package com.learnJava.Predicate_PredefinedFunctionalInterfaces;

import java.util.function.Predicate;

//program to display names starts with 'K' using predicate
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Sunny", "Adam", "Eve", "Kareena", "Keith"};
		
		Predicate<String> startsWithK = s -> s.startsWith("K");
		System.out.println("Names starting with K are:");
		m1(startsWithK, names);

	}
	public static void m1(Predicate<String> startsWithK,String[] names) {
		for(String name: names) {
			if(startsWithK.test(name)) {
				System.out.println(name);
			}
		}
	}

}
