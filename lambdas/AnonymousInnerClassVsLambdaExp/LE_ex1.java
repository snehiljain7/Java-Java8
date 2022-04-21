package com.learnJava.lambdas.AnonymousInnerClassVsLambdaExp;

public class LE_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Runnable r = () -> {								//Lambda Expression
		for(int i = 0; i<10; i++) {
			System.out.println("Child Thread");
		}
	};
		
		Thread thread = new Thread(r);
		thread.start();
		
		for(int i = 0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}

}
