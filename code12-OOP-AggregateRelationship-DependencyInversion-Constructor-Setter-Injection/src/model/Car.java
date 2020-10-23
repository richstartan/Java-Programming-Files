package model;

public class Car {

	private String name;
	private int yearModel;
	private double price;
	private String color;
	private boolean isLimitedEdition;
	private boolean isAutomatic;
	private int totalGears;
	
	//HAS-relationship
	//note avoid hard dependency
	private Engine engine; //defaulted to null 

	public Car() {
	}

	//constructor dependency injection
	public Car(String name, int yearModel, double price, String color,
			boolean isLimitedEdition, boolean isAutomatic, int totalGears,
			Engine engine) {
		this.name = name;
		this.yearModel = yearModel;
		this.price = price;
		this.color = color;
		this.isLimitedEdition = isLimitedEdition;
		this.isAutomatic = isAutomatic;
		this.totalGears = totalGears;
		this.engine = engine;
	}
	
	//constructor declaration without dependency injection1
	public Car(String name, int yearModel, double price, String color,
			boolean isLimitedEdition, boolean isAutomatic, int totalGears) {
		this.name = name;
		this.yearModel = yearModel;
		this.price = price;
		this.color = color;
		this.isLimitedEdition = isLimitedEdition;
		this.isAutomatic = isAutomatic;
		this.totalGears = totalGears;
	}

	//setter dependency injection 
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isLimitedEdition() {
		return isLimitedEdition;
	}

	public void setLimitedEdition(boolean isLimitedEdition) {
		this.isLimitedEdition = isLimitedEdition;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

	public int getTotalGears() {
		return totalGears;
	}

	public void setTotalGears(int totalGears) {
		this.totalGears = totalGears;
	}

	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\nModel: " + this.yearModel + "\nPrice: Php" + this.price
			+ "\nColor: " + this.color + "\nLimited Edition: " +((this.isLimitedEdition)?"Yes":"No") 
			+ "\nGears: " + totalGears  
			+ "\nTransmission Type: " +((this.isAutomatic)?"Automatic":"Manual" 
			); 
	}
}
