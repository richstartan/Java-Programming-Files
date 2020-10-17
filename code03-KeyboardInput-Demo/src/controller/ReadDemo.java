package controller;

import java.io.IOException;

import utility.Input;
public class ReadDemo {
		// TODO Auto-generated method stub
		
		public static void main (String[]args) throws IOException {
			String name = Input.readString("Enter name");
			int faveNumber = Input.readInt("Enter your favorite number");
			double gwa = Input.readDouble("What is your target GWA for this term?");
			
			System.out.println("Hello, " + name);
			
			if ((faveNumber % 2) == 1) {
				System.out.println("Your favorite number " + faveNumber
						+ "is an ODD number");
			} else {
				System.out.println("Your favorite number " + faveNumber
						+ " is an EVEN number");
			}
			
//			String message = ((faveNumber % 2) == 1)?"Your favorite number " + faveNumber
//					+ " is an ODD number."
//					:"Your favorite number " + faveNumber
//					+ " is an EVEN number."
					
			System.out.println(((faveNumber % 2) == 1)?"Your favorite number (part 2) " + faveNumber
					+ " is an ODD number."
					:"Your favorite number (part 2) " + faveNumber
					+ " is an EVEN number.");
					
			System.out.println("I hope that you will get your target GWA of "
					+ gwa + " for this online term.");
		}

	}


