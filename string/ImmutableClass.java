package com.learnJava.string;

final public class ImmutableClass {
	
	private int i;
	
	public ImmutableClass(int i) {
		super();
		this.i = i;

		}
	
	public ImmutableClass modify(int i) {
		
		if(this.i == i) {
			return this;
		}
		else {
			return new ImmutableClass(i);
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImmutableClass i1 = new ImmutableClass(10);
		ImmutableClass i2 = i1.modify(100);						//new object will be created
		ImmutableClass i3 = i1.modify(10);						//same object will be used
		
		System.out.println(i1==i2);
		System.out.println(i1==i3);

	}


}
