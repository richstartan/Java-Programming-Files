package controller;

import java.io.IOException;

import model.Forex;
import utility.Input;

public class AccessForex {

	public String message = "\nFinished execution."; //instance variable
	
	//public static Forex forexArray[] = new Forex[1000];

	public static Forex forex = null; //declaring an object
	
	public static void main(String[] args) throws IOException {
	
	
		double  pesoAmount = Input.readDouble("Enter peso amount");
		String currencyType = Input.readString("Enter curreny [USD, EUR, JPY]");
		
		executeConstructor(currencyType, pesoAmount); //calls the no argument constructor
		
		//once all the input variables are populated, call the 
		//business logic method of Forex
		forex.compute();
		forex.display();
		
		//AccessForex obj = new AccessForex();
		System.out.println(new AccessForex().message); //call the instance variable message
		
		new AccessForex().printMessage();//call the instance method printMessage()
		
		//perform array initialization
		/*String currType = "USD";
		double amount  = 5000;
		
		System.out.println("Memory size before running the array: " 
			+ Runtime.getRuntime().freeMemory());
		for (int counter = 1; counter < forexArray.length; counter++) {
			forexArray[counter] = new Forex(amount+=counter, currType+counter); 
		}
		
		System.out.println("Memory size after running the array: " 
			+ Runtime.getRuntime().freeMemory());
		
		System.gc();
		
		System.out.println("Memory size after calling the gc(): " 
			+ Runtime.getRuntime().freeMemory());*/
	}
	
	public static void executeConstructor() {
		forex = new  Forex(); //object initialization, calls constructor1
	}
	
	public static void executeConstructor(String peraNgBansa, double halagaNgPera) {
		//forex = new  Forex(halagaNgPera, peraNgBansa); //object initialization, calls constructor 2
		forex = new  Forex(peraNgBansa, halagaNgPera); //object initialization, calls constructor 3
	}
	
	public void printMessage() { //instance method
		//System.out.println(message);
		System.out.println("Thank you for using this application.");
	}
}
