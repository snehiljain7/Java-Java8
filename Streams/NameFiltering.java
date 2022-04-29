package com.learnJava.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameFiltering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listOfNames = new ArrayList<>();
		
		listOfNames.add("Nagarjuna");
		listOfNames.add("Pavan");
		listOfNames.add("Chiranjeevi");
		listOfNames.add("Venkatesh");
		listOfNames.add("RaviTeja");
		
		List<String> list = listOfNames.stream().filter(s -> s.length()>=9).collect(Collectors.toList());	//filtering names with length greater than or equal to 9 and store them in another list
		System.out.println(list);
		
		long countNames = listOfNames.stream().filter(s -> s.length()>=9).count();	//count names with length greater than or equal to 9
		System.out.println("Number of Strings whose length is greater than or equal to 9: " + countNames);

	}

}
