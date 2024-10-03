package ui;

import java.util.*;

import util.Console;
import model.Movie;

public class BmdbMovieManagerApp {

	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<>();
		List<String> ratings = new ArrayList<>(Arrays.asList("G", "PG", "PG-13", "R", "NC-17"));
		
		Console.printLine("Welcome to the BMDB Console App");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			Console.printLine("Enter a movie: ");
			int id = Console.getInt("Id: ");
			String title = Console.getRequiredString("Title: ");
			int year = Console.getInt("Year: ");
			String rating = Console.getString("Ratings: ", ratings);
			String director = Console.getRequiredString("Director: ");

			Movie m = new Movie (id, title, year, rating.toUpperCase(), director);
			movies.add(m);
			
			Console.printLine("\nMovies:");
			for (Movie movie: movies) {
				Console.printLine(movie.toString());
			}
			choice = Console.getString("Another Movie? (y/n): ", new ArrayList<>(Arrays.asList("y","n")));
		
		}
		System.out.println("Bye");
	}
}
