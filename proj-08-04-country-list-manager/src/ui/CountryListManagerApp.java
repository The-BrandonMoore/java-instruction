package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import util.Console;

public class CountryListManagerApp {

	public static void main(String[] args) {
		List<String> countryList = new ArrayList<String>();
		String choice = "y";
		Console.printLine("Country List Manager");
		countryMenu();
		while (choice.equalsIgnoreCase("y")) {
			int menuChoice = Console.getInt("Enter Menu Number: ");
			switch (menuChoice) {
			case 1:
				if (countryList.isEmpty()) {
					Console.printLine("Country list is currently empty. Please add a country.\n");
					break;
				} else {
					Console.printLine("");
					for (String country : countryList) {
						Console.printLine(country);
					}
					Console.printLine("");
				}
				break;
			case 2:
				String c = Console.getRequiredString("\nEnter country: ");
				countryList.add(c);
				Console.printLine("The country, " + c + ", has been added.\n");

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

	private static void countryMenu() {
		Console.printLine("\nCommand Menu");
		Console.printLine("1 - List Countries");
		Console.printLine("2 - Add a Country");
		Console.printLine("3 - View Menu");
		Console.printLine("4 - Exit");
	}

}
