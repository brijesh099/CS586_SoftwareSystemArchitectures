package strategy.PumpGasUnit;

import data.DataGasPump2;
import data.DataStore;

/**
 * @author Brijesh Mavani
 *
 */

/*
    This class is responsible for dispensing/pumping one liter of gasoline for GP-2. 
 */
public class PumpGasUnit2 extends PumpGasUnit {

    public PumpGasUnit2(DataStore dataStore) {
        super(dataStore);
    }

    /*
        Dispense gallon of gas and update the count. 
     */
    
    @Override
    public void pumpGasUnit() {
        DataGasPump2 d2 = (DataGasPump2) dataStore;
        
        d2.setL2(d2.getL2()+1);  // Increment the count 
        d2.setTotal2(d2.getPrice2() * d2.getL2());  // update the total cost
    }
}
