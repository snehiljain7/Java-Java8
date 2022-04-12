package com.learnJava.lambdas;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = new Runnable() {
			/**
			 * prior java 8
			 */
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<10; i++)
					System.out.println("Inside runnable 1");
			}
		};
		new Thread(runnable).start();
		
		
		/**
		 * Java 8
		 */
		
		Runnable runnable2 = () -> {
			for(int i=0; i<10; i++)
				System.out.println("Inside r2");
		};
		new Thread(runnable2).start();
		
		new Thread( () -> System.out.println("Inside r3")).start();
	}

}
