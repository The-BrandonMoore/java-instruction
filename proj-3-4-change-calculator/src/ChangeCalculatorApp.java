import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Change Calculator");
		Scanner sc = new Scanner(System.in);
		String chkString = "y";
		while (chkString.equalsIgnoreCase("y")) {
			System.out.print("Enter number of cents (0-99): ");
			int cents = sc.nextInt();
			
			int quarters = (int)cents/25;
			System.out.println("Quarters: " + quarters);
			int remainder = cents %25;
			int dimes = (int)remainder/10;
			System.out.println("Dimes:    " + dimes);
			remainder = remainder%10;
			int nickels = (int)remainder/5;
			System.out.println("Nickels:  " + nickels);
			int pennies = (int)remainder%5;
			System.out.println("Pennies:  " + pennies);
		
			
			sc.nextLine();
			System.out.print("Continue (y/n) :");
			chkString = sc.nextLine();
			
		}
		System.out.println("Bye");
	}

}
