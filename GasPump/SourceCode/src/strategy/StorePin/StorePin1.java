package strategy.StorePin;

import data.DataGasPump1;
import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
    GasPump2 StoreCash action responsible for updating the shared data structure with the inserted cash amount
    during each transaction
 */
public class StorePin1 extends StorePin {

    public StorePin1(DataStore dataStore) {
        super(dataStore);
    }

    /*
        Read the temporarily cash information input by the InputProcessor
        and store it in the cash attribute of the shared data structure.
        Then, print the amount of cash that was inserted
     */
    @Override
    public void storePin() {
        DataGasPump1 d1 = (DataGasPump1) dataStore;
        d1.setPin(d1.getTemp_p1());        
    }
}
