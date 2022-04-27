package com.learnJava.Function_PredefinedFunctionalInterfaces;

import java.util.function.Function;

//Given an integer number return square of an integer
public class SquareOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> squareFunction= n -> n*n;
		
		System.out.println(squareFunction.apply(20));
		System.out.println(squareFunction.apply(2));

	}

}
