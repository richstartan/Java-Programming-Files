package model;

import java.io.IOException;

public class Hawk extends Avian {

	@Override
	public void changeName() {
		this.name = "Hawk class";
	}
	
	@Override
	public void description() throws IOException {
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\"
				+ "Application\\chrome.exe "
				+ "https://www.britannica.com/animal/hawk-bird");
	}
	
	//additional
	public void useful() {
		System.out.println("The great majority of hawks are more useful to humans "
			+ "than they are harmful, but there is still widespread prejudice "
			+ "against them.");
	}
}
