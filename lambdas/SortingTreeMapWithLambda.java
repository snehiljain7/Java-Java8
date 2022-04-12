package com.learnJava.lambdas;

import java.util.TreeMap;

public class SortingTreeMapWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		

		treeMap.put(2, "W");
		treeMap.put(4, "T");
		treeMap.put(5, "y");
		treeMap.put(3, "e");
		treeMap.put(1, "A");
		
		System.out.println("By Default" + treeMap);
		
		TreeMap<Integer, String> treeMap1 = new TreeMap<>(
				(o1,o2) -> (o1>o2)?-1:(o1<o2)?1:0
				);
		

		treeMap1.put(2, "W");
		treeMap1.put(4, "T");
		treeMap1.put(5, "y");
		treeMap1.put(3, "e");
		treeMap1.put(1, "A");
		
		System.out.println("Customised" + treeMap1);
		

	}

}
