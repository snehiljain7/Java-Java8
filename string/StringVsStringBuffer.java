package com.learnJava.string;

public class StringVsStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CASE 1
		String s = new String("Hello");
		
		s.concat("World");				//new object is created here and s remains unchanged since we are not using any ref variable here therefore it will go to garbage collection
		System.out.println(s);			//Hello because String object 's' is immutable
		
		StringBuffer sb = new StringBuffer("Hello ");
		
		sb.append("World");
		System.out.println(sb);			//Hello World because StringBuffer object 'sb' is mutable
		
		
		//CASE 2
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));

	}

}
