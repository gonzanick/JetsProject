package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class AirField {
	private List<Jet> jets;
	
	
	public AirField() { }
	
	public void readFleet() {
		
		try ( BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt")) ) {
			  String line;
			  while ((line = bufIn.readLine()) != null) {
			    String[] row = line.split(",");
			  }
			}
			catch (IOException e) {
			  System.err.println(e);
			}
		
		
	}

}
