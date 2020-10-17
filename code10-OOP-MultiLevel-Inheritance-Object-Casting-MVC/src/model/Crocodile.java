package model;

import java.io.IOException;

public class Crocodile extends Reptile {

	@Override
	public void changeName() {
		this.name = getClass().getName()+ " class"; //fully qualified class name
	}
	
	@Override
	public void description() throws IOException {
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\"
				+ "Application\\chrome.exe "
				+ "https://www.britannica.com/animal/Crocodylidae");
	}
	
	//additional
	public void habitat() {
		System.out.println("lives in swamp");
	}
}
