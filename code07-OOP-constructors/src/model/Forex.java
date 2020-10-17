package model;

public class Forex {
	
	//instance variables declaration
	//input values
	public double pesoAmount; //defaulted to 0.0
	public String currencyType; //defaulted to null
	
	//computed values
	public double convertedAmount; //defaulted to 0.0
	
	public static String programmer; //defaulted to null;
	
	/******************** 
	Three Types of Constructor
	 1. Default constructor - no constructor declaration in a class
	 2. No Arg constructor (no argument) - with explicit constructor declaration 
	    but no argument
	 3. Parameterized constructor - with explicit constructor declaration however
	    but with argument/s  
	*/
	
	//now introducing the static block 
	static {
		programmer = "Mon Zalameda";
		printWelcomeMessage();
	}
	
	public static void printWelcomeMessage() {
		System.out.println("Welcome to the Wonderful World of Forex class.");
	}
	
	static {
		String school = "iACADEMY";
		System.out.println("School: " + school);
	}
	
	//declare a no-arg (no argument constructor
	public Forex() {
		pesoAmount = 0;
		System.out.println("constructor 1 executed: no argument constructor");
	}
	
	//parameterized constructor
	public Forex (double pesoAmount, String currencyType) {
		this.pesoAmount = pesoAmount;
		this.currencyType = currencyType;
		System.out.println("constructor 2 executed: double, String");
	}
	
	public Forex (String currencyType, double pesoAmount) {
		this.pesoAmount = pesoAmount;
		this.currencyType = currencyType;
		System.out.println("constructor 3 executed: String, double");
	}
	
	public void compute() {
		switch (currencyType.toUpperCase()) {
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
		System.out.println("\nThe Philippine peso amount of " 
			+ this.pesoAmount + " is " + this.currencyType+this.convertedAmount+".");
		
		System.out.println("\nprogrammed by " + programmer);
	}
}
