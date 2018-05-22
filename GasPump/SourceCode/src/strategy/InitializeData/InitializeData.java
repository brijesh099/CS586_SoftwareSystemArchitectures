package strategy.InitializeData;

import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
This is an abstract class for setting an initial values for price and cash. 
*/
public abstract class InitializeData {
    DataStore dataStore;

    public InitializeData(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void initializeData();
}
