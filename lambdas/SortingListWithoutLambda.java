package com.learnJava.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
//		if(o1>o2)
//			return -1;
//		else if (o1<o2)
//			return 1;
//		else
//			return 0;
		
		return (o1>o2)?-1:(o1<o2)?1:0;
			
	}
	
}
public class SortingListWithoutLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComparator myComparator = new MyComparator();
		
		ArrayList<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(0);
		list.add(1);
		list.add(30);
		list.add(25);
		
		System.out.println("Before Sorting " + list);
		
		Collections.sort(list);
		
		System.out.println("After Sorting " + list);

		Collections.sort(list, myComparator);
		System.out.println("After Sorting " + list);
	}

}
