package com.learnJava.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//filter out even numbers from a list to another list
/*
 * when we want to filter some elemets from the collection based on boolean condition then we sshould go for filtering
 */
public class EvenNum {

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
		
		List<Integer> listOfEvens = list.stream().filter(I -> I%2==0).collect(Collectors.toList());
		System.out.println(listOfEvens);

	}

}
