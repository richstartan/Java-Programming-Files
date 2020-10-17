package controller;

import java.io.IOException;

import utility.Input;

public class ArrayDeclarationDefaultValues {

	public static void main(String[] args) throws IOException {
		
		int arraySize = Input.readInt("Enter array size");
		
		//declare primitive data for arrays
		int intNumber[] = new int[arraySize];
		char charArray[] = new char[arraySize];
		double doubleNumber[] = new double[arraySize];
		boolean booleanState[] = new boolean[arraySize];
		float floatNumber[] = new float[10];
		
		//declare an object type for an array
		String stringArray[] = new String[arraySize];
		
		printArray(intNumber); //for integer array
		printArray(charArray); //for character array
		printArray(doubleNumber); //for double array
		printArray(booleanState); //for boolean array
		printArray(stringArray); //for String array
		printArray(floatNumber); //for float array
	
	}
	
	public static void printArray(int [] value) {
		System.out.println("Printing integer array default values");
		System.out.println("--------------------------------------");
		for (int counter = 0; counter < value.length; counter++) {
			System.out.println("number[" + counter + "]: " + value[counter]);
		}
	}
	
	public static void printArray(char [] value) {
		System.out.println("\nPrinting character array default values");
		System.out.println("--------------------------------------");
		for (int counter = 0; counter < value.length; counter++) {
			System.out.println("number[" + counter + "]: " + value[counter]);
		}
	}
	
	public static void printArray(double [] value) {
		System.out.println("\nPrinting double array default values");
		System.out.println("--------------------------------------");
		for (int counter = 0; counter < value.length; counter++) {
			System.out.println("number[" + counter + "]: " + value[counter]);
		}
	}
	
	public static void printArray(boolean [] value) {
		System.out.println("\nPrinting boolean array default values");
		System.out.println("--------------------------------------");
		for (int counter = 0; counter < value.length; counter++) {
			System.out.println("number[" + counter + "]: " + value[counter]);
		}
	}
	
	public static void printArray(String [] value) {
		System.out.println("\nPrinting String array default values");
		System.out.println("--------------------------------------");
		for (int counter = 0; counter < value.length; counter++) {
			System.out.println("number[" + counter + "]: " + value[counter]);
		}
	}
	
	public static void printArray(float [] value) {
		System.out.println("\nPrinting float array default values");
		System.out.println("--------------------------------------");
		
		/*
		 public class ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException

			Thrown to indicate that an array has been accessed with an illegal index. The index 
			is either negative or greater than or equal to the size of the array.
		 */
		//System.out.println("value of index 10: " + value[10]); //will result to a java.lang.ArrayIndexOutOfBoundsException
		
		for (int counter = 0; counter < value.length; counter++) {
			System.out.println("number[" + counter + "]: " + value[counter]);
		}
	}
}
