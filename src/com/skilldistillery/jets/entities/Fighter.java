package com.skilldistillery.jets.entities;

public class Fighter extends Jet {
	
	public Fighter() { }
	
	public Fighter(String name, String model, double speed, int range, long price) {
		super(name, model, speed, range, price);
		
	}
	
	public void fight() {
		System.out.println("Initiating dogfight.");
		System.out.println("America always wins!");
		
		
	}

}
