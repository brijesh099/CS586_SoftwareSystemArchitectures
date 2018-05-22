package strategy.StoreCash;

import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
This is an abstract class for storing cash
*/

public abstract class StoreCash {
    DataStore dataStore;

    /*
        GP-1 do not support cash payment .
     */
    public StoreCash() {
    }

    /*
        Constructor for GasPump2 --> Used by StoreCash2
        Needs the shared data structure to store information
     */
    public StoreCash(DataStore  dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void storeCash();
}
