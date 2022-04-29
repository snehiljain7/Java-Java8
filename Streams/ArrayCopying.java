package com.learnJava.Streams;

import java.util.ArrayList;
import java.util.List;

public class ArrayCopying {

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
		
		Integer[] arr = list.stream().toArray(e -> new Integer[e]);			//toArray() is used to copy elements present in stream into specified array
		
		for(Integer x: arr) {
			System.out.println(x);
		}
	}

}
