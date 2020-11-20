package model;

public class Parent {
	/******************************
		Levels of Accessibility from the most restrictive to least restrictive
			1. private
			2. default
			3. protected
			4. public
	*******************************/
	
	//this will not be inherited and cannot be overridden
	private void privateFunctionMessage() { 
		System.out.println("This is the privateFunctionMessage()");
	}
	
	//this will not be inherited, can be overridden but within the same package only
	void defaultFunctionMessage() {
		System.out.println("This is the defaultFunctionMessage()");
	}
	
	protected void protectedFunctionMessage() {
		System.out.println("This is the protectedFunctionMessage()");
	}
	
	public void publicFunctionMessage() {
		System.out.println("This is the pubicFunctionMessage()");
	}
	
}
