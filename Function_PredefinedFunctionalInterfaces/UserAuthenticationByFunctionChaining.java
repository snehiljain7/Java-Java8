package com.learnJava.Function_PredefinedFunctionalInterfaces;

import java.util.Scanner;
import java.util.function.Function;

/*
 * Provide any number of letters in username program should accepts only first five characters only and user can enter in upper case or lower 
 * case. For now, correct username is adams and password is test.
 */
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
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", passwrod=" + passwrod + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null)   
			return false;  
		if (obj == this)  
			return true;  
		return this.getUsername().equals(((User) obj).getUsername())&& this.getPasswrod().equals(((User) obj).getPasswrod());  
	}
		 
}

public class UserAuthenticationByFunctionChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Username ");
		String username = scanner.next();
		System.out.println("Enter Password ");
		String password = scanner.next();
		
		User user = new User(username, password);
		
		Function<User, User> firstFiveCharacters = u ->{
			u.setUsername(u.getUsername().substring(0,5));
			u.setPasswrod(u.getPasswrod().substring(0,5));
			return u;
		};
		
		Function<User, User> lowerOrUpper = u ->{
			u.setUsername(u.getUsername().toLowerCase());
			u.setPasswrod(u.getPasswrod().toLowerCase());
			
			return u;
		};
		
		User user2 = new User("adams", "test");
		
		if(firstFiveCharacters.andThen(lowerOrUpper).apply(user).equals(user2))
			System.out.println("Valid User");
		else
			System.out.println("Invalid User");
	}

}
