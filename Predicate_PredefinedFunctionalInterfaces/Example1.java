package com.learnJava.Predicate_PredefinedFunctionalInterfaces;

import java.util.function.Predicate;

//Check whether integer is greater than 10 or not
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub						//Predicate is a boolean valued functional interface.
																//returns true or false for some condition
		
		Predicate<Integer> predicate = I-> I>10;				//using lambda expression for FI predicate
		
		System.out.println(predicate.test(100));				//test() method is declared in Predicate(I)
		System.out.println(predicate.test(1));

	}

}
