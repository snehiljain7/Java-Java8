package com.learnJava.Function_PredefinedFunctionalInterfaces;

import java.util.function.Function;

//Count number of spaces in a string
public class CountSpacesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, Integer> f = s -> s.length()-s.replaceAll(" ", "").length();
		
		System.out.println(f.apply("Adam Eve "));
	}

}
