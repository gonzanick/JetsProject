package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
		JetsApplication jetApp = new JetsApplication();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Select what you would like to do");
			jetApp.menu();
			int userInput = sc.nextInt();
			
			if (userInput == 1) {
				
			}
			
		}
		

	}
	
	public void menu() {
		System.out.println("1. List Fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to the Fleet");
		System.out.println("8. Remove a jet from the Fleet");
		System.out.println("9. Quit");
		
		
	}

}
