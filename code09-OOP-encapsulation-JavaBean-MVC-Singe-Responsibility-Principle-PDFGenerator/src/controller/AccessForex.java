package controller;

import java.io.IOException;

import model.ForexBean;
import utility.Input;
import view.Display;

public class AccessForex {

	public static void main(String[] args) throws IOException {
		
		double pesoAmount = Input.readDouble("Enter peso amount");
		String currencyType = Input.readString("Enter curreny [USD, EUR, JPY]");
		
		if (pesoAmount > 0 && currencyType.trim().length() > 0) {
			//input value initialization using parameterized constructor
			//ForexBean forex = new ForexBean(currencyType, pesoAmount);
			
			ForexBean forex = new ForexBean();
			//input value initialization using setter methods
			forex.setPesoAmount(pesoAmount);
			forex.setCurrencyType(currencyType);
			
			forex.compute();	
			
			//call view for output display to user
			Display.print(forex);
		} else {
			System.err.println("You entered invalid input.");
		}
		
	}
}
