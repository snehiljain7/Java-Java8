package com.learnJava.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNumbers {

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
		
		List<Integer> l1 = list.stream().sorted().collect(Collectors.toList());					//natural sorting order
		System.out.println(l1);
		
		List<Integer> l2 = list.stream().sorted((i1,i2) -> Integer.compare(i2, i1)).collect(Collectors.toList()); //customized sorting
		System.out.println(l2);

	}

}
