package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import util.Console;

public class CountryListManagerApp {
	static List<String> countryList = new ArrayList<String>();

	public static void main(String[] args) {
		String choice = "y";
		Console.printLine("Country List Manager");
		countryMenu();
		while (choice.equalsIgnoreCase("y")) {
			int menuChoice = Console.getInt("Enter Menu Number: ");
			switch (menuChoice) {
			case 1:
				listCountries();
				break;
			case 2:
				addACountry();
				break;
			case 3:
				countryMenu();
				break;
			case 4:
				choice = "n";
				break;
			default:
				Console.printLine("Please enter a valid menu command.");
				break;
			}
		}
		Console.printLine("Bye!");
	}

	private static void addACountry() {
		String c = Console.getRequiredString("\nEnter country: ");
		countryList.add(c);
		Collections.sort(countryList, String.CASE_INSENSITIVE_ORDER);//sorts the list alphabetically
		Console.printLine("The country, " + c + ", has been added.\n");
	}

	private static void countryMenu() {
		Console.printLine("\nCommand Menu");
		Console.printLine("1 - List Countries");
		Console.printLine("2 - Add a Country");
		Console.printLine("3 - View Menu");
		Console.printLine("4 - Exit");
	}
	private static void listCountries() {
		if (countryList.isEmpty()) {
			Console.printLine("Country list is currently empty. Please add a country.\n");
		} else {
			Console.printLine("");//just wanted an extra line here.
			Console.printLine("Countries List");
			Console.printLine("==============");
			for (String country : countryList) {
				Console.printLine(country);
			}
			Console.printLine("");
		}
	}
}
