package model;

public class User {

	public int id;
	public String username;
	public String password;
	public String firstName;
	public String lastName;
	public String phoneNumber;
	public String email;
	public Boolean reviewer;
	public Boolean admin;
	
	public User () {
		
	}
	
	public User(int id, String username, String password, String firstName, String lastName, String phoneNumber,
			String email, Boolean reviewer, Boolean admin) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.reviewer = reviewer;
		this.admin = admin;
	}
	public User(String username, String password, String firstName, String lastName, String phoneNumber, String email,
			Boolean reviewer, Boolean admin) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.reviewer = reviewer;
		this.admin = admin;
	}
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email + ", reviewer="
				+ reviewer + ", admin=" + admin + "]";
	}
	public int getId() {
		return id;
	}
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public String getUsername() {
		return username;
	}
	
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	public String getPassword() {
		return password;
	}
	
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public String getEmail() {
		return email;
	}
	
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public Boolean getReviewer() {
		return reviewer;
	}
	
	
	
	public void setReviewer(Boolean reviewer) {
		this.reviewer = reviewer;
	}
	
	
	
	public Boolean getAdmin() {
		return admin;
	}
	
	
	
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
}
