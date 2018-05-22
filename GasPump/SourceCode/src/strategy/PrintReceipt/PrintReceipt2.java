package strategy.PrintReceipt;

import data.DataGasPump2;
import data.DataStore;

/**
 * @author Brijesh Mavani
 *
 */
/*
    This class is responsible for printing a receipt for GP-2.
 */
public class PrintReceipt2 extends PrintReceipt {

    public PrintReceipt2(DataStore dataStore) {
        super(dataStore);
    }

    @Override
    public void printReceipt() {
    	DataGasPump2 d2 = (DataGasPump2) dataStore;
    	System.out.println("### Here is your receipt ###");
        System.out.println("*********************************************************************");        
        System.out.println("Gasoline type: " +d2.getGasType2());        
        System.out.println("Total pumped liters: "+d2.getL2());
        System.out.println("Cost per liter: $" + d2.getPrice2());
        System.out.println("Total cost: $" + (float)d2.getTotal2());
        System.out.println("*********************************************************************");
        System.out.println("Transaction completed!!!");
        
    }
}
