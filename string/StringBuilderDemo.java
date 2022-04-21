package com.learnJava.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder builder = new StringBuilder();
		
		System.out.println("Capacity is : " + builder.capacity());
		
		System.out.println("Appending string " + builder.append("Adam"));
		
		System.out.println("Length is " + builder.length());
		
		System.out.println("Char at index 1 " + builder.charAt(1));
		
		builder.setCharAt(1, 'a');
		System.out.println("Setting char at index 1 " + builder);
		
		System.out.println("Inserting double at index 0 :" + builder.insert(0, 3.14));
		
		System.out.println("Deleting char from 0 to 3 : " + builder.delete(0, 4));
		
		System.out.println("Reversing StringBuilder :" + builder.reverse());
		
		
		//Now most of the above methods are of same return type and on them we can apply another method. Cocept is referred to as method chaining
		
		StringBuilder builder2 = new StringBuilder();
		
		builder2.append("Adam").append("and Eve").insert(10, "xyz").reverse();
		
		System.out.println("Result of method chaining is :" + builder2);
	}

}
