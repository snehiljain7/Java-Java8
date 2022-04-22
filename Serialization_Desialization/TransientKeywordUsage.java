package com.learnJava.Serialization_Desialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class DemoT implements Serializable{						
	int i = 10;
	transient int j = 20;
}
public class TransientKeywordUsage{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DemoT d1 = new DemoT();
		System.out.println("Before Serialization :" + d1.i + " " + d1.j);
		
		FileOutputStream foo = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		DemoT d2 = (DemoT) ois.readObject();
		
		System.out.println("After serialization - deserialization :" + d2.i + " " + d2.j);
		
		

	}

}