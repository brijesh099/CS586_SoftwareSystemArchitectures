package strategy.SetPrice;

import data.DataGasPump2;
import data.DataStore;

/*
    This class is responsible for updating price based on gas type selected by user for GP-2.    
*/

public class SetPrice2 extends SetPrice {

    public SetPrice2(DataStore dataStore) {
        super(dataStore);
    }

    /*
        Set the price per gallon for this transaction according to the type of gas which was selected to be pumped

        @param g : integer passed in from the EFSM model representing the type of gasoline
        for which the price calculation must be set
        For GasPump2:
        g = 1: Regular gas
        g = 2: Super gas
        g = 3: Premium gas
    */
    @Override
    public void setPrice(int g,int m) {
        DataGasPump2 d2 = (DataGasPump2) dataStore;
        if (g == 1) { // Regular selected
        	if(m==1)
        	{
        		float price = (float) (d2.getRprice2() * 1.1);
        		d2.setPrice2(price);
                d2.setGasType2("Regular");	
        	}
        	else 
        	{
        		d2.setPrice2(d2.getRprice2());
        		d2.setGasType2("Regular");
        	}
        } 
        else if (g == 2) { // Super selected
        	
        	if(m==1) {
        		float price = (float) (d2.getSprice2() * 1.1);
        		d2.setPrice2(price);
                d2.setGasType2("Super");
        	}
        	else {
        		d2.setPrice2(d2.getSprice2());
                d2.setGasType2("Super");	
        	}                
        } 
        else if (g == 3) { // Premium selected
        	if(m==1) {
        		float price = (float) (d2.getPprice2() * 1.1);
        		d2.setPrice2(price);
                d2.setGasType2("Premium");
        	}
        	else {
        		d2.setPrice2(d2.getPprice2());
        		d2.setGasType2("Premium");
        	}
        }
        System.out.println(d2.getGasType2() + " gasoline selected @ price of $" + d2.getPrice2() + "/liter");
        System.out.println("Select (s) to start the pump");
    }
}
