package com.learnJava.Consumer_PredefinedFunctionalInterfaces;

import java.util.function.Consumer;

//Print string using Consumer interface
public class PrintString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> consumer= s->System.out.println(s);
		
		consumer.accept("Hello");
		consumer.accept("Adam");

	}

}
