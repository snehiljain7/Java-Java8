package com.learnJava.Serialization_Desialization;
class A{
	
	int i = 10;
}
public class MarkerExampleMain{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DemoMarkerClass demoMarkerClass = new DemoMarkerClass();
		if(demoMarkerClass instanceof MarkerInterface) {
			System.out.println("Object of DemoMarkerClass implementing MarkerInterface");
			demoMarkerClass.show();
			}
		else
			throw new Exception();
		
		A a = new A();
		XYZ xyz = new XYZ();
		
		xyz.display(a.i);
		

	}

}
