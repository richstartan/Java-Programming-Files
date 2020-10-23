package controller;

import model.Engine;
import model.Car;

public class DemoAggregateRelationship {

	public static void main(String[] args) {
		
		System.out.println("Demo of Aggregate Relationship Constructor Dependency Injection");
		Engine engine = new Engine(4, "SOHC i-VTEC(R18A)", 2);
		
		Car hondaCivic = new Car("Honda Civic",2020, 2000000, "black", true, 
			true, 8, engine);
		
		//implicitly equivalent to System.out.println(hondaCivic.toString())
		System.out.println(hondaCivic);  
		System.out.println(hondaCivic.getEngine());
		
		System.out.println("\n--------------------------------");
		System.out.println("Demo of Aggregate Relationship Setter Dependency Injection");
		
		Car hondaCivic2 = new Car("Honda Civic",2020, 1200000, "black", true, 
				true, 8);
		
		Engine swapEngine = new Engine(4, "SOHC F series shortblock", 3);
		
		//now perform engine placement inside the car
		hondaCivic2.setEngine(swapEngine);
		
		System.out.println(hondaCivic2);
		System.out.println(hondaCivic2.getEngine());
	}

}
