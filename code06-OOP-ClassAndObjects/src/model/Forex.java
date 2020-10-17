package model;

public class Forex {

	
	//instance variables declaration
	//input values
	public double pesoAmount; //defaulted to 0.0
	public String currencyType; //defaulted to null
	
	
	//computed values
	public double convertedAmount; //defaulted to 0.0
	
	public static String programmer; //defaulted to null
	

/**********************************************************
 * Three types of constructor
 * 1. Default constructor (entirely no constructor declaration in a class
 * 2. No Arg (no argument) - with explicit constructor declaration but no argument 
 * 3. Parameterized
 */	
	
	
	// declare a no-arg (no argument constructor
	public Forex() {
		programmer = "Richie Tan";
	}
	
	// parameterized
	public Forex (double pesoAmount, String currencyType) {
		this.pesoAmount = pesoAmount;
		this.currencyType = currencyType;
	}
	
	public void compute() {
		switch(currencyType.toUpperCase()) {
		case "USD":
			convertedAmount = pesoAmount / 48.65;
			break;
		case "EUR":
			convertedAmount = pesoAmount / 58.1995;
			break;
		case "JPY":
			convertedAmount = pesoAmount / 0.4706;
			break;
			default:
				System.err.println("Invalid currency type");
				break;
		}
	}
	
	public void display() {
		System.out.println("\nThe Philippine Peso amount of " 
	+ this.pesoAmount + " is " + this.currencyType + "\n" + this.convertedAmount);
	}
	
	/*
	 * Types of access modifiers/specifiers in Java
	 * 1. private(class)
	 * 2. default (package)
	 * 3. protected (inheritance)
	 * 4. public (global)
	 */
	
	
}
