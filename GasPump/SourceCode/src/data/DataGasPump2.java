package data;

/**
 * @author Brijesh Mavani
 *
 */

/*
    This is a Data storage class for GP-2. It contains temp and final variables. 
    All variables will be accessed via getters and setters.
 */ 
   
public class DataGasPump2 extends DataStore {
    
    // temporary variables for storing prices
    private float temp_a=0; // Super Gas
    private float temp_b=0;  // Regular Gas 
    private float temp_c=0;  // Premium Gas
    private float temp_cash=0;  // temp cash
   		
	//Main variables
    private float Rprice=0; // Price for pumping one gallon of Regular gas
	private float Sprice=0; // Price for pumping one gallon of Super Gas
	private float Pprice=0; // Price for pumping one gallon of Premium Gas
    
	private float cash=0; // Total deposited cash
	private float total=0; // Total cost
	private float price=0; // Price for pumping one gallon of gasType
	private int L=0; // Total pumped gas in Liters
	private String GasType="";// Type of Gas
	
	// Getters and setters for each variables
	/**
	 * @return the temp_a
	 */
	public float getTemp_a2() {
		return temp_a;
	}
	/**
	 * @param temp_a the temp_a to set
	 */
	public void setTemp_a2(float temp_a) {
		this.temp_a = temp_a;
	}
	/**
	 * @return the temp_b
	 */
	public float getTemp_b2() {
		return temp_b;
	}
	/**
	 * @param temp_b the temp_b to set
	 */
	public void setTemp_b2(float temp_b) {
		this.temp_b = temp_b;
	}
	/**
	 * @return the temp_c
	 */
	public float getTemp_c2() {
		return temp_c;
	}
	/**
	 * @param temp_c the temp_c to set
	 */
	public void setTemp_c2(float temp_c) {
		this.temp_c = temp_c;
	}
	/**
	 * @return the temp_cash
	 */
	public float getTemp_cash() {
		return temp_cash;
	}
	/**
	 * @param temp_cash the temp_cash to set
	 */
	public void setTemp_cash(float temp_cash) {
		this.temp_cash = temp_cash;
	}
	/**
	 * @return the rprice
	 */
	public float getRprice2() {
		return Rprice;
	}
	/**
	 * @param rprice the rprice to set
	 */
	public void setRprice2(float rprice) {
		this.Rprice = rprice;
	}
	/**
	 * @return the sprice
	 */
	public float getSprice2() {
		return Sprice;
	}
	/**
	 * @param sprice the sprice to set
	 */
	public void setSprice2(float sprice) {
		this.Sprice = sprice;
	}
	/**
	 * @return the pprice
	 */
	public float getPprice2() {
		return Pprice;
	}
	/**
	 * @param pprice the pprice to set
	 */
	public void setPprice2(float pprice) {
		this.Pprice = pprice;
	}
	/**
	 * @return the cash
	 */
	public float getCash() {
		return cash;
	}
	/**
	 * @param cash the cash to set
	 */
	public void setCash(float cash) {
		this.cash = cash;
	}
	/**
	 * @return the total
	 */
	public float getTotal2() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal2(float total) {
		this.total = total;
	}
	/**
	 * @return the price
	 */
	public float getPrice2() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice2(float price) {
		this.price = price;
	}
	/**
	 * @return the l
	 */
	public int getL2() {
		return L;
	}
	/**
	 * @param l the l to set
	 */
	public void setL2(int l) {
		this.L = l;
	}
	/**
	 * @return the gasType
	 */
	public String getGasType2() {
		return GasType;
	}
	/**
	 * @param gasType the gasType to set
	 */
	public void setGasType2(String gasType) {
		GasType = gasType;
	}
	
	
	
		
	
}
