package strategy.PrintReceipt;

import data.DataGasPump1;
import data.DataStore;

/**
 * @author Brijesh Mavani
 *
 */
/*
    This class is responsible for printing a receipt for GP-1.
 */
public class PrintReceipt1 extends PrintReceipt {

    public PrintReceipt1(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void printReceipt() {
    	DataGasPump1 d1 = (DataGasPump1) dataStore;
        System.out.println("### Here is your receipt ###");
        System.out.println("*********************************************************************");        
        System.out.println("Gasoline type: " +d1.getGasType1());        
        System.out.println("Total pumped gallons: "+d1.getG1());
        System.out.println("Cost per gallon: $" + d1.getPrice1());
        System.out.println("Total cost: $" +(float) d1.getTotal1());
        System.out.println("*********************************************************************");
        System.out.println("Transaction completed!!!");
    }
}
