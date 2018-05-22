package strategy.StorePrices;

import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
    This is an abstract class for storing data
 */
public abstract class StorePrices {
    DataStore dataStore;

    public StorePrices(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void storePrices();
}
