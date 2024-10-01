import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Interest Calculator");
		Scanner sc = new Scanner(System.in);
		String ckString = "y";
		while (ckString.equalsIgnoreCase("y")) {
			System.out.print("\nEnter Loan Amount: ");
			double loanAmount = sc.nextDouble();
			System.out.println("Enter Interest Rate: ");
			double intRate = sc.nextDouble();
			
			
			NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
			System.out.println("\nLoan Amount: " + currencyFormatter.format(loanAmount));
			NumberFormat pctFormatter = NumberFormat.getPercentInstance();
			pctFormatter.setMaximumFractionDigits(3);
			System.out.println("Interest Rate: " + pctFormatter.format(intRate));
			
			double interest = loanAmount * intRate;
			System.out.println("Interest: " + currencyFormatter.format(interest));
		
			sc.nextLine();
			
			System.out.print("\nContinue? (y/n): ");
			ckString = sc.nextLine();
		
		
		
		
		}
		System.out.println("Bye");
	}

}
