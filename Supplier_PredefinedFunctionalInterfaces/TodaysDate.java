package com.learnJava.Supplier_PredefinedFunctionalInterfaces;

import java.util.Date;
import java.util.function.Supplier;

//Write a supplier to supply system date for today's.
public class TodaysDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> s = ()-> new Date();
		System.out.println(s.get());

	}

}
