package com.learnJava.ExceptionHandling;

public class DefaultExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		doStuff();
	}

	private static void doStuff() {
		// TODO Auto-generated method stub
		doMoreStuff();
	}

	private static void doMoreStuff() {
		// TODO Auto-generated method stub
		System.out.println(10/0);
	}

}
