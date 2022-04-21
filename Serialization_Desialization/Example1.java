package com.learnJava.Serialization_Desialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{						
	int i = 10;
	int j = 20;
}
public class Example1{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		System.out.println("Before Serialization :" + d1.i + " " + d1.j);
		
		FileOutputStream foo = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Demo d2 = (Demo) ois.readObject();
		
		System.out.println("After deserialization :" + d2.i + " " + d2.j);
		
		

	}

}
