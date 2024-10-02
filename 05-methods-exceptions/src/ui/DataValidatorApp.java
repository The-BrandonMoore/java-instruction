package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataValidatorApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printWelcome();

//		System.out.println("Enter a whole number; "); // enter a whole number with exception handling
//		try {
//			int nbr1 = sc.nextInt();
//		} catch (InputMismatchException ime) {
//			System.out.println("Invalid whole number");
//			sc.nextLine();
//		}
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

		int nbr1 = getInt("Enter whole number: ");
		System.out.println("nbr1 = " + nbr1);
		
		
		
//		System.out.println("Enter a double (data validation): ");
//		if (sc.hasNextDouble()) {
//			double d1 = sc.nextDouble();
//		} else {
//			System.out.println("Invalid Double");
//			// clear bad input
//			sc.nextLine();
//		}

		double dbl1 = getDouble("Enter double: ");
		System.out.println("dbl1 = " + dbl1);
		
		choice = getString("Try again (y/n?", "y", "n");
			
		}
		
		
		

		System.out.println("Bye");
	}

	private static void printWelcome() {
		System.out.println("Welcome");
	}

	private static int getInt(String prompt) 
	{
		boolean success = false;
		int nbr = 0;
		while (!success) {
			System.out.println(prompt);
			if (sc.hasNextInt()) {
				nbr = sc.nextInt();
				success = true;
			} else {
				System.out.println("Invalid whole number");
			}
			sc.nextLine();
		}

		return nbr;
	}

	private static double getDouble(String prompt) 
	{
		boolean success = false;
		double nbr = 0;
		while (!success) {
			System.out.println(prompt);
			if (sc.hasNextDouble()) {
				nbr = sc.nextDouble();
				success = true;
			} else {
				System.out.println("Invalid double");
			}
			sc.nextLine();
		}

		return nbr;
	}

	// validate string entry against two acceptable values
	private static String getString(String prompt, String s1, String s2) 
	{
		String str = "";
		boolean success = false;
		while (!success) {
			System.out.print(prompt);
			str = sc.nextLine();
			if (str.length() == 0) {
				System.out.println("Entry is required. Try again");
			} else if (!str.equalsIgnoreCase(s1) && !str.equalsIgnoreCase(s2)) {
				System.out.println("Entry must be " + s1 + " or " + s2 + ". Try again.");
			} else {
				success = true;
			}
		}
		return str;
	}
	

}
