package com.learnJava.Streams;

import java.util.ArrayList;
import java.util.List;

/*
 * min() and max() return minimum and maximum from a list which is sorted using specified comparator
 */
public class MinMax {

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
		
		Integer min = list.stream().min((i1,i2) -> Integer.compare(i1, i2)).get();
		
		Integer max = list.stream().max((i1,i2) -> Integer.compare(i1, i2)).get();
		
		System.out.println(min);
		System.out.println(max);
	}

}
