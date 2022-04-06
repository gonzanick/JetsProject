package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> jets;

	public List<Jet> getJets() {
		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}

	public AirField() {
	}

	public void readFleet() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			List<Jet> jetList = new ArrayList<>();
			while ((line = bufIn.readLine()) != null) {
				String[] row = line.split(",");
				String type = row[0];
				String model = row[1];
				Double speed = Double.parseDouble(row[2]);
				Integer range = Integer.parseInt(row[3]);
				Long price = Long.parseLong(row[4]);
				if (type.equals("MilitaryCargo")) {
					Jet temp = new MilitaryCargo(type, model, speed, range, price);
					jetList.add(temp);

				} else if (type.equals("Fighter")) {
					jetList.add(new Fighter(type, model, speed, range, price));
				} else if (type.equals("Passenger")) {
					jetList.add(new Passenger(type, model, speed, range, price));
				}

			}
			jets = jetList;

		} catch (IOException e) {
			System.err.println(e);
		}

	}

	public void listFleet() {
		for (Jet jet : jets) {
			System.out.println(jet);

		}

	}
	
	public String fastestJet(List<Jet> fastest, double speed) {
		for (Jet jet : fastest) {
			
		}
		

	return "The fastest jet in the Fleet is: " + fastest +", at " + speed + " MPH.";
}

}
