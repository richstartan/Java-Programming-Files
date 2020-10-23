package model;

public class Parent {
	//member instance variable
	public String clazz = "Parent class";
	
	//define constructors
	public Parent() { //no argument constructor
		System.out.println("Parent() constructor 1 executed");
	}
	
	public Parent(String name) {
		this(23, "happy Friday");
		System.out.println("Parent(String name) constructor 2 executed: "
			+ name);
	}
	
	public Parent(int number) {
		System.out.println("Parent(int number) constructor 3 executed");
	}
	
	public Parent (String name, int number) {
		System.out.println("Parent(String name, int number) constructor 4 executed");
	}
	
	public Parent(int number, String name) {
		System.out.println("Parent(int number, String name) constructor 5 "
			+ "executed: [" + number + ", " + name);
	}
	
	//member instance method
	public void display() {
		System.out.println(clazz);
	}
}
