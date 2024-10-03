package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Contact;
import util.Console;

public class ContactListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console.printLine("------------------------------------------");
		Console.printLine("--Welcome to the Contact List Application-");
		Console.printLine("------------------------------------------");
		List<Contact> contacts = new ArrayList<Contact>();
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			Contact c1 = getContact();
			c1.displayContact();
			contacts.add(c1);
			choice = Console.getString("\nContinue? (y/n): ", new ArrayList<>(Arrays.asList("y", "n")));
		}
	}

	private static Contact getContact() {
		String firstName = Console.getRequiredString("\nEnter first name: ");
		String lastName = Console.getRequiredString( "Enter last name:  ");
		String email = Console.getRequiredString(    "Enter email:      ");
		String phone = Console.getRequiredString(    "Enter phone:      ");
		Contact c1 = new Contact(firstName, lastName, email, phone);
		return c1;
	}

}
