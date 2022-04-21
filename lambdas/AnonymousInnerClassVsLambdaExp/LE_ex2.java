package com.learnJava.lambdas.AnonymousInnerClassVsLambdaExp;

interface DemoTest{
	public void m1();
}
public class LE_ex2 {

	int x = 100;
	public void m2()
	{
		DemoTest demoTest = () ->{							//Lambda expression replacing AIC_ex2 but behavior changes in this case wrt to instance variable
			int x = 999;									//local variable not instance variable
			System.out.println(this.x);						//100 since it is not a class so this will refer to class LE_ex2 instance variable
		};
		demoTest.m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LE_ex2 t= new LE_ex2();
		t.m2();

	}

}
