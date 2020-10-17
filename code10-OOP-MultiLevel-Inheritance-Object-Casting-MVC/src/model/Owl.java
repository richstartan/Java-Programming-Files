package model;

import java.io.IOException;

public class Owl extends Avian {

	@Override
	public void changeName() {
		this.name = "Owl class";
	}
	
	@Override
	public void description() throws IOException {
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\"
				+ "Application\\chrome.exe "
				+ "https://www.britannica.com/animal/owl");
	}
	
	//additional
	public void symbolOfIntelligence() {
		System.out.println("The bird of Athena, the Greek goddess of practical reason,"
				+ " is the little owl (Athene noctua). Owls became symbolic of "
				+ "intelligence because it was thought that they presaged events.");
	}
}
