package com.learnJava.Function_PredefinedFunctionalInterfaces;

import java.util.function.Function;

//Remove spaces from a given string
public class RemoveSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, String> removeSpaceFunction = s -> s.replaceAll(" ", "");
		
		System.out.println(removeSpaceFunction.apply(" Ad am "));

	}

}
