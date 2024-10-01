import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Registration Form");
		
		System.out.print("Enter first name: ");
		String fName = sc.nextLine();
		System.out.print("Enter last name: ");
		String lName = sc.nextLine();
		System.out.print("Enter year of birth: ");
		int yearOfBirth = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Welcome " + fName + " " + lName);
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + fName + "*" + yearOfBirth);
		
		System.out.println("BYE");
		
		
		
		
		
		
		
		
		
	}

}
