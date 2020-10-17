package model;

import java.io.IOException;

public class KomodoDragon extends Reptile {

	@Override
	public void changeName() {
		this.name = getClass().getName()+ " class"; //fully qualified class name
	}
	
	@Override
	public void description() throws IOException {
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\"
				+ "Application\\chrome.exe "
				+ "https://www.britannica.com/animal/Komodo-dragon");
	}
	
	//additional
	public void size() {
		System.out.println("The lizard grows to 3 metres (10 feet) in total "
			+ "length and attains a weight of about 135 kg (about 300 pounds).");
	}
}
