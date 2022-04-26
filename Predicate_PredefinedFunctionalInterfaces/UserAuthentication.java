package com.learnJava.Predicate_PredefinedFunctionalInterfaces;

import java.util.Scanner;
import java.util.function.Predicate;

//program for user authentication using predicate
class User{
	private String username;
	private String passwrod;
	public User(String username, String passwrod) {
		super();
		this.username = username;
		this.passwrod = passwrod;
	}
	public String getUsername() {
		return username;
	}
	public String getPasswrod() {
		return passwrod;
	}
	
	 
}
public class UserAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<User> userAuth = user-> user.getUsername().equals("Adam") && user.getPasswrod().equals("123Eve");
		
		
		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();
		String password = scanner.next();
		
		User user = new User(username, password);
		
		if(userAuth.test(user)) {
			System.out.println("You have the access to the system");
		}
		else {
			System.out.println("Please enter correct credentials");
		}

	}

}
