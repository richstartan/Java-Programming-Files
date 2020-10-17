package model;

import java.io.IOException;

public class Avian extends Animal {
	
	public void changeName() {
		this.name = "Avian class";
	}
	
	public void description() throws IOException {
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\"
			+ "Application\\chrome.exe "
			+ "https://www.britannica.com/animal/bird-animal/Classification");
	}
}
