package com.learnJava.lambdas;

@FunctionalInterface
interface Interface1{
	public int strLen(String s);
}

@FunctionalInterface
interface Interface2{
	public void sum(int a, int b);
}
public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 interface1 = (s) -> {System.out.println(s.length());
											return s.length();
		};
		
		interface1.strLen("abc");
		
		Interface2 interface2 = (a,b) -> System.out.println(a+b);			//Type Inference
		interface2.sum(2, 3); 

}
}
