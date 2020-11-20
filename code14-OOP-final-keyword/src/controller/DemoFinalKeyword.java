package controller;

import model.*;

public class DemoFinalKeyword {

	public static void main(String[] args) {
		String message = "Welcome to the wonderful "
			+ "of the final keyword.";
		
		message+="\nDemo using the final keyword.\n";
		System.out.println(message);
		
		new Child().message();

	}

}
