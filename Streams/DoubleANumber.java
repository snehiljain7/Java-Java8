package com.learnJava.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Double every element in a collection and add into another collection
/*
 * map() is used to create a separate new object for every object in the collection based on
 * some function we should go for mapping
 */
public class DoubleANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);
		System.out.println(list);
		
		List<Integer> list2 = list.stream().map(I -> I*2).collect(Collectors.toList());			//
		System.out.println(list2);

	}

}
