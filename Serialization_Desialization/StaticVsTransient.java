package com.learnJava.Serialization_Desialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class DemoT1 implements Serializable{						
	int i = 10;
	transient static int j = 20;					//variable will not take part in serialization process because static variable doesnot belong to class and hence no use of using static with transient
}
public class StaticVsTransient{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DemoT1 d1 = new DemoT1();
		System.out.println("Before Serialization :" + d1.i + " " + d1.j);
		
		FileOutputStream foo = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		DemoT1 d2 = (DemoT1) ois.readObject();
		
		System.out.println("After serialization - deserialization :" + d2.i + " " + d2.j);
		
		

	}

}