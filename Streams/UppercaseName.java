package com.learnJava.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<String> listOfNames = new ArrayList<>();
		
		listOfNames.add("Nagarjuna");
		listOfNames.add("Pavan");
		listOfNames.add("Chiranjeevi");
		listOfNames.add("Venkatesh");
		listOfNames.add("RaviTeja");
		
		List<String> list = listOfNames.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(list);
	}

}
