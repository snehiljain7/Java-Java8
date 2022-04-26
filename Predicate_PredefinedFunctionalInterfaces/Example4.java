package com.learnJava.Predicate_PredefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

//Remove null values and Empty string from given list
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"Adam", null, "", "Eve", "", null};
		ArrayList<String> list = new ArrayList<>();
		
		Predicate<String> removeNull = s->s != null && s.length()!=0;
		
		for(String name: names) {
			if(removeNull.test(name)) {
				list.add(name);
			}
		}
		
		System.out.println("Valid list is: " + list);
		
	}

}
