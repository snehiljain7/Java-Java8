package com.learnJava.Streams;

import java.util.ArrayList;
import java.util.List;
/*
 * forEach() takes lambda exp as argument and returns nothing. In short forEach takes in consumer.
 */
public class forEachProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList<>();
		l.add("A"); l.add("BB"); l.add("CCC");
		l.stream().forEach(s -> System.out.println(s));

	}

}
