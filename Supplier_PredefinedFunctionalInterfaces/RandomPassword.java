package com.learnJava.Supplier_PredefinedFunctionalInterfaces;

import java.util.function.Supplier;

/*
 * Generate Random Password with some rules
 * 1) Length should be of 8 characters long
 * 2) 2,4,6,8 places only digits
 * 3) 1,3,5,7 places should be only uppercase alphabet symbols with special charaters allowed @#$
 */
public class RandomPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pwd = "";
		Supplier<Integer> numberSupplier = () -> (int)(Math.random()*10);
		
		String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
		
		Supplier<Character> randomCharSupplier = ()-> symbols.charAt((int)(Math.random()*28));
		
		for(int i=0;i<8; i++) {
			if(i%2==0) {
				pwd += numberSupplier.get();
			}
			else {
				pwd += randomCharSupplier.get();
			}
		}
		System.out.println("Random generated password is: " + pwd);
		
		
		

	}

}
