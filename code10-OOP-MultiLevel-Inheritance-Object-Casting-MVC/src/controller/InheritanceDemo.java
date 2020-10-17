package controller;

import model.*;
import view.Display;

import java.io.*;

public class InheritanceDemo {

	public static void main(String[] args) throws IOException {
		
		//declare a generic animal
		Animal hayop = null;
		
		//morph animal to dog
		hayop = new Canine(); //object casting widening
		//Display.print(hayop);
		
		//morph to owl
		hayop = new Owl();
		//Display.print(hayop);
		
		//morph to komodo dragon
		hayop = new KomodoDragon();
		//Display.print(hayop);
		
		//morph to Reptile generic class
		hayop = new Reptile();
		//Display.print(hayop);
		
		//morph to Animal class
		hayop = new Animal();
		Display.print(hayop);
		
	}

}
