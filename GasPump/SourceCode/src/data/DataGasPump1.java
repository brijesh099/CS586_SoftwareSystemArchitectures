package data;

/**
 * @author Brijesh Mavani
 *
 */

/*
    This is a Data storage class for GP-1. It contains temp and final variables. 
    All variables will be accessed via getters and setters.
 */
 
public class DataGasPump1 extends DataStore {
    
    // temporary variables for storing prices
    private float temp_a=0; // Regular Gas
    private float temp_b=0;  // Diesel 
	private String temp_p="";  // debit card pin 
	
	//Main variables
	private String pin=""; // Actual Pin
	private float price=0; // Price for pumping one gallon of gasType
	private int G=0; // Total pumped gas in gallons
	private float total=0; // Total cost
	private float Rprice=0; // Price for pumping one gallon of Regular gas
	private float Dprice=0; // Price for pumping one gallon of Diesel
	private String GasType=""; // Type of gas
	
	
	// Getters methods for each variables
	
	public float getTemp_a1() {
		return temp_a;
	}
	
	public float getTemp_b1(){
		return temp_b;
	}
	
	public String getTemp_p1(){
		return temp_p;
	}
	
	public String getPin(){
		return pin;
	}
	
	public float getPrice1(){
		return price;
	}
	
	public int getG1(){
		return G;
	}
	
	public float getTotal1(){
		return total;
	}
	
	public float getRprice1(){
		return Rprice;
	}
	
	public float getDprice1(){
		return Dprice;
	}
	
	
	
	// setter methods for all variables
	
	public void setTemp_a1(float a) {
		this.temp_a = a;
	}
	
	public void setTemp_b1(float b) {
		this.temp_b = b;
	}
	
	public void setTemp_p1(String p) {
		this.temp_p = p;
	}
	
	public void setPin(String p) {
		this.pin = p;
	}
	
	public void setPrice1(float p) {
		this.price = p;
	}
	
	public void setG1(int g) {
		this.G = g;
	}
	
	public void setTotal1(float t) {
		this.total = t;
	}
	
	public void setRprice1(float rp) {
		this.Rprice = rp;
	}
	
	public void setDprice1(float dp) {
		this.Dprice = dp;
	}

	/**
	 * @return the gasType
	 */
	public String getGasType1() {
		return GasType;
	}

	/**
	 * @param gasType the gasType to set
	 */
	public void setGasType1(String gasType) {
		GasType = gasType;
	}
	 
	
	
}
