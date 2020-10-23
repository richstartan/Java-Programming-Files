package controller;

import model.Child;
//import model.Parent;

public class DemoConstructorCallChain {

	public static void main(String[] args) {
		Child child = new Child("name",0);
		
		child.display();
		
		if (child instanceof java.lang.Object) {
			System.out.println("child IS AN Object.");
		} else {
			System.err.println("child IS NOT AN Object.");
		}
		
		System.out.println("\nProgram terminated.");
	}

}
