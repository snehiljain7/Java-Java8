package com.learnJava.Serialization_Desialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog1 implements Serializable{
	int i=10;
}

class Cat1 implements Serializable{
	int j=20;
}

public class MultipleObjectsSerDeser2 {

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
		
		System.out.println("After multiple objects deserialization :");
		
		for(int i=0; i<2; i++) {
			Object object = ois.readObject();						//What if someone else is serializing the object and other person is deserializing it
																	//in such cases we can use this approach
			if(object instanceof Cat1) {							//where someone doesn't knows the order of serialization
				Cat1 c2 = (Cat1) object;
				System.out.println(c2.j);
			}
			else if(object instanceof Dog1) {
				Dog1 d2 = (Dog1) object;
				System.out.println(d2.i);
			}
		}
		
		

	}

}
