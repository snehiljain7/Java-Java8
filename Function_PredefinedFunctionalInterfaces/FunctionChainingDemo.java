package com.learnJava.Function_PredefinedFunctionalInterfaces;

import java.util.function.Function;

//Difference between andThen and compose
public class FunctionChainingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Integer> f1 = i -> i+i;		//returns double of a number
		
		Function<Integer, Integer> f2 = i -> i*i;		//returns square of a number
		
		System.out.println("Result using andThen is: " + f1.andThen(f2).apply(3));
		System.out.println("Result using compose is: " + f1.compose(f2).apply(3));
	}

}
