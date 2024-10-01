import java.util.Scanner;

public class TimeTravelCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to the Travel Time Calculator");
Scanner sc = new Scanner(System.in);
String chkString = "y";

while (chkString.equalsIgnoreCase("y")) {
	
System.out.print("/nEnter miles: ");	
double miles = sc.nextDouble();
System.out.print("Enter miles per hour: ");
double speed = sc.nextDouble();
System.out.println("\nEstimated travel time");
System.out.println("=====================");
double timeInMinutes = miles/speed * 60;
double hours = timeInMinutes/60;
double minutes = timeInMinutes%60;

System.out.println("Hours:   " + (int)hours);
System.out.println("Minutes: " + (int)minutes);
	
sc.nextLine();

System.out.print("\nContinue? (y/n): ");
chkString = sc.nextLine();

}

System.out.println("Bye");
	}

}
