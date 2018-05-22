package strategy.PumpGasUnit;

import data.DataGasPump1;
import data.DataStore;

/**
 * @author Brijesh Mavani
 *
 */

/*
    This class is responsible for dispensing/pumping one gallon of gasoline for GP-1. 
 */
public class PumpGasUnit1 extends PumpGasUnit {

    public PumpGasUnit1(DataStore dataStore) {
        super(dataStore);
    }

    /*
        Dispense gallon of gas and update the count. 
     */
    
    @Override
    public void pumpGasUnit() {
        DataGasPump1 d1 = (DataGasPump1) dataStore;
        
        d1.setG1(d1.getG1()+1);   // Increment the count 
        d1.setTotal1(d1.getPrice1() * d1.getG1());  // update the total cost
    }
}
