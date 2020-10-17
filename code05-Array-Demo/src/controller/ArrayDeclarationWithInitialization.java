package controller;

public class ArrayDeclarationWithInitialization {
	
	public static void main(String[] args) {
		
		int number[] = {7, 6, 41, 42, 32, 15};
		boolean state[] = {true, false, false, true, false};
		String subject[] = {"Java Elective", "Quantitative Methods", 
			"System Integration and Architecture"};
		
		printArray(number);
		printArray(state);
		printArray(subject);
	}
	
	public static void printArray(int [] value) {
		System.out.println("Printing integer array default values using for..each loop");
		System.out.println("--------------------------------------");
		System.out.print("My favorite Lotto numbers are: ");
		for (int number : value) {
			System.out.print(number + " ");
		}
	}
	
	public static void printArray(boolean [] value) {
		System.out.println("\n\nPrinting boolean array default values using for..each loop");
		System.out.println("--------------------------------------");
		for (boolean state : value) {
			System.out.print(state + " ");
		}
	}

	public static void printArray(String [] value) {
		System.out.println("\n\nPrinting String array default values using for..each loop");
		System.out.println("--------------------------------------------");
		System.out.print("My subjects enrolled for this term are: ");
		for (String number : value) {
			System.out.print(number + ", ");
		}
	}
}
