package com.learnJava.lambdas.AnonymousInnerClassVsLambdaExp;
interface Demo{
	public void m1();
}
public class AIC_ex2{

	

	int x = 100;										//instance variable
	public void m2() {
		// TODO Auto-generated method stub
		Demo obj = new Demo() {							//Anonymous Inner Class
			int x = 999;								//can declare instance variable inside inner class
			public void m1() {
				System.out.println(this.x);				//this refers to current obj of inner class
			}
		};
		obj.m1();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AIC_ex2 t = new AIC_ex2();
		t.m2();

	}
	

}
