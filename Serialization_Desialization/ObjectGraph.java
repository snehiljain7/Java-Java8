package com.learnJava.Serialization_Desialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Whenever we are serializing an object the set of all objects which are reachable from that object will be serialized automatically.
 * This group of Objects is Object Graph
 */
class DogOG implements Serializable{
	CatOG c = new CatOG();
}

class CatOG implements Serializable{
	RatOG r = new RatOG();
}

class RatOG implements Serializable{
	int j=20;
}
public class ObjectGraph {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		DogOG d1 = new DogOG();
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		DogOG d2 = (DogOG) ois.readObject();
		
		System.out.println(d2.c.r.j);

	}

}
