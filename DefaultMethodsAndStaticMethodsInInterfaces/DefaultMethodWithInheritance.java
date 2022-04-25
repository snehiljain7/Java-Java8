package com.learnJava.DefaultMethodsAndStaticMethodsInInterfaces;

interface Left{
	default void m1() {
		System.out.println("Left Default Method");
	}
}

interface Right{
	default void m1() {
		System.out.println("Right Default Method");
	}
}


public class DefaultMethodWithInheritance implements Left, Right{	//2 solutions to resolve ambiguity caused due to 2 same methods having same name from 2 different interfaces

	/*																//1. override default method in left or right as prefered
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Left.super.m1();
	}
*/

	@Override
	public void m1() {												//2. Provide your own implementation by overriding default method
		System.out.println("My own implementation");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodWithInheritance d1 = new DefaultMethodWithInheritance();
		d1.m1();

	}


}
