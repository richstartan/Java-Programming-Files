package controller;

import java.io.IOException;

import model.Forex;
import utility.Input;

public class AccessForex {
	
	public String message = "\nFinished execution."; // instance variable
	public static void main(String[] args) throws IOException {
		
		//creating an object
		Forex forex = new Forex();
		forex.pesoAmount = Input.readDouble("Enter peso amount");
		forex.currencyType = Input.readString("Enter currency [USD, EUR, JPY]");
	
	//once all the input variables are populated, call the
	//business logic method of Forex
				
		forex.compute();
		forex.display();
		
	
		// AccessForex obj = new AccessForex();
		System.out.println(new AccessForex().message); // call the instance variable message
		//obj.printMessage(); // call the instance method printMessage()
		new AccessForex().printMessage();
	}
	
	public void printMessage() { //instance method
		//	System.out.println(message);
		System.out.println("Thank you for using this application.");
	}

}
