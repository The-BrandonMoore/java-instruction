package ui;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import db.ActorDB;
import db.MovieDB;
import model.Actor;
import model.Movie;
import util.Console;

public class BmdbTesterApp {
	static List<String> genderList = new ArrayList<String>();

	public static void main(String[] args) {
		Console.printLine("Welcome to the BMDB Tester App");
		Scanner sc = new Scanner(System.in);
		genderList.add("M");
		genderList.add("F");

		String choice = Console.getRequiredString("Actor or Movies: ");
		switch (choice) {

		case "actors":
		case "actor":
			Console.printLine("List all actors:");
			Console.printLine("================");
			listActors();
			
			Console.printLine("\nAdd a actor:");
			Console.printLine("================");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String firstName = Console.getRequiredString("First Name: ");
			String lastName = Console.getRequiredString("Last Name: ");
			String gender = Console.getString("Gender: ", genderList);
			Date birthdate = Console.getDate("Enter Birthdate (yyyy-MM-dd): ");
			Actor a = new Actor(firstName, lastName, gender, birthdate);
			if (ActorDB.add(a)) {
				Console.printLine("Actor added.");
			} else {
				Console.printLine("Error adding actor.");
			}

			Console.printLine("\nGet a actor by id:");
			Console.printLine("================");
			// Get Movie By Id
			int id = Console.getInt("Actor Id: ");
			a = ActorDB.get(id);
			if (a != null) {
				Console.printLine(a.toString());
			} else {
				Console.printLine("No actor found for id: " + id);
			}

			// Delete Movie
			Console.printLine("\nList all actors:");
			Console.printLine("================");
			listActors();

			Console.printLine("\nDelete a actor by id:");
			Console.printLine("================");
			id = Console.getInt("Actor Id: ");
			a = ActorDB.get(id);
			if (a != null) {
				if (ActorDB.delete(id)) {
					Console.printLine("Actor deleted.");
				} else {
					Console.printLine("Error deleting actor.");
				}
			} else {
				Console.printLine("No actor found for id: " + id + ". Cannot delete.");
			}

			Console.printLine("\nList all actors:");
			Console.printLine("================");
			listActors();
			break;

		case "movies":
		case "movie":
			Console.printLine("List all movies:");
			Console.printLine("================");
			listMovies();

			Console.printLine("\nAdd a movie:");
			Console.printLine("================");
			String title = Console.getRequiredString("Title: ");
			int year = Console.getInt("Year: ");
			String rating = Console.getString("Rating: ");
			String director = Console.getString("Director: ");
			Movie m = new Movie(title, year, rating, director);
			if (MovieDB.add(m)) {
				Console.printLine("Movie added.");
			} else {
				Console.printLine("Error adding movie.");
			}

			Console.printLine("\nGet a movie by id:");
			Console.printLine("================");
			// Get Movie By Id
			int movieId = Console.getInt("Movie Id: ");
			m = MovieDB.get(movieId);
			if (m != null) {
				Console.printLine(m.toString());
			} else {
				Console.printLine("No movie found for id: " + movieId);
			}

			// Delete Movie
			Console.printLine("\nList all movies:");
			Console.printLine("================");
			listMovies();

			Console.printLine("\nDelete a movie by id:");
			Console.printLine("================");
			movieId = Console.getInt("Movie Id: ");
			m = MovieDB.get(movieId);
			if (m != null) {
				if (MovieDB.delete(movieId)) {
					Console.printLine("Movie deleted.");
				} else {
					Console.printLine("Error deleting movie.");
				}
			} else {
				Console.printLine("No movie found for id: " + movieId + ". Cannot delete.");
			}

			Console.printLine("\nList all movies:");
			Console.printLine("================");
			listMovies();
			break;
		case "exit":
			break;
		default:
			Console.printLine("Please enter a valid command");
			break;
		}
		Console.printLine("BYE");
	}

	private static void listMovies() {
		List<Movie> movies = MovieDB.getAll();
		for (Movie m : movies) {
			Console.printLine(m.toString());
		}
	}

	private static void listActors() {
		List<Actor> actors = ActorDB.getAll();
		for (Actor a : actors) {
			Console.printLine(a.toString());
		}
	}

}
