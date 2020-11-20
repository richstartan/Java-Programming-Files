package model;

import pojo.Child2;

public class Child extends Parent {

	/*
	 In Java, performing function override we have to retain
	 the same exact method signature from the class. However,
	 if you want to change the access specifier or modifier,
	 it should be less restrictive than the Parent class.
	 But at the very minimum, it should be the same of
	 the Parent class.
	 */
	
	//perform overriding
	@Override
	/*
	 This function can use default (same accessibility with
	 the Parent class), protected and public access modifiers
 	 when performing overriding.
	 */
	void defaultFunctionMessage() {
		System.out.println("This is the Child defaultFunctionMessage() overridden.");
	}
	
	@Override
	/*
	 This function can use protected (same accessibility with
	 the Parent class) or public access modifiers
 	 when performing overriding.
	 */
	public void protectedFunctionMessage() {
		System.out.println("This is the Child protectedFunctionMessage() overridden.");
	}
	
	@Override
	/*
	 This function can ONLY use the same accessibility with
	 the Parent class which is public) when performing overriding.
	 */
	public void publicFunctionMessage() {
		System.out.println("This is the Child publicFunctionMessage() overridden.");
	}
	
	
	
	
	
	
	
	public static void main(String args[]) {
		Child childObj = new Child();
		childObj.defaultFunctionMessage();
		childObj.protectedFunctionMessage();
		childObj.publicFunctionMessage();
		
		System.out.println("\nfor Child2 execution area.\n");
		Child2 child2Obj = new Child2();
		child2Obj.protectedFunctionMessage();
		child2Obj.publicFunctionMessage();
	}
}
