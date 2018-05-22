package strategy.ReturnCash;

import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
This is an abstract class for ReturnCash action
*/

public abstract class ReturnCash {
    DataStore dataStore;

    /*
        GP-1 do not support cash payment method. Hence, constructor will not be called for GP-1.
     */
    public ReturnCash() {
    }

    /*
        This is GP-2 constructor which do support cash payments. 
     */
    public ReturnCash(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void returnCash();
}
