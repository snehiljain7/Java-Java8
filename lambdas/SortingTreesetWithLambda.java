package com.learnJava.lambdas;

import java.util.TreeSet;

public class SortingTreesetWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> treeSet= new TreeSet<>();
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(0);
		treeSet.add(5);
		treeSet.add(1);
		
		System.out.println("By Default" + treeSet);
		
		TreeSet<Integer> treeSet1= new TreeSet<>(
				(o1,o2) -> (o1>o2)?-1:(o1<o2)?1:0
				);
		
		treeSet1.add(10);
		treeSet1.add(20);
		treeSet1.add(0);
		treeSet1.add(5);
		treeSet1.add(1);
		
		System.out.println("Customised" + treeSet1);
	}

}
