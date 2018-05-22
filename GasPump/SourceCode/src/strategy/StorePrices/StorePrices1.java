package strategy.StorePrices;

import data.DataGasPump1;
import data.DataStore;
/*
    This class is responsible for storing input price from method Activate into DS for GP-1.
 */
public class StorePrices1 extends StorePrices {

    public StorePrices1(DataStore dataStore) {
        super(dataStore);
    }

    /*
        Read temp variables and save values into DS of GP-1.
     */
    @Override
    public void storePrices() {
        DataGasPump1 d1 = (DataGasPump1) dataStore;
        d1.setRprice1(d1.getTemp_a1());
        d1.setDprice1(d1.getTemp_b1());
        System.out.println("Successfully activated GasPump-1!!!");
    }
}
