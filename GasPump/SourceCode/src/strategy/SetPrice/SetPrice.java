package strategy.SetPrice;

import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
This is an abstract class for setting a price. 
*/
public abstract class SetPrice {
    DataStore dataStore;

    public SetPrice(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void setPrice(int g,int m);
}
