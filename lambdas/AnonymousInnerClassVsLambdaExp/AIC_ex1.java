package com.learnJava.lambdas.AnonymousInnerClassVsLambdaExp;

public class AIC_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {						//Anonymous Inner Class
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i<10; i++) {
					System.out.println("Child Thread");
				}
				
			}
		};
		
		Thread thread = new Thread(r);
		thread.start();
		
		for(int i = 0; i<10; i++) {
			System.out.println("Main Thread");
		}

	}

}
