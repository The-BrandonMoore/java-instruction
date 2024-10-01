import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Temperature Converter");
		Scanner sc = new Scanner(System.in);
		
		String checkString = "y";
		while (checkString.endsWith("y")) 
		{
			
			System.out.print("Enter degrees in Fahrenheit: ");
			double tempF = sc.nextDouble();
			double tempC = (tempF -32) * 5/9;
			tempC = (double)Math.round(tempC*100 )/100;
			System.out.println("Degrees in Celsius: " + tempC + "\n");
		
			
			sc.nextLine();
		
			System.out.print("Continue? (y/n) \n");
			checkString = sc.nextLine();
		
		}
		System.out.println("bye");
	}

}
