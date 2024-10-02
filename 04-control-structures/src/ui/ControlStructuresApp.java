package ui;

import java.text.NumberFormat;
import java.util.Scanner;

public class ControlStructuresApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to chapter 4");
		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Traffic Light");
//		System.out.print("What's the light color?");
//		String color = sc.nextLine();
//
//		String choice = "y";
//		while (choice.equalsIgnoreCase("y")) {
//			if (color.endsWith("red")) {
//				System.out.println("Stop!");
//			} else if (color.equalsIgnoreCase("yellow")) {
//				System.out.println("Slow down");
//			} else if (color.equalsIgnoreCase("green")) {
//				System.out.println("GO");
//			} else {
//				System.out.println("invalid color");
//			}
//
//			System.out.println("Continue? (y/n) ");
//			choice = sc.nextLine();
//		}
//
//		System.out.println("\nCommand Menu");
//		System.out.println("1 -- Attack");
//		System.out.println("2 -- Block");
//		System.out.println("3 -- Run Away!");
//		System.out.print("Command: ");
//		String command = sc.nextLine();
//
//		switch (command) {
//		case "1":
//			System.out.println("arrrgh!!");
//			break;
//		case "2":
//			System.out.println("umph");
//			break;
//		case "3":
//			System.out.println("AHHHHHHHHHHH");
//			break;
//		default:
//			System.out.println("you have chosen poorly");
//			break;
//		}
//
//		System.out.println("switch statement fall-through . . .");
//		System.out.println("Day of week? (1-7) ");
//		int dow = sc.nextInt();
//
//		switch (dow) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("Weekday");
//			break;
//		case 6:
//		case 7:
//			System.out.println("Weekend . . . YES!");
//			break;
//		}
		
		System.out.println("\nFor Loops");
		System.out.println("\nStandard loop count from 1 to 10");
		for (int i = 0; i <= 10; i++) {
			System.out.println("i: " + i);
		}
		System.out.println("\nCount from 0 to 100 by 5s.");
		for (int i = 0; i <= 100; i+=5) {
			System.out.println("i: " + i);
		}
		System.out.println("\nCount from 99 to 3 by 3s.");
		for (int i =99; i >= 3; i-=3) {
			System.out.println("i: " + i);
		}
		
		System.out.println("\npercentages ... 1.0% to 5.0% by .25");
		NumberFormat pFormat = NumberFormat.getPercentInstance();
		pFormat.setMaximumFractionDigits(3);//trim off any digits passed the thousands place
		pFormat.setMinimumFractionDigits(2);//forces at least the hundreds place to be filled
		for (double i =1.0; i <= 5; i +=.25) {
			double pct = i/100;
			System.out.println("i: " + pFormat.format(pct));
		}
		
		

		System.out.println("Bye");
	}

}
