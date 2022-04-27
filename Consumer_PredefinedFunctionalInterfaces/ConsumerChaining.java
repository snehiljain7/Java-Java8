package com.learnJava.Consumer_PredefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Consumer;

class MovieDemo{
	
	private String name;
	private String result;
	public MovieDemo(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "MovieDemo [name=" + name + ", result=" + result + "]";
	}
	
	
}
public class ConsumerChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MovieDemo> listOfMovies = new ArrayList<>();
		populate(listOfMovies);
		
		Consumer<MovieDemo> c1 = m -> System.out.println("Movie: " + m.getName() + " is releasing");
		
		Consumer<MovieDemo> c2 = m -> System.out.println("Movie: " + m.getName() + " is " + m.getResult());
		
		Consumer<MovieDemo> c3 = m -> System.out.println("Movie: " + m.getName() + " information storing in DB");
		
		for(MovieDemo movieDemo: listOfMovies) {
			c1.andThen(c2).andThen(c3).accept(movieDemo);
			System.out.println();
		}

	}

	private static void populate(ArrayList<MovieDemo> listOfMovies) {
		// TODO Auto-generated method stub
		listOfMovies.add(new MovieDemo("Bahubali", "Hit"));
		listOfMovies.add(new MovieDemo("Anjana Anjani", "Flop"));
		listOfMovies.add(new MovieDemo("Aloo Chat", "Flop"));
		listOfMovies.add(new MovieDemo("Dhoom", "Hit"));
		
	}

}
