package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Fighter;
import com.skilldistillery.jets.entities.MilitaryCargo;

public class JetsApplication {

	public static void main(String[] args) {
		JetsApplication jetApp = new JetsApplication();
		Scanner sc = new Scanner(System.in);
		AirField airFD = new AirField();

		while (true) {
			System.out.println("Select what you would like to do");
			jetApp.menu();
			int userInput = sc.nextInt();

			if (userInput == 9) {
				break;
			}

			if (userInput == 1) {
				airFD.readFleet();
				airFD.listFleet();
				System.out.println();

			}
			if (userInput == 2) {

			}
			if (userInput == 3) {

			}
			if (userInput == 4) {
				
			}
			if (userInput == 5) {
				MilitaryCargo mc = new MilitaryCargo();
				mc.loadCargo();
				System.out.println();
				
			}
			if (userInput == 6) {
				Fighter fight = new Fighter();
				fight.fight();
				System.out.println();
			}
			if (userInput == 7) {
				System.out.println("Enter the type of jet: (Fighter, Passenger, or MilitaryCargo)\n"
						+ "Then enter the model, speed, range, and price of the jet.");
				String userInputType = sc.next();
				String userInputModel = sc.next();
				double userInputSpeed = sc.nextDouble();
				int userInputRange = sc.nextInt();
				long userInputPrice = sc.nextLong();
				//jetList.add(userInputType, userInputModel, userInputSpeed, userInputRange, userInputRange, userInputPrice);
				
			}
			if (userInput == 8) {
				
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

	public void flyAll() {

	}


}
