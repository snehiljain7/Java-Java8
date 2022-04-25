package com.learnJava.Serialization_Desialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{						//with customized serialization loss of info can be prevented by doing extra work
	String username = "Adam";
	transient String pwd = "Eve";
	
	private void writeObject(ObjectOutputStream os) throws Exception{				//Extra work reqd. for customized serialization
		
		os.defaultWriteObject();  //meant for default serialization
		String epwd = "123" + pwd;
		os.writeObject(epwd);
	}
	
	private void readObject(ObjectInputStream is) throws Exception{						//Extra work reqd. for customized de-serialization
		
		is.defaultReadObject(); 	//meants for defaulf de-serialization
		String epwd = (String) is.readObject();
		pwd= epwd.substring(3);
	}
}

class Account1 implements Serializable{							//without customized serialization there can be a potential loss of info
	String un = "Adam";
	transient String password = "Eve";
}


public class CustomizedSerialization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Account1 account1 = new Account1();
		System.out.println("Without using customized serialization");
		System.out.println(account1.un + " " + account1.password);
		
		FileOutputStream foo = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(account1);
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account1 account2 = (Account1) ois.readObject();						
		
		System.out.println(account2.un + " " + account2.password);
		
		
		Account a1 = new Account();
		System.out.println("using customized serialization");
		System.out.println(a1.username + " " + a1.pwd);
		
		FileOutputStream foo1 = new FileOutputStream("abc.txt");
		ObjectOutputStream oos1 = new ObjectOutputStream(foo1);
		oos1.writeObject(a1);
		
		FileInputStream fis1 = new FileInputStream("abc.txt");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		Account a2 = (Account) ois1.readObject();						
		
		System.out.println(a2.username + " " + a2.pwd);

	}

}
