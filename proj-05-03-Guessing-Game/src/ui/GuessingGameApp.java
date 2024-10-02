package ui;

import java.util.Scanner;

public class GuessingGameApp {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("====================================\n");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.println("\nI'm thinking of a number from 1 to 100.\nTry to guess it.\n");
		int secretNumber = (int)(Math.random()*100) + 1;
		System.out.println(secretNumber);
		int tryCounter = 0;
		gameLoop(secretNumber, tryCounter);
		choice = getString("Try again? (y/n): ", "y", "n");
	}//this ends the game while loop
		System.out.println("BYE");
}
	private static void gameLoop(int secretNumber, int tryCounter) {
		boolean correct = false;
		
		while (!correct) {
		
		int guess = getInt("\nEnter number: ");

		//if (guess > 100) {System.out.println("Number should be 100 or less. Guess again.");continue;}
		if (guess != secretNumber) {
			int wrong = guess - secretNumber; 
			if (wrong >= 10) {System.out.println("Way too high!");}
			else if (wrong < 10 && wrong >0) {System.out.println("Too high!");}
			else if (wrong < 0 && wrong >= -10) {System.out.println("Too low!");}
			else {System.out.println("Way too low!");}
			tryCounter++;

		}
		else {
			String guessResponse = "";
			tryCounter++;
			System.out.println("You got it in " + tryCounter + " tries.");
			guessResponse = getGuessResponse(tryCounter);
			System.out.println(guessResponse);
			correct = true;
		}
		
		}//this ends the guessing while loop.
	}
	private static String getGuessResponse(int tryCounter) {
		String guessResponse;
		if (tryCounter <=3 ) {guessResponse = "Great work! You are a mathematical wizard\n";}
		else if (tryCounter >3 && tryCounter <= 7) {guessResponse = "Not too bad! You've got some potential.\n";}
		else {guessResponse = "What took you so long? Maybe you should take some lessons.\n";}
		return guessResponse;
	}
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
	
	private static int getInt(String prompt) 
	{
		boolean success = false;
		int guess = 0;
		while (success == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				guess = sc.nextInt();
				sc.nextLine();
				if (guess > 100) {System.out.println("Number should be 100 or less. Guess again.");continue;}
				else {
				success = true;}
				
			} else {
				System.out.println("Invalid whole number");
			}

		}

		return guess;
	}
	
	}
