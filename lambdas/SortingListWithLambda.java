package com.learnJava.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 
public class SortingListWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(0);
		list.add(1);
		list.add(30);
		list.add(25);
		
		System.out.println("Before Sorting " + list);
		
		Collections.sort(list);
		
		System.out.println("After Sorting " + list);

		Collections.sort(list,(Integer o1,Integer o2) -> (o1>o2)?-1:(o1<o2)?1:0);
		
		System.out.println("After Customized Sorting " + list);
		
	}

}
