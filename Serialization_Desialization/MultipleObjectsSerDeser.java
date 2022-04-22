package com.learnJava.Serialization_Desialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	int i=10;
}

class Cat implements Serializable{
	int j=20;
}

public class MultipleObjectsSerDeser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Dog1 d1 = new Dog1();
		Cat1 c1 = new Cat1();
		FileOutputStream foo = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(d1);
		oos.writeObject(c1);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog1 d2 = (Dog1) ois.readObject();						//order of deserialization must be same as order of serialization, for serializing and deserializing multiple objects
		Cat1 c2 = (Cat1) ois.readObject();						
		
		System.out.println("After multiple objects deserialization :" + d2.i + " " + c2.j);

	}

}
