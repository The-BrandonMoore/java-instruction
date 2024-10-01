import java.text.NumberFormat;

public class MathApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		double result = 1.667;
		result = Math.round(result);
		System.out.println(result);
		
		double x = 10.315; 
		System.out.println("Rounded to 2 decimal places . . . ");
		x = (double)Math.round(x*100 )/100;
		System.out.println(x);
		
		System.out.println("Rounded to 1 decimal places . . . ");
		x = (double)Math.round(x * 10)/10;
		System.out.println(x);
		
		System.out.println("sqrt, max, min, random");
		result = Math.pow(5, 5);
		System.out.println(result);
		
		double squareRoot = Math.sqrt(20.25);
		System.out.println(squareRoot);
		
		x = 67;
		int y = 23;
		
		System.out.println("Max = " + Math.max(x, y));
		
		for (int i=0; i<10; i++) {
			int dieRoll = (int)(Math.random()*20)+1; //math for a d20
			System.out.println("You rolled a " + dieRoll);
		}
		
		System.out.println("Currency formatting . . .");
		double price = 11.575;
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		
		System.out.println("Price formatted: " + currencyFormatter.format(price));
		
		double interestRate = .0788236;
		NumberFormat pctFormatter = NumberFormat.getPercentInstance();
		pctFormatter.setMaximumFractionDigits(3);
		System.out.println("Interest rate formatted: " + pctFormatter.format(interestRate));
		
		String name = "Joel";
		int age = 39;
		System.out.printf("%s is %d years old. %n", name, age);
		
		System.out.println();
		
		
		
		
		
		
		
		
		System.out.println("Bye");
	}

}
