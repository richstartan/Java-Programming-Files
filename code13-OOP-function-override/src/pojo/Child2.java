package pojo;

import model.Child;
import model.Parent;

public class Child2 extends Parent {

	@Override
	/*
	 This function can use protected (same accessibility with
	 the Parent class) or public access modifiers
 	 when performing overriding.
	 */
	public void protectedFunctionMessage() {
		System.out.println("This is the " + getClass().getName() 
				+ " protectedFunctionMessage() overridden.");
	}
	
	@Override
	/*
	 This function can ONLY use the same accessibility with
	 the Parent class which is public) when performing overriding.
	 */
	public void publicFunctionMessage() {
		System.out.println("This is the " + getClass().getName() 
			+ " publicFunctionMessage() overridden.");
	}
	
	public static void main(String args[]) {
		
		System.out.println("\nfor Child2 execution area.\n");
		Child2 child2Obj = new Child2();
		child2Obj.protectedFunctionMessage();
		child2Obj.publicFunctionMessage();
	}
}
