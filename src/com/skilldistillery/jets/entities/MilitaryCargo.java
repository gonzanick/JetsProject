package com.skilldistillery.jets.entities;

public class MilitaryCargo extends Jet {
	
	public MilitaryCargo() { }
	
	public MilitaryCargo(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
		
	}
	
	public void loadCargo() {
		System.out.println("Loading military equipment");
		
		
	}
	@Override
	public void fly() {
		
	}

}
