package strategy.StorePrices;

import data.DataGasPump2;
import data.DataStore;
/*
    This class is responsible for storing input price from method Activate into DS for GP-2.
 */
public class StorePrices2 extends StorePrices {

    public StorePrices2(DataStore dataStore) {
        super(dataStore);
    }

    /*
         Read temp variables and save values into DS of GP-1.
     */
    @Override
    public void storePrices() {
        DataGasPump2 d2 = (DataGasPump2) dataStore;
        d2.setSprice2(d2.getTemp_a2());
        d2.setRprice2(d2.getTemp_b2());
        d2.setPprice2(d2.getTemp_c2());
        System.out.println("Successfully activated GasPump-2!!!");
    }
}
