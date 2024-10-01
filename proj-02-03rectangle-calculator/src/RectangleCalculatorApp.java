import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String checkString = "y";
		
		while(checkString.equalsIgnoreCase("y")) 
		{
			System.out.print("Enter Length: ");
			double length = sc.nextDouble();
			System.out.print("Enter Width: ");
			double width = sc.nextDouble();
			
			double area = length*width;
			double perimeter = 2*width + 2*length;
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			
			sc.nextLine();
			System.out.print("Continue? (y/n): ");
			checkString = sc.nextLine(); 
		
		}
		System.out.println("bye");

	}

}
