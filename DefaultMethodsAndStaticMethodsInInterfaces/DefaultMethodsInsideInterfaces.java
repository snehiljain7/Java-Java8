package com.learnJava.DefaultMethodsAndStaticMethodsInInterfaces;

@FunctionalInterface
interface Interf{
	default void m1() {								//default is a keyword not a access modifier here
		System.out.println("Default methods");
	}
	void m2();
}
public class DefaultMethodsInsideInterfaces implements Interf{

	/*Can be overrided as well
	 * public void m1()	
	 * {
	 * System.out.println("My own implementation");
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodsInsideInterfaces d1 = new DefaultMethodsInsideInterfaces();
		d1.m1();
		
		Interf d2 = () -> {
			System.out.println("Lambda exp can be used for DefaultMethodsInsideInterfaces");
		};
		d2.m2();

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

}
