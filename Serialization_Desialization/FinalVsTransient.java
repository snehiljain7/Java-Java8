package com.learnJava.Serialization_Desialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class DemoT2 implements Serializable{						
	int i = 10;
	transient final int j = 20;					//variable will not take part in serialization process because value is taken by compiler at compile time for final variable, not the variable itself. Hence again no use of using final with transient.
}
public class FinalVsTransient{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DemoT2 d1 = new DemoT2();
		System.out.println("Before Serialization :" + d1.i + " " + d1.j);
		
		FileOutputStream foo = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		DemoT2 d2 = (DemoT2) ois.readObject();
		
		System.out.println("After serialization - deserialization :" + d2.i + " " + d2.j);
		
		

	}

}