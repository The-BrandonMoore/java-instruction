package model;

import util.Console;

public class Contact {

	private String FirstName;
	private String LastName;
	private String Email;
	private String Phone;
	
	
	public Contact() {
		super();
	}
	
	public Contact(String firstName, String lastName, String email, String phone) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Phone = phone;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
	public void displayContact() {
		Console.printLine("------------------------------------------");
		Console.printLine("---- Current Contact ---------------------");
		Console.printLine("------------------------------------------");
		Console.printLine("Name:          " + FirstName + " " + LastName);
		Console.printLine("Email Address: " + Email);
		Console.printLine("Phone Number:  " + Phone);
		Console.printLine("------------------------------------------");
	}
	
	
	
}
