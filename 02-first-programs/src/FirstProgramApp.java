import java.util.Random;
import java.util.Scanner;


public class FirstProgramApp {

	public static void main(String[] args) {
		System.out.println("Welcome");

		// this is a one line comment
		/*
		 * this is a multi-line comment
		 * boop.
		 */
		int a = 5; 
		int b = 9;
		int sum = a+b;
		
		System.out.println("Sum is : " + sum);
		
		double price = 19.99;
		
		
		int c = 9/5;
		int r = 9%5;
		
		System.out.println("C = " + c);
		System.out.println("remainder = " + r);
		
		String name = "Bob Marley";
		System.out.print(name);
		System.out.println("Full name is: " + name);
		
		//Random rand = new Random();
		//rand = rand.ints();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("hi, what's your name? ");
		name = sc.nextLine();
		
		System.out.print("Enter a whole number: ");
		int nbr2 = Integer.parseInt(sc.nextLine());
		
		
		System.out.print("Enter another whole number: ");
		int nbr3 = sc.nextInt();
		
		sc.nextLine();
		
		String choice = "y";
		System.out.print("Continue (y/n)? ");
		String resp = sc.nextLine();
		
		if (choice == resp) { // the == does not compare values, it checks if the two are the same object
			System.out.println("choice and resp are the same");
		}
		
		if(choice.equalsIgnoreCase(resp)) { // use this to check values against one another
			System.out.println("equals method - same");
		}
		
		String choice2 = "y";
		if (choice == choice2) {
			System.out.println("choice==chioce2");
		}
		
		
		System.out.println("\nWhile loop demo");
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("continue? ");
			choice = sc.nextLine();
		}
		
		
		
		
		
		System.out.println("bye");
	}

}
