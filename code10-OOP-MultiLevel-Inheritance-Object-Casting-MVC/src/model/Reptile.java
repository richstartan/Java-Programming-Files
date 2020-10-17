package model;

import java.io.IOException;

public class Reptile extends Animal {

	public void changeName() {
		this.name = "Reptile class";
	}
	
	public void description() throws IOException {
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\"
			+ "Application\\chrome.exe "
			+ "https://www.britannica.com/animal/reptile");
	}
}
