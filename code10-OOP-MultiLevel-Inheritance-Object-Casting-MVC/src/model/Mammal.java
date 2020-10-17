package model;

import java.io.IOException;

public class Mammal extends Animal {

	//in this case, the String name attribute and the public void display() method
	//are automatically inherited by the Mammal class
	
	//this is the concept of adding methods of the child class
	//making the child class more powerful than the parent class
	public void changeName() {
		this.name = "Mammal class";
	}
	
	public void description() throws IOException {
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\"
				+ "Application\\chrome.exe "
				+ "https://animaldiversity.org/accounts/Mammalia/");
	}
}
