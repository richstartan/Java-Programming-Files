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
	
	//method overloading (polymorphism)
	/*
	 Method overloading is the declaration of two or more functions with the same
	 name but with different parameters/arguments in the same class.
	 
	 In method overloading, we care only for the function name and 
	 function parameters/arguments but not the return type.
	 
	 What parts/anatomy of function/method
	 	1. access specifier/modifer (required)
	 	2. return type (required)
	 	3. name (required)
	 	4. argument/parameter (optional)
	 	5. body/scope (mandatory)
	 */
	
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
