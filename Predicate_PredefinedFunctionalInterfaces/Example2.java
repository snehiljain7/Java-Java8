package com.learnJava.Predicate_PredefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

//To check whether given length of string is greater than 5 or not

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p = s -> s.length()>5;
		
		System.out.println(p.test("abc"));
		System.out.println(p.test("abcdef"));
		
		
//Check whether given collection is empty or not
		
		Predicate<Collection> p1 = c -> c.isEmpty();

		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		System.out.println(p1.test(new ArrayList<>()));
		System.out.println(p1.test(list));
		System.out.println(p1.test(new HashSet()));
	}

}
