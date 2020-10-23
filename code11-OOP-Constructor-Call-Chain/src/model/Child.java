package model;

public class Child extends Parent {

	//define constructors
	public Child() { //no argument constructor
		super("hello", -5);
		System.out.println("Child() constructor 1 executed");
		
	}
	
	public Child(String name) {
		System.out.println("Child(String name) constructor 2 executed");
	}
	
	public Child(int number) {
		super();
		System.out.println("Child(int number) constructor "
			+ "3 executed");
	}
	
	public Child (String name, int number) {
		this(100);// or this (10);
		System.out.println("Child(String name, int number) "
			+ "constructor 4 executed");
		//what java statement that I will use to call the clazz
		//variable of the super class to change the value 
		//to "My Parent class"
		super.clazz="My Parent Class";
	}
	
	public Child(int number, String name) {
		System.out.println("Child(int number, String name) "
				+ "constructor 5 executed");
	}
	
	@Override
	public void display() {
		this.clazz = "Child class";
		System.out.println("\n\nI am now in the overridden display method.");
		System.out.println("The name of my base class is " + super.clazz 
			+ " and the name of the subclass is " + this.clazz);
		super.display();
	}
	
}
