package ui;

import java.util.List;


import db.UserDB;
import model.User;
import util.Console;

public class PrsdbTesterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console.printLine("List all users:");
		Console.printLine("================");
		listUsers();
		
		Console.printLine("\nAdd a user:");
		Console.printLine("================");

		String userName = Console.getRequiredString("Username: ");
		String password = Console.getRequiredString("Password: ");
		String firstName = Console.getRequiredString("First Name: ");
		String lastName = Console.getRequiredString("Last Name: ");
		String phoneNumber = Console.getRequiredString("PhoneNumber: ");
		String email = Console.getRequiredString("Email: ");
		Boolean reviewer = Console.getRequiredBoolean("Reviewer: ");
		Boolean admin = Console.getRequiredBoolean("Admin: ");
		User a = new User(userName, password, firstName, lastName, phoneNumber, email, reviewer, admin);
		if (UserDB.add(a)) {
			Console.printLine("user" + a.id + " " + a.username + " added.");
		} else {
			Console.printLine("Error adding user.");
		}

		Console.printLine("\nGet a user by id:");
		Console.printLine("================");
		// Get Movie By Id
		int id = Console.getInt("user Id: ");
		a = UserDB.get(id);
		if (a != null) {
			Console.printLine(a.toString());
		} else {
			Console.printLine("No user found for id: " + id);
		}

		// Delete Movie
		Console.printLine("\nList all users:");
		Console.printLine("================");
		listUsers();

		Console.printLine("\nDelete a user by id:");
		Console.printLine("================");
		id = Console.getInt("user Id: ");
		a = UserDB.get(id);
		if (a != null) {
			if (UserDB.delete(id)) {
				Console.printLine("user deleted.");
			} else {
				Console.printLine("Error deleting user.");
			}
		} else {
			Console.printLine("No user found for id: " + id + ". Cannot delete.");
		}

		Console.printLine("\nList all users:");
		Console.printLine("================");
		listUsers();
	}
	private static void listUsers() {
		List<User> users = UserDB.getAll();
		for (User u : users) {
			Console.printLine(u.toString());
		}
	}
}
