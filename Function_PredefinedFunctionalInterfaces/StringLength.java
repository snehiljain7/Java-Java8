package com.learnJava.Function_PredefinedFunctionalInterfaces;

import java.util.function.Function;

//calculate length of a string
public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Hello"));				//Function can return any type while Predicate can return only boolean type
	}

}
