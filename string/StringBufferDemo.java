package com.learnJava.string;


public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.capacity());
		
		buffer.append("abcdefghijklmnop");
		System.out.println(buffer.capacity());
		
		buffer.append("q");
		System.out.println(buffer.capacity());
		
		StringBuffer buffer2 = new StringBuffer(1000);
		System.out.println(buffer2.capacity());
		
		StringBuffer buffer3 = new StringBuffer("Hello");
		System.out.println(buffer3.capacity());
		
	}

}
