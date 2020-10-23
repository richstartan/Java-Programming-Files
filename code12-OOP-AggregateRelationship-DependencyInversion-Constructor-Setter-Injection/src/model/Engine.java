package model;

public class Engine extends java.lang.Object{

	private int cylinders;
	private String name;
	private int liters;
	
	public Engine() {
	}

	public Engine(int cylinders, String name, int liters) {
		this.cylinders = cylinders;
		this.name = name;
		this.liters = liters;
	}
	
	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLiters() {
		return liters;
	}

	public void setLiters(int liters) {
		this.liters = liters;
	}

	@Override
	public String toString() {
		return "Engine Name: " + this.name + "\nTotal Cylinders: " + this.cylinders 
			+ "\nLiters: " + this.liters; 
	}
	
}
