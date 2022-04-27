package com.learnJava.Supplier_PredefinedFunctionalInterfaces;

import java.util.function.Supplier;

//Write supplier function to generate 6 digit random OTP
public class OTPGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Supplier<String> otpSupplier = ()->{
			String otp="";
			for(int i=0; i<6; i++) {
				otp += (int)(Math.random()*9);
			}
			return otp;
		};
		
		System.out.println(otpSupplier.get());
		System.out.println(otpSupplier.get());
		System.out.println(otpSupplier.get());

	}

}
