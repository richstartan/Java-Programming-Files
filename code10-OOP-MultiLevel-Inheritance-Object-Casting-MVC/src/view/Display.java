package view;

import model.*; //all classes, interfaces and exceptions will be imported

public class Display {

	public static void print(Animal objAnimal) throws java.io.IOException {
		
		if (objAnimal instanceof Canine) {
			Canine aso = (Canine) objAnimal; //object casting narrowing
			aso.changeName();
			aso.name += " - Wonder Dog"; //same as cat.name = cat.name + "Felix the Cat";
			aso.displayName();
			aso.bark();
			aso.description();
		} else if (objAnimal instanceof Feline) {
			Feline cat = (Feline) objAnimal; //object casting narrowing
			cat.changeName();
			cat.name += " - Felix the Cat"; //same as cat.name = cat.name + "Felix the Cat";
			cat.displayName();
			cat.displayLives();
			cat.description();
		} else if (objAnimal instanceof Hawk) {
			Hawk lawin = (Hawk) objAnimal; //object casting narrowing
			lawin.changeName();
			lawin.displayName();
			lawin.useful();
			lawin.description();
		} else if (objAnimal instanceof Crocodile) {
			Crocodile buwaya = (Crocodile) objAnimal; //object casting narrowing
			buwaya.changeName();
			buwaya.displayName();
			buwaya.habitat();
			buwaya.description();
		} else if (objAnimal instanceof KomodoDragon) {
			KomodoDragon bayawak = (KomodoDragon) objAnimal; //object casting narrowing
			bayawak.changeName();
			bayawak.displayName();
			bayawak.size();
			bayawak.description();
		} else if (objAnimal instanceof Owl) {
			Owl kuwago = (Owl) objAnimal; //object casting narrowing
			kuwago.changeName();
			kuwago.displayName();
			kuwago.symbolOfIntelligence();
			kuwago.description();
		} else if (objAnimal instanceof Mammal) {
			Mammal mammal = (Mammal) objAnimal; //object casting narrowing
			mammal.changeName();
			mammal.displayName();
			mammal.description();
		} else if (objAnimal instanceof Reptile) {
			Reptile reptilya = (Reptile) objAnimal; //object casting narrowing
			reptilya.changeName();
			reptilya.displayName();
			reptilya.description();
		} else if (objAnimal instanceof Avian) {
			Avian avian = (Avian) objAnimal; //object casting narrowing
			avian.changeName();
			avian.displayName();
			avian.description();
		} else if (objAnimal instanceof Animal) {
			objAnimal.displayName();
		}
	}
}
