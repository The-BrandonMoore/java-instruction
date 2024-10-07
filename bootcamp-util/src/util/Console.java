package util;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

/*
 * This is a utility class to manage 
 * the console interaction between an app
 * and a user.
 * 
 * It will include basic getString methods
 * as well as data validation methods.
 * 
 * We plan to create a library for this class
 * and reuse throughout our other console apps.
 */

public class Console {
	public static Scanner sc = new Scanner(System.in);

	public static void printLine(String line) {
		System.out.println(line);
	}

	// Prompt user for a string, empty strings allowed
	public static String getString(String prompt) {
		System.out.print(prompt);
		return sc.nextLine();
	}

	// Prompt user for a required string. This will prevent an empty string.
	public static String getRequiredString(String prompt) {
		String str = "";
		boolean success = false;
		while (!success) {
			str = getString(prompt);
			if (str.length() > 0) {
				success = true;
			} else {
				System.out.println("Entry Required. Please Try Again.");
			}
		}
		return str;
	}

	//
	public static String getString(String prompt, List<String> validValues) {
		String str = "";
		boolean success = false;
		while (!success) {
			// validate non empty
			// validate against validValues
			str = getString(prompt);
			for (String s : validValues) {
				if (s.equalsIgnoreCase(str)) {
					success = true;
					break;
				}
			}
			if (!success) {
				printLine("Invalid value. Try again.");
			}
		}
		return str;
	}

	public static int getInt(String prompt) {
		int nbr = 0;
		boolean success = false;
		while (!success) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				nbr = sc.nextInt();
				success = true;
			} else {
				System.out.println("Error: Please enter a whole number.");
			}
			sc.nextLine();
		}
		return nbr;
	}

	public static int getInt(String prompt, int min, int max) {
		int nbr = 0;
		boolean success = false;
		while (!success) {
			nbr = getInt(prompt);
			if (nbr < min) {
				System.out.println("Error: Entry must be at least [" + min + "].");
			} else if (nbr > max) {
				System.out.println("Error: Entry must be less than or equalt to [" + max + "].");
			} else {
				success = true;
			}
		}

		return nbr;
	}

	public static double getDouble(String prompt) {
		double nbr = 0.0;
		boolean success = false;
		while (!success) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				nbr = sc.nextDouble();
				success = true;
			} else {
				System.out.println("Error: Please enter a valid decimal number.");
			}
			sc.nextLine();
		}
		return nbr;
	}

	public static double getDouble(String prompt, double min, double max) {
		double nbr = 0.0;
		boolean success = false;
		while (!success) {
			nbr = getDouble(prompt);
			if (nbr < min) {
				System.out.println("Error: Entry must be at least [" + min + "].");
			} else if (nbr > max) {
				System.out.println("Error: Entry must be less than or equalt to [" + max + "].");
			} else {
				success = true;
			}
		}

		return nbr;
	}
	public static Date getDate (String prompt) {
		Date date = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.print(prompt);
		String str = sc.nextLine().formatted(formatter);
		LocalDate ld = LocalDate.parse(str);
		date = Date.valueOf(ld);
		return date;
	}

	public static Boolean getRequiredBoolean(String prompt) {
		Boolean bool = null;
		boolean success = false;
		while (!success) {
			System.out.print(prompt);
			bool = Boolean.parseBoolean(sc.nextLine());
			if (!bool.equals(null)) {
				success = true;
			} else {
				System.out.println("Entry Required. Please Try Again.");
			}
		}
		return bool;
	}
	
}
