package model;

public class Child extends Parent {

	@Override
	public void message() {
		System.out.println("message from "
			+ "the Child class.");
	}
}
