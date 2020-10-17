package model;

@SuppressWarnings("serial")
public class ForexBean implements java.io.Serializable{
	
	//instance variables declaration
	//input values
	private double pesoAmount; //defaulted to 0.0
	private String currencyType; //defaulted to null
	
	//computed values
	private double convertedAmount; //defaulted to 0.0
	
	public static String programmer; //defaulted to null;

	//now introducing the static block 
	static {
		programmer = "Richie Tan";
	}
	
	//declare a no-arg (no argument constructor
	public ForexBean() {
		pesoAmount = 0;
	}
	
	//parameterized constructor
	public ForexBean (double pesoAmount, String currencyType) {
		this.pesoAmount = pesoAmount;
		this.currencyType = currencyType;
	}
	
	public ForexBean (String currencyType, double pesoAmount) {
		this.pesoAmount = pesoAmount;
		this.currencyType = currencyType;
	}
	
	/////////////////////////
	//setter and getter methods
	public double getPesoAmount() {
		return pesoAmount;
	}

	public void setPesoAmount(double pesoAmount) {
		this.pesoAmount = pesoAmount;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public double getConvertedAmount() {
		return convertedAmount;
	}

	public void setConvertedAmount(double convertedAmount) {
		this.convertedAmount = convertedAmount;
	}

	public void compute() {
		switch (currencyType.toUpperCase()) {
			case "USD":
				convertedAmount = pesoAmount / 48.65; 
				break;
			case "EUR":
				convertedAmount = pesoAmount / 58.1995; 
				break;
			case "JPY":
				convertedAmount = pesoAmount / 0.4706; 
				break;
			default:
				System.err.println("Invalid currency type");
				break;
		}
	}
}
