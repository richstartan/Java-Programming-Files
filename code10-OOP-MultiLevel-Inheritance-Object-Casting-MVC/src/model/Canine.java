package model;

import java.io.IOException;

public class Canine extends Mammal {

	@Override
	public void changeName() {
		this.name = "Canine class";
	}
	
	@Override
	public void description() throws IOException {
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\"
				+ "Application\\chrome.exe "
				+ "https://www.britannica.com/animal/canine");
	}
	
	//additional
	public void bark() {
		System.out.println("Aww.aww...grrrr...grrr.....");
	}
}
