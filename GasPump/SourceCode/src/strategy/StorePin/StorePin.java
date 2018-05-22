package strategy.StorePin;

import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
This is an abstract class for storing pin
*/

public abstract class StorePin {
    DataStore dataStore;

    /*
        GP-2 do not support debit card payment .
     */
    public StorePin() {
    }

    /*
        Constructor for GasPump1 --> Used by StorePin2
    */
    public StorePin(DataStore  dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void storePin();
}
