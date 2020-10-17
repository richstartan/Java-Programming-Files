package view;

import model.ForexBean;

public class Display {

	public static void print(ForexBean forex) {
		System.out.println("\nThe Philippine peso amount of " 
			+ forex.getPesoAmount() + " is " + forex.getCurrencyType()
			+ forex.getConvertedAmount()+".");
		
		System.out.println("\nprogrammed by " + ForexBean.programmer);
	}
	
	public static void printWelcomeMessage() {
		System.out.println("Welcome to the Wonderful World of Forex class.");
	}
}
