package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Jet {
	private String type;
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jet() { }
	
	public Jet(String type, String model, double speed, int range, long price) {
		this.type = type;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String name) {
		this.type = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet type is a " + type + ", model " + model + ", speed " + speed + ", range " + range + ", price " + price
				;
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, type, price, range, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(model, other.model) && Objects.equals(type, other.type) && price == other.price
				&& range == other.range && Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}
	
	public void fly() {
		
		
	}
	
	
}