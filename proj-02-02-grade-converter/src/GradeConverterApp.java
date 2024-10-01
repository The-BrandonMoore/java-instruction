import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Letter Grade Converter");
		Scanner sc = new Scanner(System.in);
		
		String strChecker = "y";
		
		while (strChecker.equalsIgnoreCase("y")) {
			System.out.print("Enter Numerical Grade: ");
			int grade= sc.nextInt();
		
			if (grade >= 90) {
				System.out.println("Letter Grade: A");
			}
			else if (grade >= 80) {
				System.out.println("Letter Grade: B");
			}
			else if (grade >= 70) {
				System.out.println("Letter Grade: C");
			}
			else if (grade >= 60) {
				System.out.println("Letter Grade: D");
			}
			else {
				System.out.println("Letter Grade: F");
			}
		
			sc.nextLine();
			System.out.print("Conintue? (y/n): ");
			strChecker = sc.nextLine();
		
		}
		
		
		
		
		
		
		
		
		System.out.println("bye");

	}

}
