package com.learnJava.Predicate_PredefinedFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateJoiningExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {0,5,10,15,20,25,30};
		
		Predicate<Integer> p1 = i->i>10;		//check integer gretaer than 10 or not;
		Predicate<Integer> p2 = i->i%2==0;		//check integer even or not
		
		System.out.println("Numbers greater than 10 are: ");
		m1(p1, x);
		
		System.out.println("Even numbers are: ");
		m1(p2, x);
		
		System.out.println("Numbers not greater than 10 are: ");
		m1(p1.negate(), x);
		
		System.out.println("Numbers greater than 10 and even are: ");
		m1(p1.and(p2), x);
		
		System.out.println("Numbers greater than 10 or even are: ");
		m1(p1.or(p2), x);
		
		System.out.println("Numbers greater than 10 and not even are: ");
		m1(p1.and(p2.negate()), x);

	}
	
	public static void m1(Predicate<Integer> p, int[] x) {
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.print(x1 + " ");
			}
			
		}
		System.out.println();
	}

}
