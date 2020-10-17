package model;

import java.io.IOException;

public class Feline extends Mammal {

	@Override
	public void changeName() {
		this.name = "Feline class";
	}
	
	@Override
	public void description() throws IOException {
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\"
				+ "Application\\chrome.exe "
				+ "https://www.britannica.com/animal/feline");
	}
	
	//additional
	public void displayLives() {
		System.out.println("Cats have nine lives...");
	}
}
