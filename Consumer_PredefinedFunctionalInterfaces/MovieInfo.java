package com.learnJava.Consumer_PredefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Consumer;

//Displaying info of Movie using consumer

class Movie{
	private String movie;
	private String hero;
	private String heroine;
	public Movie(String movie, String hero, String heroine) {
		super();
		this.movie = movie;
		this.hero = hero;
		this.heroine = heroine;
	}
	public String getMovie() {
		return movie;
	}
	public String getHero() {
		return hero;
	}
	public String getHeroine() {
		return heroine;
	}
	@Override
	public String toString() {
		return "Movie [movie=" + movie + ", hero=" + hero + ", heroine=" + heroine + "]";
	}
	
	
}
public class MovieInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> listOfMovies = new ArrayList<>();
		populate(listOfMovies);
		
		Consumer<Movie> c1 = m -> {
			System.out.println("Movie name: " + m.getMovie());
			System.out.println("Hero name: " + m.getHero());
			System.out.println("Heroine name: " + m.getHeroine());
			System.out.println();
		};
		
		for(Movie movie: listOfMovies) {
			c1.accept(movie);
		}

	}

	private static void populate(ArrayList<Movie> listOfMovies) {
		// TODO Auto-generated method stub
		listOfMovies.add(new Movie("Bahubali", "Prabhas", "Anushka"));
		listOfMovies.add(new Movie("Dangal", "Aamir", "Ritu"));
		listOfMovies.add(new Movie("Sultan", "Salman", "Anushka"));
		listOfMovies.add(new Movie("Krish", "Hritik", "Deepika"));
		
	}

}
